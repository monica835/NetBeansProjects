/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

import java.util.ArrayList;

/**
 *
 * @author dinglasamo_sd2082
 */
public class FilterHTML {

    public String removedHTML(String str) {
        str = str.replaceAll("\\<.*?\\>", "");
        return str;
    }

    public String removedCss(String str1) {

        // split text to array of words
        String[] words = str1.split("\\s");
        // frequency array
        int[] fr = new int[words.length];
        // init frequency array
        for (int i = 0; i < fr.length; i++) {
            fr[i] = 0;
        }
        // count words frequency
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {

                    fr[i]++;

                }
            }
        }

        // clean duplicates
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    if (i != j) {
                        words[i] = "";
                    }

                }
            }
        }

		// show the output
        int total = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {

            if (words[i] != "") {

                list.add(words[i] + " = " + fr[i] + "\n");

            }

        }
        
        return list.toString();

    }
}
