/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarySearchTree;

import static java.lang.Math.floor;
import java.util.Arrays;

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
        int[] smallValues = {1, 2, 3};
        int[] justroot = {10};

        //TreeNode root = new TreeNode(smallValues[getMid(smallValues)]);
        //Tree BST = new Tree(root);
        Tree BST = new Tree();

        insertNodes(values, BST);

    }

    public static int getMid(int[] arr) {
        double mid = floor(arr.length / 2);
        int midpt = (int) mid;

        return midpt;
    }

    public static void insertNodes(int[] arr, Tree tree) {
       
            int mid = getMid(arr);
          
            TreeNode n = new TreeNode(arr[mid]);

            if (tree.root == null) {//instantiate root of tree
                tree.addRoot(n);
            } else {

                if (n.value < tree.current.value) {
                    tree.current.leftChild = n;
                    System.out.println("node:" + tree.current.value);
                    tree.current = tree.current.leftChild;//set new node as current            

                }

                if (n.value > tree.current.value) {
                    tree.current.rightChild = n;
                    System.out.println("node:" + tree.current.value);
                    tree.current = tree.current.rightChild;//set new node as current
                }
            }

            //insert left children      
            if (mid != 0) {
                insertNodes(Arrays.copyOfRange(arr, 0, mid - 1), tree);
            }
            //insert right children
            if (mid != 0) {
                insertNodes(Arrays.copyOfRange(arr, mid + 1, arr.length), tree);
            }
            }
    
}
