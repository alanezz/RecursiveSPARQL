/* Generated By:JavaCC: Do not edit this line. JSON_Parser.java */
/**
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
package org.apache.jena.atlas.json.io.parserjavacc.javacc ;
//This is javacc generated code
@SuppressWarnings("all")
public class JSON_Parser extends JSON_ParserBase implements JSON_ParserConstants {

// ---- Parser entry points
  final public void unit() throws ParseException {
                Token t ;
      startParse(-1, -1) ;
    Object();
    t = jj_consume_token(0);
      finishParse(t.beginLine, t.beginColumn) ;
  }

  final public void any() throws ParseException {
               Token t ;
      startParse(-1, -1) ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_LITERAL2:
    case INTEGER:
    case DECIMAL:
    case DOUBLE:
    case POSITIVE_INTEGER:
    case POSITIVE_DECIMAL:
    case POSITIVE_DOUBLE:
    case NEGATIVE_INTEGER:
    case NEGATIVE_DECIMAL:
    case NEGATIVE_DOUBLE:
    case TRUE:
    case FALSE:
    case NULL:
    case LBRACE:
    case LBRACKET:
      Value();
      break;
    default:
      jj_la1[0] = jj_gen;
      ;
    }
    t = jj_consume_token(0);
      finishParse(t.beginLine, t.beginColumn) ;
  }

// ---- Structures
  final public void Value() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_LITERAL2:
    case INTEGER:
    case DECIMAL:
    case DOUBLE:
    case POSITIVE_INTEGER:
    case POSITIVE_DECIMAL:
    case POSITIVE_DOUBLE:
    case NEGATIVE_INTEGER:
    case NEGATIVE_DECIMAL:
    case NEGATIVE_DOUBLE:
    case TRUE:
    case FALSE:
    case NULL:
      SimpleValue();
      break;
    case LBRACE:
      Object();
      break;
    case LBRACKET:
      Array();
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Object() throws ParseException {
                  Token t ;
    t = jj_consume_token(LBRACE);
    startObject(t.beginLine, t.beginColumn) ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_LITERAL2:
      Members(t);
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    t = jj_consume_token(RBRACE);
    finishObject(t.beginLine, t.beginColumn);
  }

  final public void Members(Token t) throws ParseException {
    Pair(t);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_1;
      }
      t = jj_consume_token(COMMA);
      Pair(t);
    }
  }

  final public void Pair(Token t) throws ParseException {
    startPair(t.beginLine, t.beginColumn) ;
    String();
    t = jj_consume_token(COLON);
    keyPair(t.beginLine, t.beginColumn) ;
    Value();
    finishPair(t.beginLine, t.beginColumn) ;
  }

  final public void Array() throws ParseException {
                 Token t ;
    t = jj_consume_token(LBRACKET);
     startArray(t.beginLine, t.beginColumn) ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_LITERAL2:
    case INTEGER:
    case DECIMAL:
    case DOUBLE:
    case POSITIVE_INTEGER:
    case POSITIVE_DECIMAL:
    case POSITIVE_DOUBLE:
    case NEGATIVE_INTEGER:
    case NEGATIVE_DECIMAL:
    case NEGATIVE_DOUBLE:
    case TRUE:
    case FALSE:
    case NULL:
    case LBRACE:
    case LBRACKET:
      Elements(t);
      break;
    default:
      jj_la1[4] = jj_gen;
      ;
    }
    t = jj_consume_token(RBRACKET);
     finishArray(t.beginLine, t.beginColumn) ;
  }

  final public void Elements(Token t) throws ParseException {
    ArrayValue(t.beginLine, t.beginColumn);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_2;
      }
      t = jj_consume_token(COMMA);
      ArrayValue(t.beginLine, t.beginColumn);
    }
  }

  final public void ArrayValue(long line, long col) throws ParseException {
    Value();
              element(line, col) ;
  }

// ---- 
  final public void SimpleValue() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_LITERAL2:
      String();
      break;
    case INTEGER:
    case DECIMAL:
    case DOUBLE:
    case POSITIVE_INTEGER:
    case POSITIVE_DECIMAL:
    case POSITIVE_DOUBLE:
    case NEGATIVE_INTEGER:
    case NEGATIVE_DECIMAL:
    case NEGATIVE_DOUBLE:
      Number();
      break;
    case TRUE:
      True();
      break;
    case FALSE:
      False();
      break;
    case NULL:
      Null();
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Number() throws ParseException {
                  Token t ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INTEGER:
      t = jj_consume_token(INTEGER);
                  valueInteger(t.image, t.beginLine, t.beginColumn) ;
      break;
    case DECIMAL:
      t = jj_consume_token(DECIMAL);
                  valueDecimal(t.image, t.beginLine, t.beginColumn) ;
      break;
    case DOUBLE:
      t = jj_consume_token(DOUBLE);
                 valueDouble(t.image, t.beginLine, t.beginColumn) ;
      break;
    case POSITIVE_INTEGER:
      t = jj_consume_token(POSITIVE_INTEGER);
                           valueInteger(t.image, t.beginLine, t.beginColumn) ;
      break;
    case POSITIVE_DECIMAL:
      t = jj_consume_token(POSITIVE_DECIMAL);
                           valueDecimal(t.image, t.beginLine, t.beginColumn) ;
      break;
    case POSITIVE_DOUBLE:
      t = jj_consume_token(POSITIVE_DOUBLE);
                          valueDouble(t.image, t.beginLine, t.beginColumn) ;
      break;
    case NEGATIVE_INTEGER:
      t = jj_consume_token(NEGATIVE_INTEGER);
                           valueInteger(t.image, t.beginLine, t.beginColumn) ;
      break;
    case NEGATIVE_DECIMAL:
      t = jj_consume_token(NEGATIVE_DECIMAL);
                           valueDecimal(t.image, t.beginLine, t.beginColumn) ;
      break;
    case NEGATIVE_DOUBLE:
      t = jj_consume_token(NEGATIVE_DOUBLE);
                          valueDouble(t.image, t.beginLine, t.beginColumn) ;
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

// Token to Java Object : These  rules exist to inject the 
// necessary Java objects and code for the tokens.
  final public void String() throws ParseException {
                  Token t ;
    t = jj_consume_token(STRING_LITERAL2);
                          valueString(t.image, t.beginLine, t.beginColumn);
  }

  final public void True() throws ParseException {
                Token t ;
    t = jj_consume_token(TRUE);
               valueBoolean(true, t.beginLine, t.beginColumn) ;
  }

  final public void False() throws ParseException {
                 Token t ;
    t = jj_consume_token(FALSE);
                valueBoolean(false, t.beginLine, t.beginColumn) ;
  }

  final public void Null() throws ParseException {
                Token t ;
    t = jj_consume_token(NULL);
               valueNull(t.beginLine, t.beginColumn) ;
  }

  /** Generated Token Manager. */
  public JSON_ParserTokenManager token_source;
  JavaCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[8];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x5eff880,0x5eff880,0x80,0x40000000,0x5eff880,0x40000000,0xeff880,0xff800,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }

  /** Constructor with InputStream. */
  public JSON_Parser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public JSON_Parser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new JSON_ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public JSON_Parser(java.io.Reader stream) {
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new JSON_ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public JSON_Parser(JSON_ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(JSON_ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[34];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 8; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 34; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
