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
public class TreeNode {
    int value;
    TreeNode leftChild;
    TreeNode rightChild;
    
   public TreeNode(int v){
      this.value = v;
   }
    
    public void addLeft(TreeNode leftNode){
        this.leftChild = leftNode;
    }
    public void addRight(TreeNode rightNode){
        this.rightChild = rightNode;
    }
    
    public int getValue(){
    return this.value;    
    }
           
}
