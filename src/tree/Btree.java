/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author Doug
 */
public class Btree {
    private Node root;
private Node temp;


public void addNode(String nodevalue)
{
   temp = new Node();
  temp.value = nodevalue;
  temp.count = 1;
    if(root == null)
    {
    root = temp;
    }
    else
    {
        recAdd(root);
    }
}

private void recAdd(Node curNode)
{
        if (temp.value.compareToIgnoreCase(curNode.value) < 0)
        {
            if(curNode.leftNode == null)
            {
                curNode.leftNode = temp;
            }
            else
                recAdd(curNode.leftNode);
        }
        else if (temp.value.compareToIgnoreCase(curNode.value)> 0)
        {
            if(curNode.rightNode == null)
        {
            curNode.rightNode = temp;
        }
        else recAdd(curNode.rightNode);
        }
         else if(temp.value .equalsIgnoreCase(curNode.value))
        {
                curNode.count++;
        }
 
 
}
  public void inorder()
    {
        inorder(root);
    }

    private void inorder(Node root ) 
    {
        if (root != null) 
        {
            inorder(root.leftNode);
            System.out.print(root.value + " "+"(" +root.count+ ")" );
            inorder(root.rightNode);
        }
    }

public String printOut()
 {
     
     return recPrintOut(root);
    
 }

private String recPrintOut(Node curNode)
 {
     String myValue = "";
     if(curNode.leftNode != null)
     {
         myValue = recPrintOut(curNode.leftNode);
         myValue += " "+curNode.value + "( " + curNode.count + ")" ;
     }
     else if(curNode.rightNode != null)
         {
         myValue = recPrintOut(curNode.rightNode);
         myValue += " " + curNode.value+ "( " + curNode.count + ")";
         
         
     
     }return myValue;
     
     
 }




















}



