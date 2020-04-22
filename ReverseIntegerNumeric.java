package zebib;

public class ReverseIntegerNumeric {
	public static int reverseIntegerNumeric(int num) {    
		if(num==0){
			return 0;
		}
		int temp=1;
		if(num<0) {
			 temp=-1*num;
		}
		else {
			temp=num; //1234 
		}
		int rem=0;
		int sum=0;
		while(temp>0) {
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
		}
		if(num<0) {
			return -1*sum;
		}
		else {
			return sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test=1000;
		System.out.println(reverseIntegerNumeric(test));

	}

}
