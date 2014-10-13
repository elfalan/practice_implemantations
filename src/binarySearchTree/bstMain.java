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
public class bstMain {

    public static void main(String[] args) {
        System.out.println("********BST Implementation**********");

        System.out.println("Creating new tree from input...");
        
        //assuming given array is in sorted order
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      //  int[] smallValues = {1, 2, 3};
      //  int[] justroot = {10};

        Tree BST = new Tree();

        insertNodes(values, BST,0,values.length);
        
        BST.current = BST.root;//reset pointer to root of tree
        
        //print results of constructed tree
        System.out.println("Printing left side of tree...");
       // TreeNode prev,left,right = null;
        int count = 0;
      
//        while(count != (values.length/2)){  
//            prev = BST.current; 
//            left = BST.current.leftChild;
//            right = BST.current.rightChild;
//            
//            System.out.println(BST.current.value);
//            System.out.println(BST.current.leftChild.value);
//            System.out.println(BST.current.rightChild.value);
//            
//            if((left == null)&&(right != null)){
//               BST.current= right;
//                count++;
//            }
//            else if ((left != null)&&(right == null)){
//                BST.current = left;
//                count++;
//            }
//            else if ((left ==null)&&(right == null)){
//                BST.current = prev;
//            }
//            
//        }
        
    }

   
    public static void insertNodes(int[] arr, Tree tree, int start, int end) {
       if(start < end){//check to make sure array is not out of bounds
            
           int mid = (start+end)/2;
          
            TreeNode n = new TreeNode(arr[mid]);

            if (tree.root == null) {//instantiate root of tree
                tree.addRoot(n);
                //set as current value
            }

             else if (n.value < tree.current.value) {
                    tree.current.leftChild = n;//add new node to left side of current
                    System.out.println("current node:" + tree.current.value);
                    
                    tree.current = tree.current.leftChild;//set new node as current    
                    System.out.println("added left child: " + tree.current.value);
                   

                }

             else if (n.value > tree.current.value) {
                    tree.current.rightChild = n;
                    System.out.println("current node:" + tree.current.value);//add new node to right side of current
                    
                    tree.current = tree.current.rightChild;//set new node as current
                    System.out.println("added right child: " + tree.current.value);
                
                }
            
                 //recusively add nodes of left side of tree
                 insertNodes(arr,tree,0,mid-1);
                 //recursively add nodes of right side of tree
                 insertNodes(arr,tree,mid+1,arr.length);
           
            }
                
                
            }
       
      
    
        
    
    }
