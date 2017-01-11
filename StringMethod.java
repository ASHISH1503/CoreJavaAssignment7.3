
public class StringMethod {

	public static void main(String[] args) {
	    String AshishRanjan = "AshishRanjan";
	    String Ranjan = "Ranjan";
	    char[] AshishRanjanArray = AshishRanjan.toCharArray();
	    char[] RanjanArray = Ranjan.toCharArray();
	    System.out.println("Substring found : "+isPresent(RanjanArray, AshishRanjanArray));
	}

	public static boolean isPresent(char[] Ranjan, char[] AshishRanjan) {
	    for (int i = 0; i < AshishRanjan.length - Ranjan.length+1; i++) {
	        for (int j = 0; j < Ranjan.length; j++) {
	            if (AshishRanjan[i + j] == Ranjan[j]) {
	                if (j == Ranjan.length - 1) {
	                    return true;
	                }
	            } else {
	                break;
	            }
	        }
	    }
	    return false;
	}
}
