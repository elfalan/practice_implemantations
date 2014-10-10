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
public class Practice_linkedListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //**********************************************************
   /**
    * Linked list implementation
    * Classes: Node, LinkedList 
    */
       
        System.out.println("*********linked list implementation");
        //create some test nodes
        Node head = new Node("head");
        linkedList list = new linkedList(head);
        for(int x = 0; x < 10; x++){
        Node addme = new Node("node " + x);
       
        System.out.println("created new node  " + x);
            list.appendNode(addme);
        }
       
        //print results
        System.out.println("created new list, printing contents: \n");
         
        list.current = list.head; //reset the pointer to front of the list
           
           while(list.current != null){
           list.current.printData();
           list.current = list.current.child;
           
    }
  //****************************************************         
           String str1 = "string";
           String str2 = "thisisnot";
           System.out.println(isUnique(str1));
           System.out.println(isUnique(str2));
           
     
    }
     public static boolean isUnique(String str){
          boolean [] char_set = new boolean[128];
          
           for(int x = 0; x < str.length(); x++){
           int val = str.charAt(x);
           if (char_set[val]){//already found this char
               System.out.println(val);
               return false;
           }
            System.out.println(val);
           char_set[val] = true;
           }
           return true;
}
         
    
}
