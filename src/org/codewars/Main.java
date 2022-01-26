package org.codewars;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //
        spinWords("Hey fellow warriors");
    }
    public static String spinWords(String word){
        StringBuffer stringBuffer;
        String[] words = word.split(" ");
        String[] output = new String[words.length];
        for (int i = 0; i < words.length ; i++) {
            if(words[i].length() >= 5) {
                stringBuffer = new StringBuffer(words[i]);
                stringBuffer.reverse();
                output[i] = stringBuffer.toString();
            }
            else
                output[i] = words[i];
        }
        String.join(" ", output);
        return String.join(" ", output);
    }
}
