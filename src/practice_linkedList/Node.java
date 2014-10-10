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
public class Node {
    String data;
    Node child;
    
    public Node(String input){
        data = input;   
        child = null;//instantiate child node as null, list terminator
    }
    public void setChild(Node newNode){
        child = newNode;
    }
    public Node getChild(){
        return child;
    }
    public void printData(){
        System.out.println(data);
    }
}
