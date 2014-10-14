/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circularArray;

/**
 *
 * @author jeselfalan
 */
public class CircularArraymain {
 
    public static void main(String[] args){
        
        Object [] data = {1,2,3,4,5,6,7,8,10,11,12,13,14,20};
        
        CircularArray arr = new CircularArray(data);
        
        System.out.println("current item: " + arr.getCurrent().toString());
        System.out.println("array sizes: " + arr.firstHalf.length + " ; " + arr.secondHalf.length);
        for(int x = 0; x < arr.firstHalf.length; x++){
        System.out.println("first: " + arr.firstHalf[x]);
        }
        for(int x = 0; x < arr.secondHalf.length; x++){
        System.out.println("second: " + arr.secondHalf[x]);
        }
    }
    
}
