package zebib;

public class POE {
	public static int findPOE(int[] arr) {
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
		// TODO Auto-generated method stub
		int[] test= {1, 8, 3, 7, 10, 2};
		System.out.println(findPOE(test));

	}

}

/*
 * {1, 8, 3, 7, 10, 2}	3 Reason: a[0] + a[1] + a[2] is equal to a[4] + a[5]
{1, 5, 3, 1, 1, 1, 1, 1, 1}	2 Reason: a[0] + a[1] is equal to a[3] + a[4] + a[5] + a[6] + a[7] + a[8]
{2, 1, 1, 1, 2, 1, 7}	5 Reason: a[0] + a[1] + a[2] + a[3] + a[4] is equal to a[6]
{1, 2, 3}	-1 Reason: No POE.
{3, 4, 5, 10}	-1 Reason: No POE.
{1, 2, 10, 3, 4}*/
