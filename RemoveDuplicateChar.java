import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String [] args){

    String Str = "Archana Mohini";
     Str = Str.toLowerCase();

   Set<Character> duplicatechar = new LinkedHashSet<>();

    for(char ch : Str.toCharArray()){
if(Character.isLetter(ch)){

        duplicatechar.add(ch);
}}

    StringBuffer sb = new StringBuffer();
   for(char ch : duplicatechar){

       sb.append(ch);
   }

System.out.println(sb);

   

    }



}
