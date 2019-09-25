/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StringManipulation;

/**
 *
 * @author dinglasamo_sd2082
 */
public class FilterHTML {
    public String removedHTML(String str)
    {
        str = str.replaceAll("\\<.*?\\>", "");
        return str;
    }
    
}
