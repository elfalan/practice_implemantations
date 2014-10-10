/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarySearch;

import static java.lang.Math.floor;
import java.util.Arrays;

/**
 *
 * @author jeselfalan
 */
public class binSearch {
    
    public static void main(String [] args){
        
        int [] arr = {1,2,3,4,5,6,7,8,9};
        
        
        int index1 = binSearch(arr, 0, arr.length, 4); //search array for the number 4
                System.out.println("found num at index: " + index1);
        
        int index2 = binSearch(arr,0,arr.length,9);
                System.out.println("found num at index: " + index2);

        
    }
    
    public static int binSearch(int [] arr, int start, int end, int key){
      if(start < end)//checks to see if array is empty
      {
          
           int mid = start + ((end-start)/2);  //compiler automatically truncates for int type
           
          if(key < arr[mid]){
              return binSearch(arr,start,mid,key);
          }
          else if(key > arr[mid]){
              return binSearch(arr,mid,end,key);
          }
          else{
              return mid;
          }
      }

        return 0;
    }
}