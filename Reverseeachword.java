public class Reverseeachword {
    public static void main(String [] args){

    String Str = "Archana Mohini";

    String[] str = Str.split(" ");
    String Result = " ";

for(String words : str){

String Revesved = " ";
  
for(int i=words.length()-1;i>=0;i--){
     Revesved += words.charAt(i);
  
}
   Result += Revesved+ " ";
}
System.out.println(Result);
}}