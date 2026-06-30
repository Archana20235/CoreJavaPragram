import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurancechar {
    public static void main(String[] args){
          
        String Str = "Archana Mohini";
         
        String str1 = Str.toLowerCase();

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for(char ch : str1.toCharArray()){

            if(Character.isLetter(ch)){
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }
        
        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
           if(entry.getValue()>1){
            System.out.println(entry.getKey() + " : " + entry.getValue());
           }
        }

 





    }
}
