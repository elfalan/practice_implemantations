/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_linkedList;



/**
 *
 * @author jeselfalan
 */
public class linkedList {
 Node head;
 Node current;
 Node next;
 
   public linkedList(Node node){
       head = node;
       current = head;
   }

   public Node getCurrent(){
       return current;
   }
   
   public void appendNode(Node newNode){
     current.setChild(newNode);
     current = current.getChild();//assign new current pointer to child of previous node
    
   }
   
}
