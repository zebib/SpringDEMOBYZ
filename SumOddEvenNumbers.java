package zebib;

public class SumOddEvenNumbers {
	public static int sumOddEvenNumbers(int[] arr) {
		if(arr==null || arr.length==0) {
			return 0;
		}
		int sumOdd=0;
		int sumEven=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sumEven=sumEven+arr[i];
			}
			else {
				sumOdd=sumOdd+arr[i];
			}
		}
		return sumOdd-sumEven;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test= {1, 2, 3, 4};
		System.out.println(sumOddEvenNumbers(test));

	}

}
