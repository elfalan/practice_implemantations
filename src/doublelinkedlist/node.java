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
public class node {
    
    node next;
    node prev;
    int data;
    
    public node(int data,node a,node b){
        this.prev = a;
        this.next = b;
        this.data = data;
    
    }
    public node(int d){
        this.data = d;
        this.prev = null;
        this.next = null;
    }
    
}
