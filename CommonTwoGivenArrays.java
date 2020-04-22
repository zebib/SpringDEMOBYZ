package zebib;

import java.util.HashSet;
import java.util.Set;

public class CommonTwoGivenArrays {
	public static int[] commonTwoGivenArrays(int[] arr1,int[] arr2) {
		if(arr1==null || arr2==null || arr1.length==0 || arr2.length==0) {
			return null;
		}
		if((arr1.length==0 && arr2.length!=0) || (arr1.length!=0 && arr2.length==0)) {
			return new int[] {};
		}
		if((arr1==null && arr2!=null) || (arr1!=null && arr2==null)) {
			return null;
		}
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					set.add(arr1[i]);
				}
			}
		}
		int[] res=new int[set.size()];
		int i=0;
		for(int s:set) {
			res[i++]=s;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1= {1, 8, 3, 2 };
		int[] test2= {1,4,2,7,8};
		int[] res=commonTwoGivenArrays(test1,test2);
		for(int r:res) {
			System.out.print(r+" ");
		}

	}

}
