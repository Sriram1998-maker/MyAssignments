package week1.day3;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num = 29;
    if(isPrime(num)) {
    	System.out.println("Prime number is :" +num);
    }
    else
    {
    	System.out.println("Not Prime number :" +num);
    }
    }
    public static boolean isPrime(int num) {
    	if(num<=1) {
    		return false;
    	}
    	if (num==2) {
    		return true;
    	}
    	if (num % 2 == 0) {
    		return false;
    	}
    	for (int i = 2;i < num ; i++) {
    		if(num % i == 0) {
    			return false;
    		}
    			
    	}
       return true;
	}

}
