package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {1,4,3,2,8,6,7};
    int num = arr.length;
    Arrays.sort(arr);
    for(int i = 0 ; i < num ; i++) {
    	int a = i + 1;
    	
    	if (arr[i] != a) {
    		System.out.println("Missing Number is :" +a);
    		break;
    		
    	}
    }
    
    
	}

}
