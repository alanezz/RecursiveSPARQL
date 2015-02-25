package com.hp.hpl.jena.sparql.lang;

import java.util.*;

import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.graph.NodeFactory;
import com.hp.hpl.jena.graph.compose.Union;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.DatasetFactory;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.sparql.core.DatasetGraph;
import com.hp.hpl.jena.sparql.graph.GraphFactory;

public class RecursiveNode {
	
	static public final String NL = System.getProperty("line.separator") ; 
	public ArrayList<String> InnerQueries;
	public ArrayList<String[]> QueriesConstruct;
	public String Prefix;
	public String OuterQuery;
	public RecursiveNode()
	{
		InnerQueries = new ArrayList<String>();
		QueriesConstruct = new ArrayList<String[]>();
		Prefix = "";
		OuterQuery = "";
	}
	
	public void init(String queryString)
	{
		//Obtenemos el prefijo
		String aux = queryString;
		while(aux.contains("PREFIX"))
		{
			int index = aux.indexOf('>');
			Prefix = Prefix + aux.substring(0,index+1) + NL;
			aux = aux.substring(index+1);
			aux = aux.trim();
		}
		aux = aux.trim();
		while(aux.contains("WITH RECURSIVE"))
		{
			Stack<String> brackets = new Stack<String>();
			for (int i = 0; i<aux.length();i++)
			{
				if(aux.charAt(i)=='{')
				{
					brackets.push("{");
				}
				else if(aux.charAt(i)=='}')
				{
					brackets.pop();
					if(brackets.size()==0)
					{
						String s = aux.substring(0,i+1);
						aux = aux.substring(i+1);
						aux = aux.trim();
						InnerQueries.add(s);
						break;
					}
				}
			}
		}
		OuterQuery = Prefix + NL + aux;
		
		String PrefixCopy = new String(Prefix);
		HashMap<String, String> prefixes = new HashMap<String, String>();
		PrefixCopy = PrefixCopy.trim();
		while(PrefixCopy.length()!=0)
		{
			int a = PrefixCopy.indexOf(" ");
			PrefixCopy = PrefixCopy.substring(a).trim();
			int b = PrefixCopy.indexOf(":");
			String daKey = PrefixCopy.substring(0,b).trim();
			PrefixCopy = PrefixCopy.substring(b+1).trim();
			int c = PrefixCopy.indexOf(">");
			String daValue = PrefixCopy.substring(1,c);
			PrefixCopy = PrefixCopy.substring(c+1).trim();
			prefixes.put(daKey, daValue);
			
		}
		
		
		for(String query : InnerQueries)
		{
			String[] auxArray = new String[2];
			String auxQuery = query;
			auxQuery = auxQuery.replace("WITH RECURSIVE", "");
			auxQuery = auxQuery.trim();
			int auxIndex = auxQuery.indexOf(" ");
			auxArray[0] = auxQuery.substring(0,auxIndex);
			
			//Para permitir prefix en la declaración del with recursive...
			if(auxArray.length>0)
			{
				if(!auxArray[0].contains("http://"))
				{
					String[] nextURI = auxArray[0].split(":");
					auxArray[0] = prefixes.get(nextURI[0])+nextURI[1];

				}
			}
			auxQuery = auxQuery.substring(auxIndex);
			auxQuery = auxQuery.replace("AS", "");
			auxQuery = auxQuery.trim();
			auxArray[1] = Prefix + NL + auxQuery.substring(1,auxQuery.length()-1);
			QueriesConstruct.add(auxArray);
		}
		
	}
	
	public static void execQueryWithoutUnion(Dataset ds, Query recursiveQuery, String recursiveURI)
	{
		int countPrev = 0;
		int countNow = 0;
		Model workingGraph = ModelFactory.createDefaultModel();
		//dsg.addGraph(NodeFactory.createURI(recursiveURI), workingGraph);
		//Query queryRecursive = QueryFactory.create(recursiveQuery);
		
		
		Model baseGraph;
		Model returnGraph = ModelFactory.createDefaultModel();
		if(ds.containsNamedModel(recursiveURI))
		{
			baseGraph = ds.getNamedModel(recursiveURI);	
		}
		else
		{
			baseGraph = ModelFactory.createDefaultModel();
		}
		
		QueryExecution qexec;
		while(true)
		{
			qexec = QueryExecutionFactory.create(recursiveQuery, ds);
			Model aux = qexec.execConstruct();
			countNow = aux.getGraph().size();
			if(countNow == countPrev)
			{
				break;
			}
			else
			{
				workingGraph = aux.difference(returnGraph);
				returnGraph = returnGraph.union(workingGraph);
				//Model union = workingGraph.union(baseGraph);
				ds.addNamedModel(recursiveURI, workingGraph);
				countPrev = countNow;
				
			}
			

		}
		ds.addNamedModel(recursiveURI, returnGraph);
		//Model returnGraph;
		
		
		

		
	} 
}
