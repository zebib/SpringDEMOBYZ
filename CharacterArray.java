package zebib;

public class CharacterArray {
	public static char[] findCharacterArray(char[] a,int start,int length) {
		if (length < 0 || start < 0 || start+length-1>=a.length)
		 {
		 return null;
		 }

		 char[] sub = new char[length];
		 for (int i=0;i<length;i++){
		   sub[i] = a[start++];
		 }
		 return sub;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] test= {'a','b','c'};
		char[]res=findCharacterArray(test,1,2);
		for(char r:res) {
			System.out.print(r+" ");
		}
		

	}

}
