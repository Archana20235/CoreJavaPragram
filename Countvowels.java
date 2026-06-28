public class Countvowels {
    

public static void main(String[] args){

     String str = "Archana Mohini";
        int vowels = 0;
        int consonants = 0;

        String vowel = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {

                if (vowel.contains(String.valueOf(ch))) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}



