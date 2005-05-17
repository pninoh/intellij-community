/* The following code was generated by JFlex 1.4 on 17.05.05 17:10 */

/* It's an automatically generated code. Do not modify it. */
package com.intellij.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.*;
import com.intellij.psi.xml.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4
 * on 17.05.05 17:10 from the specification file
 * <tt>/home/ik/projects/Irida/tools/lexer/_HtmlLexer.flex</tt>
 */
public class _HtmlLexer implements FlexLexer,ELHostLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int PROCESSING_INSTRUCTION = 8;
  public static final int END_TAG_NAME = 3;
  public static final int START_TAG_NAME = 3;
  public static final int ATTRIBUTE_VALUE_SQ = 7;
  public static final int DOC_TYPE = 1;
  public static final int ATTRIBUTE_VALUE_DQ = 6;
  public static final int YYINITIAL = 0;
  public static final int TAG_ATTRIBUTES = 4;
  public static final int COMMENT = 2;
  public static final int ATTRIBUTE_VALUE_START = 5;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\2\3\1\0\2\3\22\0\1\3\1\12\1\7\1\55\1\37"+
    "\1\0\1\45\1\10\5\0\1\5\1\4\1\44\12\2\1\1\1\47"+
    "\1\11\1\46\1\43\1\42\1\0\1\57\1\34\1\16\1\13\1\24"+
    "\1\57\1\1\1\25\1\36\2\1\1\30\1\26\1\1\1\14\1\22"+
    "\3\1\1\17\1\32\3\1\1\21\1\1\1\0\1\6\2\0\1\1"+
    "\1\0\1\51\1\35\1\16\1\13\1\24\1\57\1\50\1\25\1\36"+
    "\2\1\1\31\1\27\1\54\1\15\1\23\1\53\1\1\1\52\1\20"+
    "\1\33\2\1\1\56\1\21\1\1\1\40\1\0\1\41\54\0\1\1"+
    "\12\0\1\1\4\0\1\1\5\0\27\1\1\0\37\1\1\0\u013f\1"+
    "\31\0\162\1\4\0\14\1\16\0\5\1\11\0\1\1\213\0\1\1"+
    "\13\0\1\1\1\0\3\1\1\0\1\1\1\0\24\1\1\0\54\1"+
    "\1\0\46\1\1\0\5\1\4\0\202\1\10\0\105\1\1\0\46\1"+
    "\2\0\2\1\6\0\20\1\41\0\46\1\2\0\1\1\7\0\47\1"+
    "\110\0\33\1\5\0\3\1\56\0\32\1\5\0\13\1\43\0\2\1"+
    "\1\0\143\1\1\0\1\1\17\0\2\1\7\0\2\1\12\0\3\1"+
    "\2\0\1\1\20\0\1\1\1\0\36\1\35\0\3\1\60\0\46\1"+
    "\13\0\1\1\u0152\0\66\1\3\0\1\1\22\0\1\1\7\0\12\1"+
    "\43\0\10\1\2\0\2\1\2\0\26\1\1\0\7\1\1\0\1\1"+
    "\3\0\4\1\3\0\1\1\36\0\2\1\1\0\3\1\16\0\2\1"+
    "\23\0\6\1\4\0\2\1\2\0\26\1\1\0\7\1\1\0\2\1"+
    "\1\0\2\1\1\0\2\1\37\0\4\1\1\0\1\1\23\0\3\1"+
    "\20\0\11\1\1\0\3\1\1\0\26\1\1\0\7\1\1\0\2\1"+
    "\1\0\5\1\3\0\1\1\22\0\1\1\17\0\2\1\43\0\10\1"+
    "\2\0\2\1\2\0\26\1\1\0\7\1\1\0\2\1\1\0\5\1"+
    "\3\0\1\1\36\0\2\1\1\0\3\1\17\0\1\1\21\0\1\1"+
    "\1\0\6\1\3\0\3\1\1\0\4\1\3\0\2\1\1\0\1\1"+
    "\1\0\2\1\3\0\2\1\3\0\3\1\3\0\10\1\1\0\3\1"+
    "\113\0\10\1\1\0\3\1\1\0\27\1\1\0\12\1\1\0\5\1"+
    "\46\0\2\1\43\0\10\1\1\0\3\1\1\0\27\1\1\0\12\1"+
    "\1\0\5\1\3\0\1\1\40\0\1\1\1\0\2\1\43\0\10\1"+
    "\1\0\3\1\1\0\27\1\1\0\20\1\46\0\2\1\43\0\22\1"+
    "\3\0\30\1\1\0\11\1\1\0\1\1\2\0\7\1\72\0\60\1"+
    "\1\0\2\1\14\0\7\1\72\0\2\1\1\0\1\1\2\0\2\1"+
    "\1\0\1\1\2\0\1\1\6\0\4\1\1\0\7\1\1\0\3\1"+
    "\1\0\1\1\1\0\1\1\2\0\2\1\1\0\4\1\1\0\2\1"+
    "\11\0\1\1\2\0\5\1\1\0\1\1\25\0\2\1\42\0\1\1"+
    "\77\0\10\1\1\0\42\1\35\0\4\1\164\0\42\1\1\0\5\1"+
    "\1\0\2\1\45\0\6\1\112\0\46\1\12\0\51\1\7\0\132\1"+
    "\5\0\104\1\5\0\122\1\6\0\7\1\1\0\77\1\1\0\1\1"+
    "\1\0\4\1\2\0\7\1\1\0\1\1\1\0\4\1\2\0\47\1"+
    "\1\0\1\1\1\0\4\1\2\0\37\1\1\0\1\1\1\0\4\1"+
    "\2\0\7\1\1\0\1\1\1\0\4\1\2\0\7\1\1\0\7\1"+
    "\1\0\27\1\1\0\37\1\1\0\1\1\1\0\4\1\2\0\7\1"+
    "\1\0\47\1\1\0\23\1\105\0\125\1\14\0\u026c\1\2\0\10\1"+
    "\12\0\32\1\5\0\113\1\25\0\15\1\1\0\4\1\16\0\22\1"+
    "\16\0\22\1\16\0\15\1\1\0\3\1\17\0\64\1\43\0\1\1"+
    "\4\0\1\1\103\0\130\1\10\0\51\1\127\0\35\1\63\0\36\1"+
    "\2\0\5\1\u038b\0\154\1\224\0\234\1\4\0\132\1\6\0\26\1"+
    "\2\0\6\1\2\0\46\1\2\0\6\1\2\0\10\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\37\1\2\0\65\1\1\0\7\1"+
    "\1\0\1\1\3\0\3\1\1\0\7\1\3\0\4\1\2\0\6\1"+
    "\4\0\15\1\5\0\3\1\1\0\7\1\164\0\1\1\15\0\1\1"+
    "\202\0\1\1\4\0\1\1\2\0\12\1\1\0\1\1\3\0\5\1"+
    "\6\0\1\1\1\0\1\1\1\0\1\1\1\0\4\1\1\0\3\1"+
    "\1\0\7\1\3\0\3\1\5\0\5\1\u0ebb\0\2\1\52\0\5\1"+
    "\5\0\2\1\4\0\126\1\6\0\3\1\1\0\132\1\1\0\4\1"+
    "\5\0\50\1\4\0\136\1\21\0\30\1\70\0\20\1\u0200\0\u19b6\1"+
    "\112\0\u51a6\1\132\0\u048d\1\u0773\0\u2ba4\1\u215c\0\u012e\1\2\0\73\1"+
    "\225\0\7\1\14\0\5\1\5\0\1\1\1\0\12\1\1\0\15\1"+
    "\1\0\5\1\1\0\1\1\1\0\2\1\1\0\2\1\1\0\154\1"+
    "\41\0\u016b\1\22\0\100\1\2\0\66\1\50\0\14\1\164\0\5\1"+
    "\1\0\207\1\44\0\32\1\6\0\32\1\13\0\131\1\3\0\6\1"+
    "\2\0\6\1\2\0\6\1\2\0\3\1\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\4\0\1\2\2\3\1\4\1\1\1\5\1\6"+
    "\1\1\6\7\1\10\3\11\1\12\1\13\1\12\1\14"+
    "\1\15\1\12\1\16\1\2\1\17\1\20\1\7\2\3"+
    "\1\21\4\3\1\4\1\7\1\22\1\1\1\0\1\23"+
    "\1\24\1\1\7\0\1\3\4\0\1\25\2\3\4\0"+
    "\1\1\1\26\1\27\11\0\1\30\1\3\1\0\1\3"+
    "\1\31\1\0\1\26\1\32\3\0\1\14\1\33\3\0"+
    "\1\34\2\0\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0"+
    "\0\u0300\0\u0330\0\u0360\0\u02a0\0\u02a0\0\u0390\0\u0270\0\u02a0"+
    "\0\u03c0\0\u0270\0\u03f0\0\u02a0\0\u0420\0\u02a0\0\u0450\0\u02a0"+
    "\0\u02a0\0\u0420\0\u0480\0\u04b0\0\u02a0\0\u04e0\0\u0510\0\u0540"+
    "\0\u0570\0\u05a0\0\u05d0\0\u02a0\0\u0600\0\u0630\0\u02a0\0\u02a0"+
    "\0\u0660\0\u0690\0\u06c0\0\u06f0\0\u0720\0\u0750\0\u0780\0\u02d0"+
    "\0\u02a0\0\u0300\0\u07b0\0\u07e0\0\u0810\0\u02a0\0\u0840\0\u0870"+
    "\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960\0\u01b0\0\u02a0\0\u0990"+
    "\0\u09c0\0\u09f0\0\u0a20\0\u0a50\0\u0a80\0\u0ab0\0\u0ae0\0\u0b10"+
    "\0\u02a0\0\u0b40\0\u0b70\0\u0ba0\0\u02a0\0\u0bd0\0\u02a0\0\u02a0"+
    "\0\u0c00\0\u0c30\0\u0c60\0\u02a0\0\u02a0\0\u0c90\0\u0cc0\0\u0cf0"+
    "\0\u02a0\0\u0d20\0\u0d50\0\u02a0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\12\1\13\5\12\1\14\25\12\1\15\5\12\1\16"+
    "\12\12\3\17\1\13\3\17\1\20\1\21\11\17\2\22"+
    "\1\17\1\23\15\17\1\24\1\17\1\16\12\17\5\25"+
    "\1\26\37\25\1\27\12\25\1\30\1\31\1\30\1\13"+
    "\7\30\24\31\6\30\1\32\2\30\5\31\1\30\2\31"+
    "\1\30\1\33\1\30\1\13\7\30\24\33\4\30\1\34"+
    "\1\35\1\32\1\36\1\30\5\33\1\30\2\33\3\37"+
    "\1\13\3\37\1\40\1\41\32\37\1\34\1\42\13\37"+
    "\6\43\1\44\1\45\27\43\1\46\20\43\6\47\1\50"+
    "\1\47\1\45\26\47\1\51\20\47\42\52\1\53\1\54"+
    "\14\52\3\12\1\0\5\12\1\0\25\12\1\55\5\12"+
    "\1\0\12\12\3\0\1\13\66\0\1\56\27\0\1\57"+
    "\1\0\1\60\13\0\11\12\1\0\25\12\1\55\1\61"+
    "\4\12\1\0\12\12\1\0\1\62\11\0\16\62\1\63"+
    "\5\62\11\0\1\63\1\64\1\62\1\65\1\66\1\67"+
    "\2\62\60\0\7\70\1\71\50\70\10\72\1\71\47\72"+
    "\32\0\2\73\43\0\2\74\44\0\1\75\53\0\2\31"+
    "\1\0\2\31\5\0\24\31\11\0\5\31\1\0\2\31"+
    "\1\0\2\33\1\0\2\33\5\0\24\33\11\0\5\33"+
    "\1\0\2\33\43\0\1\76\14\0\3\37\1\0\3\37"+
    "\2\0\32\37\2\0\13\37\6\43\1\44\1\0\56\43"+
    "\1\44\57\43\1\44\1\0\30\43\1\77\17\43\6\47"+
    "\1\50\1\47\1\0\55\47\1\50\57\47\1\50\1\47"+
    "\1\0\27\47\1\100\17\47\42\52\1\101\1\0\57\52"+
    "\1\54\14\52\11\12\1\0\25\12\1\55\5\12\1\0"+
    "\12\12\5\0\1\102\5\0\1\103\44\0\3\61\1\104"+
    "\5\61\1\104\25\61\1\105\1\61\1\106\3\61\1\104"+
    "\12\61\1\0\2\62\1\0\2\62\5\0\24\62\10\0"+
    "\1\107\5\62\1\0\2\62\1\0\2\62\1\0\2\62"+
    "\5\0\5\62\1\110\16\62\10\0\1\107\5\62\1\0"+
    "\2\62\1\0\2\62\1\0\2\62\5\0\10\62\1\111"+
    "\3\62\1\112\7\62\10\0\1\107\5\62\1\0\2\62"+
    "\1\0\2\62\1\0\2\62\5\0\20\62\1\113\3\62"+
    "\10\0\1\107\5\62\1\0\2\62\1\0\2\62\1\0"+
    "\2\62\5\0\22\62\1\114\1\62\10\0\1\107\5\62"+
    "\1\0\2\62\2\0\1\115\53\0\1\116\35\0\2\117"+
    "\50\0\2\120\73\0\1\121\14\0\6\77\1\122\1\123"+
    "\31\77\1\43\16\77\6\100\1\124\1\100\1\123\30\100"+
    "\1\47\16\100\43\52\1\0\14\52\5\0\1\125\66\0"+
    "\2\126\42\0\41\104\1\127\16\104\11\61\1\104\25\61"+
    "\1\105\1\61\1\106\3\61\1\104\12\61\1\0\2\62"+
    "\1\0\2\62\5\0\24\62\10\0\1\130\5\62\1\0"+
    "\2\62\1\0\2\62\1\0\2\62\5\0\2\62\1\131"+
    "\21\62\10\0\1\107\5\62\1\0\2\62\1\0\2\62"+
    "\1\0\2\62\5\0\10\62\1\110\13\62\10\0\1\107"+
    "\5\62\1\0\2\62\1\0\2\62\1\0\2\62\5\0"+
    "\2\62\1\63\21\62\10\0\1\107\5\62\1\0\2\62"+
    "\1\0\2\62\1\0\2\62\5\0\24\62\10\0\1\107"+
    "\2\62\1\112\2\62\1\0\2\62\2\0\1\115\44\0"+
    "\1\130\12\0\1\132\10\0\1\132\2\0\1\132\5\0"+
    "\1\132\7\0\2\132\13\0\1\132\5\0\1\132\30\0"+
    "\2\133\56\0\2\134\26\0\6\77\1\122\32\77\1\43"+
    "\16\77\41\123\1\135\16\123\6\100\1\124\32\100\1\47"+
    "\16\100\16\0\1\136\42\0\2\62\1\0\2\62\5\0"+
    "\24\62\10\0\1\107\2\62\1\110\2\62\1\0\2\62"+
    "\2\0\1\132\10\0\1\132\2\0\1\132\5\0\1\132"+
    "\7\0\2\132\11\0\1\130\1\0\1\132\5\0\1\132"+
    "\36\0\1\137\40\0\2\140\55\0\1\141\62\0\1\142"+
    "\60\0\2\143\60\0\1\144\33\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3456];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\4\0\11\1\1\11\4\1\2\11\2\1\1\11"+
    "\3\1\1\11\1\1\1\11\1\1\2\11\3\1\1\11"+
    "\6\1\1\11\1\1\1\0\2\11\1\1\7\0\1\11"+
    "\4\0\1\11\2\1\4\0\2\1\1\11\11\0\1\11"+
    "\1\1\1\0\1\1\1\11\1\0\2\11\3\0\2\11"+
    "\3\0\1\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private IElementType elTokenType = XmlTokenType.XML_DATA_CHARACTERS;
  private IElementType elTokenType2 = XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;

  public void setElTypes(IElementType _elTokenType,IElementType _elTokenType2) {
    elTokenType = _elTokenType;
    elTokenType2 = _elTokenType2;
  }

  public _HtmlLexer() {
    this((java.io.Reader)null);
  }


  public _HtmlLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _HtmlLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1254) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead - zzPushbackPos;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int initialState){
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = 0;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzEndRead = buffer.length();
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = zzLexicalState;


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 3: 
          { return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
          }
        case 30: break;
        case 7: 
          { return XmlTokenType.XML_BAD_CHARACTER;
          }
        case 31: break;
        case 27: 
          { return elTokenType2;
          }
        case 32: break;
        case 10: 
          { yybegin(YYINITIAL); yypushback(1); break;
          }
        case 33: break;
        case 22: 
          { return elTokenType;
          }
        case 34: break;
        case 15: 
          { yybegin(ATTRIBUTE_VALUE_DQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
          }
        case 35: break;
        case 28: 
          { return XmlTokenType.XML_DOCTYPE_PUBLIC;
          }
        case 36: break;
        case 26: 
          { return XmlTokenType.XML_CHAR_ENTITY_REF;
          }
        case 37: break;
        case 29: 
          { yybegin(DOC_TYPE); return XmlTokenType.XML_DOCTYPE_START;
          }
        case 38: break;
        case 4: 
          { return XmlTokenType.XML_PI_TARGET;
          }
        case 39: break;
        case 21: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_EMPTY_ELEMENT_END;
          }
        case 40: break;
        case 18: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_PI_END;
          }
        case 41: break;
        case 23: 
          { return XmlTokenType.XML_ENTITY_REF_TOKEN;
          }
        case 42: break;
        case 17: 
          { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_ATTRIBUTE_VALUE_END_DELIMITER;
          }
        case 43: break;
        case 25: 
          { yybegin(COMMENT); return XmlTokenType.XML_COMMENT_START;
          }
        case 44: break;
        case 2: 
          { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
          }
        case 45: break;
        case 9: 
          { return XmlTokenType.XML_COMMENT_CHARACTERS;
          }
        case 46: break;
        case 14: 
          { yybegin(ATTRIBUTE_VALUE_START); return XmlTokenType.XML_EQ;
          }
        case 47: break;
        case 20: 
          { yybegin(END_TAG_NAME); return XmlTokenType.XML_END_TAG_START;
          }
        case 48: break;
        case 8: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_DOCTYPE_END;
          }
        case 49: break;
        case 16: 
          { yybegin(ATTRIBUTE_VALUE_SQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
          }
        case 50: break;
        case 6: 
          { yybegin(START_TAG_NAME); return XmlTokenType.XML_START_TAG_START;
          }
        case 51: break;
        case 12: 
          { return XmlTokenType.XML_NAME;
          }
        case 52: break;
        case 13: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_TAG_END;
          }
        case 53: break;
        case 24: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_COMMENT_END;
          }
        case 54: break;
        case 11: 
          { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_NAME;
          }
        case 55: break;
        case 19: 
          { yybegin(PROCESSING_INSTRUCTION); return XmlTokenType.XML_PI_START;
          }
        case 56: break;
        case 5: 
          { return XmlTokenType.XML_WHITE_SPACE;
          }
        case 57: break;
        case 1: 
          { return XmlTokenType.XML_DATA_CHARACTERS;
          }
        case 58: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
