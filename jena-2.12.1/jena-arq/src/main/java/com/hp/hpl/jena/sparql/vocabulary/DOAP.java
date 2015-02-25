/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hp.hpl.jena.sparql.vocabulary ;

/* CVS $Id: $ */
 
import com.hp.hpl.jena.rdf.model.Model ;
import com.hp.hpl.jena.rdf.model.ModelFactory ;
import com.hp.hpl.jena.rdf.model.Property ;
import com.hp.hpl.jena.rdf.model.Resource ;
 
/**
 * Vocabulary definitions from doap.ttl 
 * @author Auto-generated by schemagen on 10 Oct 2007 16:43 
 */
public class DOAP {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://usefulinc.com/ns/doap#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>Developer of software for the project.D�veloppeur pour le projet.Desarrollador 
     *  de software para el proyecto.</p>
     */
    public static final Property developer = m_model.createProperty( "http://usefulinc.com/ns/doap#developer" );
    
    /** <p>Repository for anonymous access.Repositorio para acceso an�nimo.D�p�t pour 
     *  acc�s anonyme.</p>
     */
    public static final Property anon_root = m_model.createProperty( "http://usefulinc.com/ns/doap#anon-root" );
    
    /** <p>A name of something.El nombre de algo.Le nom de quelque chose.</p> */
    public static final Property name = m_model.createProperty( "http://usefulinc.com/ns/doap#name" );
    
    /** <p>Nom du module d'un d�p�t CVS, BitKeeper ou Arch.Module name of a CVS, BitKeeper 
     *  or Arch repository.Nombre del m�dulo de un repositorio CVS, BitKeeper o Arch.</p>
     */
    public static final Property module = m_model.createProperty( "http://usefulinc.com/ns/doap#module" );
    
    /** <p>Proveedor de traducciones al proyecto.Collaborateur � la traduction du projet.Contributor 
     *  of translations to the project.</p>
     */
    public static final Property translator = m_model.createProperty( "http://usefulinc.com/ns/doap#translator" );
    
    /** <p>Page web � partir de laquelle on peut t�l�charger le programme.P�gina web 
     *  de la cu�l se puede bajar el software.Web page from which the project software 
     *  can be downloaded.</p>
     */
    public static final Property download_page = m_model.createProperty( "http://usefulinc.com/ns/doap#download-page" );
    
    /** <p>URI of download associated with this release.</p> */
    public static final Property file_release = m_model.createProperty( "http://usefulinc.com/ns/doap#file-release" );
    
    /** <p>Descripci�n en texto plano de un proyecto, de 2 a 4 enunciados de longitud.Texte 
     *  descriptif d'un projet, long de 2 � 4 phrases.Plain text description of a 
     *  project, of 2-4 sentences in length.</p>
     */
    public static final Property description = m_model.createProperty( "http://usefulinc.com/ns/doap#description" );
    
    /** <p>Indentificador de la versi�n de un release de software.Identifiant de r�vision 
     *  d'une release du programme.Revision identifier of a software release.</p>
     */
    public static final Property revision = m_model.createProperty( "http://usefulinc.com/ns/doap#revision" );
    
    /** <p>D�veloppeur principal d'un projet, un meneur du projet.Maintainer of a project, 
     *  a project leader.Desarrollador principal de un proyecto, un l�der de proyecto.</p>
     */
    public static final Property maintainer = m_model.createProperty( "http://usefulinc.com/ns/doap#maintainer" );
    
    /** <p>Page web avec des captures d'�cran du projet.Web page with screenshots of 
     *  project.P�gina web con capturas de pantalla del proyecto.</p>
     */
    public static final Property screenshots = m_model.createProperty( "http://usefulinc.com/ns/doap#screenshots" );
    
    /** <p>Un tester u otro proveedor de control de calidad.Un testeur ou un collaborateur 
     *  au contr�le qualit�.A tester or other quality control contributor.</p>
     */
    public static final Property tester = m_model.createProperty( "http://usefulinc.com/ns/doap#tester" );
    
    /** <p>D�p�t du code source.Source code repository.Repositorio del c�digo fuente.</p> */
    public static final Property repository = m_model.createProperty( "http://usefulinc.com/ns/doap#repository" );
    
    /** <p>Une release (r�vision) d'un projet.A project release.Un release (versi�n) 
     *  de un proyecto.</p>
     */
    public static final Property release = m_model.createProperty( "http://usefulinc.com/ns/doap#release" );
    
    /** <p>El URL de la antigua p�gina de un proyecto, asociada con exactamente un proyecto.URL 
     *  of a project's past homepage, associated with exactly one project.L'URL d'une 
     *  ancienne page web d'un projet, associ�e avec un unique projet.</p>
     */
    public static final Property old_homepage = m_model.createProperty( "http://usefulinc.com/ns/doap#old-homepage" );
    
    /** <p>Miroir de la page de t�l�chargement du programme.Mirror de la p�gina web de 
     *  descarga.Mirror of software download web page.</p>
     */
    public static final Property download_mirror = m_model.createProperty( "http://usefulinc.com/ns/doap#download-mirror" );
    
    /** <p>Proveedor de documentaci�n para el proyecto.Contributor of documentation to 
     *  the project.Collaborateur � la documentation du projet.</p>
     */
    public static final Property documenter = m_model.createProperty( "http://usefulinc.com/ns/doap#documenter" );
    
    /** <p>Colaborador del proyecto.Project contributor.Collaborateur au projet.</p> */
    public static final Property helper = m_model.createProperty( "http://usefulinc.com/ns/doap#helper" );
    
    /** <p>El URL de la p�gina de un proyecto, asociada con exactamente un proyecto.L'URL 
     *  de la page web d'un projet, associ�e avec un unique projet.URL of a project's 
     *  homepage, associated with exactly one project.</p>
     */
    public static final Property homepage = m_model.createProperty( "http://usefulinc.com/ns/doap#homepage" );
    
    /** <p>Fecha en la que algo fue creado, en formato AAAA-MM-DD. e.g. 2004-04-05Date 
     *  � laquelle a �t� cr�� quelque chose, au format AAAA-MM-JJ (par ex. 2004-04-05)Date 
     *  when something was created, in YYYY-MM-DD form. e.g. 2004-04-05</p>
     */
    public static final Property created = m_model.createProperty( "http://usefulinc.com/ns/doap#created" );
    
    /** <p>Suivi des bugs pour un projet.Bug tracker para un proyecto.Bug tracker for 
     *  a project.</p>
     */
    public static final Property bug_database = m_model.createProperty( "http://usefulinc.com/ns/doap#bug-database" );
    
    /** <p>Mailing list home page or email address.Page web de la liste de diffusion, 
     *  ou adresse de courriel.P�gina web de la lista de correo o direcci�n de correo.</p>
     */
    public static final Property mailing_list = m_model.createProperty( "http://usefulinc.com/ns/doap#mailing-list" );
    
    /** <p>Lenguaje de programaci�n en el que un proyecto es implementado o con el cu�l 
     *  pretende usarse.Programming language a project is implemented in or intended 
     *  for use with.Langage de programmation avec lequel un projet est impl�ment�, 
     *  ou avec lequel il est pr�vu de l'utiliser.</p>
     */
    public static final Property programming_language = m_model.createProperty( "http://usefulinc.com/ns/doap#programming-language" );
    
    /** <p>El URI de una descripci�n RDF de la licencia bajo la cu�l se distribuye el 
     *  software.The URI of an RDF description of the license the software is distributed 
     *  under.L'URI d'une description RDF de la licence sous laquelle le programme 
     *  est distribu�.</p>
     */
    public static final Property license = m_model.createProperty( "http://usefulinc.com/ns/doap#license" );
    
    /** <p>Emplacement d'un d�p�t.Location of a repository.lugar de un repositorio.</p> */
    public static final Property location = m_model.createProperty( "http://usefulinc.com/ns/doap#location" );
    
    /** <p>Operating system that a project is limited to. Omit this property if the project 
     *  is not OS-specific.Sistema opertivo al cu�l est� limitado el proyecto. Omita 
     *  esta propiedad si el proyecto no es espec�fico de un sistema opertaivo en 
     *  particular.Syst�me d'exploitation auquel est limit� le projet. Omettez cette 
     *  propri�t� si le projet n'est pas limit� � un syst�me d'exploitation.</p>
     */
    public static final Property os = m_model.createProperty( "http://usefulinc.com/ns/doap#os" );
    
    /** <p>URL of Wiki for collaborative discussion of project.L'URL du Wiki pour la 
     *  discussion collaborative sur le projet.URL del Wiki para discusi�n colaborativa 
     *  del proyecto.</p>
     */
    public static final Property wiki = m_model.createProperty( "http://usefulinc.com/ns/doap#wiki" );
    
    /** <p>Descripci�n corta (8 o 9 palabras) en texto plano de un proyecto.Short (8 
     *  or 9 words) plain text description of a project.Texte descriptif concis (8 
     *  ou 9 mots) d'un projet.</p>
     */
    public static final Property shortdesc = m_model.createProperty( "http://usefulinc.com/ns/doap#shortdesc" );
    
    /** <p>Web browser interface to repository.Interface web del repositorio.Interface 
     *  web au d�p�t.</p>
     */
    public static final Property browse = m_model.createProperty( "http://usefulinc.com/ns/doap#browse" );
    
    /** <p>A category of project.Una categor�a de proyecto.Une cat�gorie de projet.</p> */
    public static final Property category = m_model.createProperty( "http://usefulinc.com/ns/doap#category" );
    
    /** <p>D�p�t du code source.Source code repository.Repositorio del c�digo fuente.</p> */
    public static final Resource Repository = m_model.createResource( "http://usefulinc.com/ns/doap#Repository" );
    
    /** <p>CVS source code repository.Repositorio CVS del c�digo fuente.D�p�t CVS du 
     *  code source.</p>
     */
    public static final Resource CVSRepository = m_model.createResource( "http://usefulinc.com/ns/doap#CVSRepository" );
    
    /** <p>D�p�t BitKeeper du code source.Repositorio BitKeeper del c�digo fuente.BitKeeper 
     *  source code repository.</p>
     */
    public static final Resource BKRepository = m_model.createResource( "http://usefulinc.com/ns/doap#BKRepository" );
    
    /** <p>D�tails sur une version d'une realease d'un projet.Informaci�n sobre la versi�n 
     *  de un release del proyecto.Version information of a project release.</p>
     */
    public static final Resource Version = m_model.createResource( "http://usefulinc.com/ns/doap#Version" );
    
    /** <p>D�p�t Subversion du code source.Subversion source code repository.Repositorio 
     *  Subversion del c�digo fuente.</p>
     */
    public static final Resource SVNRepository = m_model.createResource( "http://usefulinc.com/ns/doap#SVNRepository" );
    
    /** <p>A project.Un proyecto.Un projet.</p> */
    public static final Resource Project = m_model.createResource( "http://usefulinc.com/ns/doap#Project" );
    
    /** <p>D�p�t GNU Arch du code source.GNU Arch source code repository.Repositorio 
     *  GNU Arch del c�digo fuente.</p>
     */
    public static final Resource ArchRepository = m_model.createResource( "http://usefulinc.com/ns/doap#ArchRepository" );
    
}
