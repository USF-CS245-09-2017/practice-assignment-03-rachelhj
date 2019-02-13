/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceassignment3;

/**
 *
 * @author rara0110
 */
public class LinearSearch implements Practice03Search {

    @Override
    public int search(int [] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    @Override
    public String searchName(){
        return "Linear Search";
    }
}

