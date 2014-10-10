/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mergeSort;


/**
 *
 * @author jeselfalan
 */
public class MergeSort {
    
    public static void main(String [] args){
        int [] arr = {1,3,6,2,9,10,4};
        int [] helper = new int[arr.length];
       
        int [] sorted = mergeSort(arr,helper,0,arr.length-1);
    
    //print out of the sorted array
        for(int x = 0; x < sorted.length; x++){
        System.out.println(sorted[x]);
        }
    }
    //markers for low, high and mid are passed through until low references first element and high references second element, then merge
    //sorts the two elements => goes back to original call on stack for right half of rest of array. continues until larger "chuncks" are sorted.
    public static int [] mergeSort(int[] arr, int[] helper, int low, int high){
       if(low < high){
           int mid = (low+high)/2;
           mergeSort(arr, helper, low, mid); //left half
           mergeSort(arr, helper, (mid+1), high); //right half
        
           merge(arr,helper,low,mid,high);
       }
       return arr;
       
    }
    
    public static int [] merge(int [] arr, int[] helper,int low, int mid, int high){
        //copy both arrays into helper array
        for(int i = low; i <= high; i++){
            helper[i] = arr[i];
        }
    int helperLeft = low;
    int helperRight = mid +1;
    int current = low;
    
    //iterate through helper array, compare left and right half, copy back smaller elememt
    while(helperLeft <= mid && helperRight <= high){
        if(helper[helperLeft] <= helper[helperRight]){
        arr[current] = helper[helperLeft];
        helperLeft++;          
        }else{
            arr[current] = helper[helperRight];
            helperRight++;
        }
        current++;
                }
    int remaining = mid - helperLeft;
    for(int i = 0; i <= remaining; i++){
        arr[current + i] = helper[helperLeft + i];
        }
        
    return arr;
    }
   
    
}
