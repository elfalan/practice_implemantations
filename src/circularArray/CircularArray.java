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
public class CircularArray {

    Object[] firstHalf;
    Object[] secondHalf;
    int size1;
    int size2;
    int totalSize;
    
    int curr;//current pointer

    public CircularArray(Object[] input) {
        this.totalSize = input.length;
        if (totalSize % 2 == 1) { //if input size is odd
            this.firstHalf = new Object[totalSize / 2];
            this.secondHalf = new Object[(totalSize / 2) + 1];
        } else {
            this.firstHalf = new Object[totalSize / 2];
            this.secondHalf = new Object[totalSize / 2];
        }
        this.size1 = this.firstHalf.length;
        this.size2 = this.secondHalf.length;

        loadData(input);
        curr = 0;
    }

    //support method for loading the data
    private void loadData(Object[] input) {

        int input_index = 0;
        for (int x = 0; x < size1; x++) {
            firstHalf[x] = input[x];
            input_index++;
        }
        for (int y = 0; y < size2; y++) {
            secondHalf[y] = input[input_index];
            input_index++;
        }
    }
    
    public Object getCurrent(){
        Object item;
        if((0 <= this.curr)&&(this.curr <= (size1-1))){
         item = this.firstHalf[this.curr]; 
    }else{
          item = this.secondHalf[this.curr];
        }
        return item;
    }

}
