
package practiceassignment3;

public class BinaryIterativeSearch implements Practice03Search {
    @Override
    public int search(int [] arr, int target){
        int start = 0;
        int end = arr.length;
        int mid = (start+end)/2;
        while(start<end){
            if(arr[mid]==target){
		return mid;
            } else if(arr[mid]<target){
		start=mid+1;
            } else{
		end=mid-1;
            }
            mid = (start+end)/2;
	}
        return -1;
    }
    @Override
    public String searchName(){
        return "Binary Iterative Search";
    }
}
