
package reversestrings;
public class ReverseStrings {

    public static void main(String[] args) {
      
        String s = "noteBookForAFDEMP";
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--)
        {
        sb.append(s.charAt(i));
        }
        String out = sb.toString().toLowerCase().toUpperCase();
        System.out.println(out);
        
    }
    
}
