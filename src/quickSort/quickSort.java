/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quickSort;

/**
 *
 * @author jeselfalan
 */
public class quickSort {
    
    public static void main(String [] args){
        
        int [] arr = {2,4,9,1,20,3,22,1938};
        int left = 0;
        int right = arr.length-1;
        
        quickSort(arr,left,right);
        for(int x = 0; x < arr.length; x++){
            System.out.println(arr[x]);
        }
    }
    
    public static int [] quickSort(int[]arr,int left,int right){
        int index = partition(arr,left,right);
        if(left < index - 1){//sort left half 
            quickSort(arr,left,index-1);
        }
        if(index < right){
            quickSort(arr,index,right);           
        }
        return arr;
    }
    
    public static int partition(int [] arr, int left, int right){
        int pivot = arr[(left + right)/2]; //get arbitrary pivot point
        
        while(left <= right){
            //sweep from left to right to find an element that is on the left that should be on right
            while(arr[left] < pivot) left++; 
            //find element that is on the right that should be on left
            while(arr[right] > pivot) right--;
            
            //swap elements, and move left and right indicies
            if(left <= right){
                swap(arr,left,right); //swap elements
                left++;
                right--;
            }
        }
        return left;
    }
    
    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
