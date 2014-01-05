/* The following code was generated by JFlex 1.4.3 on 1/5/14 12:17 PM */

/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */


import java_cup.runtime.*;
import java.io.IOException;

// Jlex directives

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 1/5/14 12:17 PM from the specification file
 * <tt>src/Lexer.jflex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\2\1\2\1\1\1\0\1\2\1\5\22\0\1\2\1\23"+
    "\1\72\1\32\1\0\1\14\1\15\1\35\1\62\1\63\1\12\1\13"+
    "\1\71\1\7\1\10\1\11\1\40\1\40\10\4\1\44\1\70\1\22"+
    "\1\20\1\21\1\6\1\43\6\34\24\3\1\64\1\33\1\65\3\0"+
    "\1\24\1\37\1\46\1\26\1\42\1\36\1\61\1\53\1\52\2\3"+
    "\1\47\1\55\1\25\1\27\1\45\1\56\1\30\1\54\1\31\1\60"+
    "\1\57\1\3\1\41\1\51\1\50\1\66\1\16\1\67\1\17\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\2\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\10\2\1\0\1\2\1\17\1\20\5\2\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\0"+
    "\1\31\1\2\2\0\1\32\1\33\1\34\4\2\1\35"+
    "\2\2\1\36\1\0\2\2\2\0\2\2\1\37\2\2"+
    "\1\40\10\2\1\41\3\2\1\0\1\42\2\43\1\0"+
    "\1\44\1\45\1\46\4\2\1\47\1\50\1\51\1\52"+
    "\10\2\1\53\2\2\1\54\4\2\1\55\4\2\1\56"+
    "\1\2\1\57\1\60\1\61\1\62\1\63\1\2\1\64"+
    "\1\65\1\66\2\2\1\67\1\70\3\2\1\71\1\72"+
    "\2\2\1\73\4\2\1\74\1\75\1\2\1\76\1\77"+
    "\1\2\1\100\1\101\3\2\1\102\1\2\1\103\1\104"+
    "\1\105\1\106\1\107\1\110";

  private static int [] zzUnpackAction() {
    int [] result = new int[164];
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
    "\0\0\0\73\0\166\0\261\0\354\0\u0127\0\u0162\0\u019d"+
    "\0\166\0\166\0\73\0\73\0\73\0\73\0\73\0\u01d8"+
    "\0\u0213\0\u024e\0\u0289\0\u02c4\0\u02ff\0\u033a\0\u0375\0\u03b0"+
    "\0\u03eb\0\u0426\0\u0461\0\73\0\u049c\0\u04d7\0\u0512\0\u054d"+
    "\0\u0588\0\u05c3\0\73\0\73\0\73\0\73\0\73\0\73"+
    "\0\73\0\73\0\u05fe\0\u0162\0\u0639\0\u0674\0\u06af\0\73"+
    "\0\73\0\73\0\u06ea\0\u0725\0\u0760\0\u079b\0\166\0\u07d6"+
    "\0\u0811\0\166\0\u084c\0\u0887\0\u08c2\0\u08fd\0\u0938\0\u0973"+
    "\0\u09ae\0\73\0\u09e9\0\u0a24\0\166\0\u0a5f\0\u0a9a\0\u0ad5"+
    "\0\u0b10\0\u0b4b\0\u0b86\0\u0bc1\0\u0bfc\0\166\0\u0c37\0\u0c72"+
    "\0\u0cad\0\u0ce8\0\73\0\73\0\u0d23\0\u0d5e\0\166\0\166"+
    "\0\166\0\u0d99\0\u0dd4\0\u0e0f\0\u0e4a\0\u084c\0\u0887\0\u08c2"+
    "\0\73\0\u0e85\0\u0ec0\0\u0efb\0\u0f36\0\u0f71\0\u0fac\0\u0fe7"+
    "\0\u1022\0\166\0\u105d\0\u1098\0\166\0\u10d3\0\u110e\0\u1149"+
    "\0\u1184\0\166\0\u11bf\0\u11fa\0\u1235\0\u1270\0\u06af\0\u12ab"+
    "\0\u12e6\0\166\0\166\0\166\0\166\0\u1321\0\166\0\u135c"+
    "\0\166\0\u1397\0\u13d2\0\166\0\166\0\u140d\0\u1448\0\u1483"+
    "\0\166\0\166\0\u14be\0\u14f9\0\166\0\u1534\0\u156f\0\u15aa"+
    "\0\u15e5\0\166\0\u1620\0\u165b\0\166\0\166\0\u1696\0\166"+
    "\0\166\0\u16d1\0\u170c\0\u1747\0\166\0\u1782\0\166\0\166"+
    "\0\166\0\166\0\166\0\166";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[164];
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
    "\1\0\2\2\1\3\1\4\1\5\1\3\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\0\1\3\1\32\2\3\1\4\1\3"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\2\3\1\41"+
    "\1\3\1\42\5\3\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\76\0\2\3\1\0\3\3"+
    "\1\0\2\3\7\0\10\3\1\0\1\3\1\0\5\3"+
    "\2\0\15\3\14\0\1\3\1\4\1\0\2\3\1\54"+
    "\1\0\2\3\7\0\10\3\1\0\1\3\1\0\2\3"+
    "\1\4\2\3\2\0\15\3\12\0\1\2\74\0\1\3"+
    "\1\55\1\0\3\3\1\0\2\3\7\0\10\3\1\0"+
    "\1\3\1\0\2\3\1\55\2\3\2\0\15\3\14\0"+
    "\1\3\1\54\1\0\3\3\1\0\2\3\7\0\10\3"+
    "\1\0\1\3\1\0\2\3\1\54\2\3\2\0\15\3"+
    "\22\0\1\56\1\57\100\0\1\60\72\0\1\61\55\0"+
    "\2\3\1\0\3\3\1\0\2\3\4\0\1\62\2\0"+
    "\10\3\1\0\1\3\1\0\5\3\2\0\15\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\2\3\1\63"+
    "\5\3\1\0\1\3\1\0\5\3\2\0\15\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\4\3\1\64"+
    "\3\3\1\0\1\3\1\0\5\3\2\0\15\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\10\3\1\0"+
    "\1\3\1\0\4\3\1\65\2\0\4\3\1\66\10\3"+
    "\14\0\2\3\1\0\3\3\1\0\2\3\7\0\5\3"+
    "\1\67\2\3\1\0\1\3\1\0\5\3\2\0\15\3"+
    "\14\0\2\3\1\0\3\3\1\0\2\3\7\0\10\3"+
    "\1\0\1\3\1\0\4\3\1\70\2\0\15\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\10\3\1\0"+
    "\1\3\1\0\5\3\2\0\6\3\1\71\6\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\6\3\1\72"+
    "\1\3\1\73\1\3\1\0\1\72\1\74\1\3\1\75"+
    "\1\3\2\0\15\3\11\0\1\76\1\0\31\76\1\77"+
    "\37\76\3\0\2\3\1\0\3\3\1\0\2\3\7\0"+
    "\10\3\1\0\1\3\1\0\5\3\2\0\2\3\1\100"+
    "\6\3\1\101\3\3\31\0\1\102\55\0\2\3\1\0"+
    "\3\3\1\0\2\3\7\0\1\3\1\103\3\3\1\104"+
    "\1\105\1\3\1\0\1\3\1\0\5\3\2\0\15\3"+
    "\14\0\2\3\1\0\3\3\1\0\2\3\7\0\1\3"+
    "\1\106\1\3\1\107\4\3\1\0\1\3\1\0\5\3"+
    "\2\0\1\110\1\3\1\111\2\3\1\112\7\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\1\3\1\113"+
    "\6\3\1\0\1\3\1\0\4\3\1\114\2\0\5\3"+
    "\1\115\7\3\14\0\2\3\1\0\3\3\1\0\2\3"+
    "\7\0\10\3\1\0\1\3\1\0\1\116\4\3\2\0"+
    "\15\3\14\0\2\3\1\0\3\3\1\0\2\3\7\0"+
    "\10\3\1\0\1\3\1\0\4\3\1\117\2\0\5\3"+
    "\1\120\5\3\1\121\1\3\11\0\33\53\1\122\36\53"+
    "\1\123\3\0\1\3\1\55\1\0\2\3\1\7\1\0"+
    "\2\3\7\0\10\3\1\0\1\3\1\0\2\3\1\55"+
    "\2\3\2\0\15\3\11\0\1\56\1\124\3\56\1\125"+
    "\65\56\12\57\1\126\60\57\3\0\2\3\1\0\3\3"+
    "\1\0\2\3\7\0\3\3\1\127\4\3\1\0\1\3"+
    "\1\0\5\3\2\0\15\3\14\0\2\3\1\0\3\3"+
    "\1\0\2\3\7\0\6\3\1\130\1\3\1\0\1\3"+
    "\1\0\5\3\2\0\15\3\14\0\2\3\1\0\3\3"+
    "\1\0\2\3\7\0\10\3\1\0\1\3\1\0\1\131"+
    "\4\3\2\0\15\3\14\0\2\3\1\0\3\3\1\0"+
    "\2\3\7\0\2\3\1\132\5\3\1\0\1\3\1\0"+
    "\5\3\2\0\15\3\14\0\2\3\1\0\3\3\1\0"+
    "\2\3\7\0\1\3\1\133\6\3\1\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\134\13\3\14\0\2\3\1\0"+
    "\3\3\1\0\2\3\7\0\10\3\1\0\1\3\1\0"+
    "\4\3\1\135\2\0\15\3\15\0\1\136\17\0\1\136"+
    "\1\0\1\136\5\0\1\136\1\0\3\136\1\0\1\136"+
    "\3\0\1\136\27\0\2\3\1\0\3\3\1\0\2\3"+
    "\7\0\10\3\1\0\1\3\1\0\2\3\1\137\2\3"+
    "\2\0\15\3\14\0\1\3\1\140\1\0\3\3\1\0"+
    "\2\3\7\0\1\3\1\140\1\3\1\140\4\3\1\0"+
    "\1\3\1\0\3\140\1\3\1\140\2\0\1\3\1\140"+
    "\13\3\46\0\1\141\62\0\1\76\3\0\1\76\1\0"+
    "\1\76\1\0\1\141\1\76\37\0\2\3\1\0\3\3"+
    "\1\0\2\3\7\0\10\3\1\0\1\3\1\0\5\3"+
    "\2\0\7\3\1\142\5\3\14\0\2\3\1\0\3\3"+
    "\1\0\2\3\7\0\10\3\1\0\1\3\1\0\5\3"+
    "\2\0\12\3\1\143\1\144\1\3\14\0\2\3\1\0"+
    "\3\3\1\0\2\3\7\0\6\3\1\145\1\3\1\0"+
    "\1\3\1\0\5\3\2\0\5\3\1\146\7\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\4\3\1\147"+
    "\3\3\1\0\1\3\1\0\5\3\2\0\5\3\1\150"+
    "\7\3\14\0\2\3\1\0\3\3\1\0\2\3\7\0"+
    "\2\3\1\151\2\3\1\152\2\3\1\0\1\3\1\0"+
    "\5\3\2\0\2\3\1\153\4\3\1\154\5\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\5\3\1\155"+
    "\2\3\1\0\1\3\1\0\5\3\2\0\15\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\1\3\1\156"+
    "\6\3\1\0\1\3\1\0\5\3\2\0\15\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\10\3\1\0"+
    "\1\3\1\0\4\3\1\157\2\0\15\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\5\3\1\160\2\3"+
    "\1\0\1\3\1\0\5\3\2\0\15\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\10\3\1\0\1\3"+
    "\1\0\5\3\2\0\3\3\1\161\11\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\6\3\1\162\1\3"+
    "\1\0\1\3\1\0\5\3\2\0\15\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\10\3\1\0\1\3"+
    "\1\0\5\3\2\0\7\3\1\163\5\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\6\3\1\164\1\3"+
    "\1\0\1\3\1\0\5\3\2\0\15\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\10\3\1\0\1\3"+
    "\1\0\5\3\2\0\3\3\1\165\11\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\10\3\1\0\1\3"+
    "\1\0\1\3\1\166\3\3\2\0\15\3\11\0\1\53"+
    "\1\0\71\53\1\0\1\124\71\0\11\57\1\167\1\126"+
    "\60\57\3\0\2\3\1\0\3\3\1\0\2\3\7\0"+
    "\1\3\1\170\6\3\1\0\1\3\1\0\5\3\2\0"+
    "\15\3\14\0\2\3\1\0\3\3\1\0\2\3\7\0"+
    "\3\3\1\171\4\3\1\0\1\3\1\0\5\3\2\0"+
    "\15\3\14\0\2\3\1\0\3\3\1\0\2\3\7\0"+
    "\6\3\1\172\1\3\1\0\1\3\1\0\5\3\2\0"+
    "\15\3\14\0\2\3\1\0\3\3\1\0\2\3\7\0"+
    "\2\3\1\173\5\3\1\0\1\3\1\0\5\3\2\0"+
    "\15\3\14\0\2\3\1\0\3\3\1\0\2\3\7\0"+
    "\10\3\1\0\1\3\1\0\4\3\1\174\2\0\15\3"+
    "\14\0\2\3\1\0\1\175\2\3\1\0\2\3\7\0"+
    "\10\3\1\0\1\3\1\0\5\3\2\0\15\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\1\3\1\176"+
    "\6\3\1\0\1\3\1\0\5\3\2\0\15\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\10\3\1\0"+
    "\1\3\1\0\5\3\2\0\6\3\1\177\6\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\5\3\1\200"+
    "\2\3\1\0\1\3\1\0\5\3\2\0\15\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\10\3\1\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\201\13\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\2\3\1\202"+
    "\5\3\1\0\1\3\1\0\5\3\2\0\15\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\10\3\1\0"+
    "\1\3\1\0\5\3\2\0\12\3\1\203\2\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\10\3\1\0"+
    "\1\3\1\0\5\3\2\0\2\3\1\204\12\3\14\0"+
    "\2\3\1\0\3\3\1\0\2\3\7\0\10\3\1\0"+
    "\1\3\1\0\4\3\1\205\2\0\15\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\6\3\1\206\1\3"+
    "\1\0\1\3\1\0\5\3\2\0\15\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\1\3\1\207\6\3"+
    "\1\0\1\3\1\0\5\3\2\0\15\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\10\3\1\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\210\13\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\10\3\1\0\1\3"+
    "\1\0\5\3\2\0\4\3\1\211\10\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\6\3\1\212\1\3"+
    "\1\0\1\3\1\0\5\3\2\0\15\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\10\3\1\0\1\3"+
    "\1\0\1\213\1\214\3\3\2\0\15\3\14\0\2\3"+
    "\1\0\3\3\1\0\2\3\7\0\10\3\1\0\1\3"+
    "\1\0\4\3\1\215\2\0\15\3\14\0\2\3\1\0"+
    "\3\3\1\0\2\3\7\0\10\3\1\0\1\3\1\0"+
    "\5\3\2\0\7\3\1\216\5\3\14\0\2\3\1\0"+
    "\3\3\1\0\2\3\7\0\10\3\1\0\1\3\1\0"+
    "\5\3\2\0\10\3\1\217\4\3\14\0\2\3\1\0"+
    "\3\3\1\0\2\3\7\0\10\3\1\0\1\3\1\0"+
    "\5\3\2\0\5\3\1\220\7\3\14\0\2\3\1\0"+
    "\3\3\1\0\2\3\7\0\10\3\1\0\1\3\1\0"+
    "\5\3\2\0\2\3\1\221\12\3\14\0\2\3\1\0"+
    "\1\222\2\3\1\0\2\3\7\0\10\3\1\0\1\3"+
    "\1\0\5\3\2\0\15\3\14\0\2\3\1\0\3\3"+
    "\1\0\2\3\7\0\6\3\1\223\1\3\1\0\1\3"+
    "\1\0\5\3\2\0\15\3\14\0\2\3\1\0\3\3"+
    "\1\0\2\3\7\0\1\3\1\224\6\3\1\0\1\3"+
    "\1\0\5\3\2\0\15\3\14\0\2\3\1\0\3\3"+
    "\1\0\2\3\7\0\10\3\1\0\1\3\1\0\5\3"+
    "\2\0\6\3\1\225\6\3\14\0\2\3\1\0\3\3"+
    "\1\0\2\3\7\0\5\3\1\226\2\3\1\0\1\3"+
    "\1\0\5\3\2\0\15\3\14\0\2\3\1\0\3\3"+
    "\1\0\2\3\7\0\10\3\1\0\1\3\1\0\5\3"+
    "\2\0\2\3\1\227\12\3\14\0\2\3\1\0\3\3"+
    "\1\0\2\3\7\0\10\3\1\0\1\3\1\0\5\3"+
    "\2\0\14\3\1\230\14\0\2\3\1\0\3\3\1\0"+
    "\2\3\7\0\10\3\1\0\1\3\1\0\5\3\2\0"+
    "\14\3\1\231\14\0\2\3\1\0\3\3\1\0\2\3"+
    "\7\0\6\3\1\232\1\3\1\0\1\3\1\0\5\3"+
    "\2\0\15\3\14\0\2\3\1\0\3\3\1\0\2\3"+
    "\7\0\10\3\1\0\1\3\1\0\5\3\2\0\5\3"+
    "\1\233\7\3\14\0\2\3\1\0\3\3\1\0\2\3"+
    "\7\0\2\3\1\234\5\3\1\0\1\3\1\0\5\3"+
    "\2\0\15\3\14\0\2\3\1\0\1\235\2\3\1\0"+
    "\2\3\7\0\10\3\1\0\1\3\1\0\5\3\2\0"+
    "\15\3\14\0\2\3\1\0\3\3\1\0\2\3\7\0"+
    "\10\3\1\0\1\3\1\0\5\3\2\0\2\3\1\236"+
    "\12\3\14\0\2\3\1\0\3\3\1\0\2\3\7\0"+
    "\10\3\1\0\1\3\1\0\5\3\2\0\7\3\1\237"+
    "\5\3\14\0\2\3\1\0\3\3\1\0\2\3\7\0"+
    "\10\3\1\0\1\3\1\0\4\3\1\240\2\0\15\3"+
    "\14\0\2\3\1\0\3\3\1\0\2\3\7\0\5\3"+
    "\1\241\2\3\1\0\1\3\1\0\5\3\2\0\15\3"+
    "\14\0\2\3\1\0\3\3\1\0\2\3\7\0\10\3"+
    "\1\0\1\3\1\0\5\3\2\0\1\3\1\242\13\3"+
    "\14\0\2\3\1\0\3\3\1\0\2\3\7\0\6\3"+
    "\1\243\1\3\1\0\1\3\1\0\5\3\2\0\15\3"+
    "\14\0\2\3\1\0\3\3\1\0\2\3\7\0\2\3"+
    "\1\244\5\3\1\0\1\3\1\0\5\3\2\0\15\3"+
    "\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6077];
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
    "\1\0\1\11\10\1\5\11\12\1\1\0\1\1\1\11"+
    "\6\1\10\11\1\0\2\1\2\0\3\11\10\1\1\0"+
    "\2\1\2\0\2\1\1\11\17\1\1\0\2\11\1\1"+
    "\1\0\12\1\1\11\103\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[164];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	public int getChar() {
		return yychar + 1;
	}
	
	public int getColumn() {
		return yycolumn + 1;
	}

	public int getLine() {
		return yyline + 1;
	}
	
	public String getText() {
		return yytext();
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
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
    while (i < 140) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
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
        case 11: 
          { return new Symbol(sym.BITNOT);
          }
        case 73: break;
        case 20: 
          { return new Symbol(sym.RBRACE);
          }
        case 74: break;
        case 61: 
          { return new Symbol(sym.PRINT);
          }
        case 75: break;
        case 34: 
          { return new Symbol(sym.STRING, yytext().substring(1, yytext().length() - 1));
          }
        case 76: break;
        case 49: 
          { return new Symbol(sym.THEN);
          }
        case 77: break;
        case 48: 
          { return new Symbol(sym.RECT);
          }
        case 78: break;
        case 55: 
          { return new Symbol(sym.CALL);
          }
        case 79: break;
        case 33: 
          { return new Symbol(sym.IF);
          }
        case 80: break;
        case 62: 
          { return new Symbol(sym.CPATH);
          }
        case 81: break;
        case 67: 
          { return new Symbol(sym.CANVAS);
          }
        case 82: break;
        case 27: 
          { return new Symbol(sym.LESSEQ);
          }
        case 83: break;
        case 10: 
          { return new Symbol(sym.BITOR);
          }
        case 84: break;
        case 15: 
          { return new Symbol(sym.CONCAT);
          }
        case 85: break;
        case 54: 
          { return new Symbol(sym.PROC);
          }
        case 86: break;
        case 19: 
          { return new Symbol(sym.LBRACE);
          }
        case 87: break;
        case 72: 
          { return new Symbol(sym.PRINTLN);
          }
        case 88: break;
        case 6: 
          { return new Symbol(sym.MUL);
          }
        case 89: break;
        case 3: 
          { return new Symbol(sym.INTEGER, new Integer(yytext()));
          }
        case 90: break;
        case 69: 
          { return new Symbol(sym.SUBSTR);
          }
        case 91: break;
        case 5: 
          { return new Symbol(sym.DIV);
          }
        case 92: break;
        case 25: 
          { return new Symbol(sym.DOUBLE, new Double(yytext()));
          }
        case 93: break;
        case 8: 
          { return new Symbol(sym.MOD);
          }
        case 94: break;
        case 52: 
          { return new Symbol(sym.PATH);
          }
        case 95: break;
        case 43: 
          { return new Symbol(sym.CAR);
          }
        case 96: break;
        case 57: 
          { return new Symbol(sym.LAZY);
          }
        case 97: break;
        case 18: 
          { return new Symbol(sym.RPAREN);
          }
        case 98: break;
        case 51: 
          { return new Symbol(sym.EQVQ);
          }
        case 99: break;
        case 44: 
          { return new Symbol(sym.CDR);
          }
        case 100: break;
        case 13: 
          { return new Symbol(sym.GREATER);
          }
        case 101: break;
        case 30: 
          { return new Symbol(sym.BOOLEAN, yytext());
          }
        case 102: break;
        case 56: 
          { return new Symbol(sym.CASE);
          }
        case 103: break;
        case 65: 
          { return new Symbol(sym.SETBG);
          }
        case 104: break;
        case 23: 
          { return new Symbol(sym.SEMICOL);
          }
        case 105: break;
        case 22: 
          { return new Symbol(sym.RCURL);
          }
        case 106: break;
        case 4: 
          { return new Symbol(sym.MINUS);
          }
        case 107: break;
        case 21: 
          { return new Symbol(sym.LCURL);
          }
        case 108: break;
        case 42: 
          { return new Symbol(sym.CHARACTER, yytext().substring(1, yytext().length() - 1));
          }
        case 109: break;
        case 31: 
          { return new Symbol(sym.ASSIGN);
          }
        case 110: break;
        case 12: 
          { return new Symbol(sym.EQUAL);
          }
        case 111: break;
        case 47: 
          { return new Symbol(sym.READ);
          }
        case 112: break;
        case 59: 
          { return new Symbol(sym.SIZE);
          }
        case 113: break;
        case 36: 
          { return new Symbol(sym.AND);
          }
        case 114: break;
        case 16: 
          { return new Symbol(sym.COLON);
          }
        case 115: break;
        case 64: 
          { return new Symbol(sym.SETFG);
          }
        case 116: break;
        case 70: 
          { return new Symbol(sym.DYNAMIC);
          }
        case 117: break;
        case 37: 
          { return new Symbol(sym.NOT);
          }
        case 118: break;
        case 26: 
          { return new Symbol(sym.GREATEREQ);
          }
        case 119: break;
        case 66: 
          { return new Symbol(sym.EQUALQ);
          }
        case 120: break;
        case 60: 
          { return new Symbol(sym.PAIRQ);
          }
        case 121: break;
        case 41: 
          { return new Symbol(sym.HEX, yytext());
          }
        case 122: break;
        case 68: 
          { return new Symbol(sym.CIRCLE);
          }
        case 123: break;
        case 17: 
          { return new Symbol(sym.LPAREN);
          }
        case 124: break;
        case 38: 
          { return new Symbol(sym.DEF);
          }
        case 125: break;
        case 28: 
          { return new Symbol(sym.NOTEQ);
          }
        case 126: break;
        case 14: 
          { return new Symbol(sym.LESS);
          }
        case 127: break;
        case 50: 
          { return new Symbol(sym.ELSE);
          }
        case 128: break;
        case 53: 
          { return new Symbol(sym.PAIR);
          }
        case 129: break;
        case 1: 
          { /* ignore whitespace */
          }
        case 130: break;
        case 2: 
          { return new Symbol(sym.VARIABLE, yytext());
          }
        case 131: break;
        case 24: 
          { return new Symbol(sym.COMMA);
          }
        case 132: break;
        case 45: 
          { return new Symbol(sym.LET);
          }
        case 133: break;
        case 40: 
          { return new Symbol(sym.BIN, yytext());
          }
        case 134: break;
        case 39: 
          { return new Symbol(sym.HEX_CHARACTER, yytext());
          }
        case 135: break;
        case 32: 
          { return new Symbol(sym.PT);
          }
        case 136: break;
        case 9: 
          { return new Symbol(sym.BITAND);
          }
        case 137: break;
        case 29: 
          { return new Symbol(sym.OR);
          }
        case 138: break;
        case 58: 
          { return new Symbol(sym.LIST);
          }
        case 139: break;
        case 63: 
          { return new Symbol(sym.CLEAR);
          }
        case 140: break;
        case 35: 
          { /* line comment */
          }
        case 141: break;
        case 7: 
          { return new Symbol(sym.PLUS);
          }
        case 142: break;
        case 71: 
          { return new Symbol(sym.READINT);
          }
        case 143: break;
        case 46: 
          { 
          }
        case 144: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              { 	return new Symbol(sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}