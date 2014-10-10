/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarySearchTree;


/**
 *
 * @author jeselfalan
 */
public class Tree {
    protected TreeNode root;
     protected TreeNode current;
    
    public Tree(){
        this.root = null;
        this.current = root;
//        root.leftChild = null;
//        root.rightChild = null;
    }
    
    public Tree(TreeNode inputNode){
        this.root = inputNode;
        this.current = root;
        root.leftChild = null;
        root.rightChild = null;
    }
    public void addRoot(TreeNode newRoot){
        this.root = newRoot;
        this.current = root;
    }
    
    //insert child
    public void insertNode(TreeNode n, TreeNode curr){
        int currVal = curr.getValue();
        int newVal = n.getValue();
        
        if((newVal <= currVal)){
            curr.leftChild = n;
        }
        else{
            insertNode(n,curr.leftChild);
            }
        if((newVal >= currVal)){
            curr.rightChild = n;
        }
        else{
            insertNode(n,curr.rightChild);
        }
        
    }
    
    //remove
}
