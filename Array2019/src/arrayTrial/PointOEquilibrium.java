package arrayTrial;

public class PointOEquilibrium {
public static int findPOE(int[] arr){
	if(arr==null || arr.length==0){
		return 0;
	}
	int sumLeft=0;
	int sumRight=0;
	for(int j=arr.length-1;j>=0;j--) {
		sumRight=sumRight+arr[j];
		int c=0;
		for(int i=0;i<j-1;i++) {
			sumLeft=sumLeft+arr[i];
			c++;
		}
		if(sumLeft==sumRight) {
			return c;
		}
		else {
			sumLeft=0;
			c=0;
		}
	}
	return -1;
	
}
	public static void main(String[] args) {
		int[] test= {1, 8, 3, 7, 10, 2};
		System.out.println(findPOE(test));

	}

}
