/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */
public class ExpChar extends Exp {

    private String stringVal;
	private Character charVal;
    
    public ExpChar(String str) {
		stringVal = str;
		if(stringVal.length()>1){
			switch(stringVal.charAt(1)){
				case 'n':
					charVal = '\n';
					break;
				case 'f':
					charVal = '\f';
					break;
				case 't':
					charVal = '\t';
					break;
				case '\\':
					charVal = '\\';
					break;
				default:
					charVal = null;
					break;
			}
		}
		else
			charVal = stringVal.charAt(0);
			
		
    }
    public ExpChar(String str, boolean isHexChar){
    	stringVal = str;
		int intVal = Integer.parseInt(str.substring(2),16);
		charVal = (char) intVal;
    }

    public Character getChar() {
		return charVal;
    }
    public String getMatchedString()
    {
    	return stringVal;
    }

    public Object visit(Visitor v, Object arg)
    throws Exception
    {
		return v.visitExpChar(this, arg);
    }

    public String toString() {
		return stringVal;
    }
}
