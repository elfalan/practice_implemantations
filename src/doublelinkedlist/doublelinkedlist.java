/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doublelinkedlist;

/**
 *
 * @author jeselfalan
 */
public class doublelinkedlist {
 
    public static void main(String [] args){
        System.out.println("creating double linked list");
        
        int[] data = {1,2,3,4,5,6,7,8,9,10,11};
        
        linkedlist dll = new linkedlist();
        
        for(int x = 0; x < data.length;x++){
            node n = new node(data[x]);
            if(dll.head == null){      
            dll.head = n;
            n.next = n;
            dll.curr = n;           
            }
            else{
            dll.appendNode(n);
            }
        }
        
         dll.curr = dll.head;        
         System.out.println("printing double linked list:\n");
         
        for(int i = 0; i < data.length;i++){
           System.out.println("current node: " + dll.curr.data);
           System.out.println("next node:" + dll.curr.next.data);
           dll.curr = dll.curr.next;//increment current node poiner
      
        }
    }
    
}
