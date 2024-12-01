/**
 * This program uses the String and array at the same time, counting the frequency of each letter in a sentence String.
 */

public class ReadSentence {
    public static void main(String[] args){

        String sentance = "It is a wonderful day";

        read(sentance);
    }

    public static void read(String sent){

        sent = sent.toUpperCase();
        
        int[] count = new int[26];

        char[] letter = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    
        for(int i = 0; i < sent.length(); i++){

            if(sent.charAt(i) >= 'A' && sent.charAt(i) <= 'Z'){
                int ind = sent.charAt(i) - 'A';
                count[ind]++;
            }    
        }

        for(int i = 0; i < letter.length; i++){
            System.out.println(letter[i] + " " + count[i]);
        }
    }
}
