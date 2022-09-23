/*
 created by 21343010-Natasya febriani
 */
package jobsheet5;

import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main(String[] args){
        String word1="", word2="";
        
        word1 = JOptionPane.showInputDialog ("Word1 : ");
        word2 = JOptionPane.showInputDialog ("word2 : ");
        
        String msg = "Good by and Hello" +word1+word2;
        
        JOptionPane.showInputDialog(null, msg);
        
        
    }
    
}
