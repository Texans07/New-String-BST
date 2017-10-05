/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Doug
 */
public class Tree {
private Btree mytree;

    /**
     * @param args the command line arguments
     */
 ;
public static List<String>getWords(String text)
 {
     List<String> words = new ArrayList<>();
     BreakIterator breakIterator = BreakIterator.getWordInstance();
     breakIterator.setText(text);
     int lastIndex = breakIterator.first();
     while(BreakIterator.DONE!= lastIndex)
             {
             int firstIndex = lastIndex;
             lastIndex = breakIterator.next();
             if(lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex)))
             {
                 words.add(text.substring(firstIndex,lastIndex));
                 
             }
             }
             return words;
 }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String FileName = "data.txt";
        Btree mytree = new Btree();
        java.io.File file = new java.io.File(FileName);
        Scanner input=new Scanner(file);
        input.useDelimiter(" +"); //delimitor is one or more spaces
System.out.println(" Here is the Data before being entered into nodes!");
System.out.println();
System.out.println();
while(input.hasNext()){
   //test to see what each word looks like before input into tree 
///System.out.println(Arrays.toString(input.next().toLowerCase().trim().split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+")));

    
  //
mytree.addNode(Arrays.toString(input.next().toLowerCase().trim().replace("-", "").replace("\"", "").replace("'' ", "").replace(".", "").replace(",", "").replace("?", "").replace("] ", "").replace("!","").replace(" ", "").replace("'", "").split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+")));
}

System.out.println();
System.out.println(" Here Are Your Nodes In-Order");
System.out.println();
mytree.inorder();
        
        
        
    } 
    
    
}
//}