/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceassignment3;

import java.util.Arrays;

/**
 *
 * @author rara0110
 */
public class BinaryRecursiveSearch implements Practice03Search {
    @Override
    public int search(int [] arr, int target){
        int start = 0;
        int end = arr.length;
        int mid = (start+end)/2;
        if(start>=end||start==mid){
            return -1;
	}
	if(arr[mid]==target){
            return mid;
	} else if(arr[mid]<target){
            mid+=1;
            return search(Arrays.copyOfRange(arr, mid, end+1), target);
	} else{
            mid-=1;
            return search(Arrays.copyOfRange(arr, start, mid+1), target);
	}
    }
    @Override
    public String searchName(){
        return "Binary Recursive Search";
    }
}
