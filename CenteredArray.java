package zebib;

public class CenteredArray {
	public static int centeredArray(int[]arr) {
		if(arr==null || arr.length==0 || arr.length%2==0) {
			return 0;
		}
		if(arr.length==1) {
			return 1;
		}
		int mid=arr.length/2;
		for(int i=0;i<arr.length;i++) {
			if(i==mid) {
				continue;
			}
			if(arr[mid]>=arr[i]) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test= {1,2,4};
		System.out.println(centeredArray(test));

	}

}
