import java.util.Arrays;

public class AP2018Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2D = {{0,1,2},{3,4,5},{6,7,8},{9,5,3}};
		int[] lol = getColumn(arr2D, 1);
		for (int i:lol) {
			System.out.println(i);
		}
	}
	public static int[] getColumn(int[][] arr2D, int c) {
		int[] output = new int[arr2D.length];
		for (int i = 0; i<arr2D.length;i++) {
			output[i] = arr2D[i][c];
		}
		return output;
	}
	public static boolean containsDuplicates(int[] arr) {
		Arrays.sort(arr);
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==arr[i+1]) {
				return true;
			}
		}
		return false;
	}
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		for (int i=0; i<arr1.length; i++) {
			int value = arr1[i];
			boolean flag = false;
			for(int j=0; j<arr2.length; j++) {
				if (arr2[j]==value) {
					flag = true;
					break;
				}
			}
			if(flag==false) {
				return false;
			}
		}
		return true;
	}
	public static boolean isLatin(int[][] square) {
		if (containsDuplicates(square[0])) {
			return false;
		}else {
			for(int i=1; i<square.length;i++) {
				if (!hasAllValues(square[0],square[i])) {
					return false;
				}
			}
			for (int c=0; c<square.length; c++) {
				if (!hasAllValues(square[0], getColumn(square,c))) {
					return false;
				}
			}
		}
		return true;
	}
}
