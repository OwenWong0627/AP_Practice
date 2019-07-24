
public class AP2015Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static int arraySum(int[] arr) {
		int total = 0;
		for (int i = 0; i<arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
	public static int[] rowSums(int[][] arr2D) {
		int[] sum = new int[arr2D.length];
		for (int i = 0; i<arr2D.length; i++) {
			sum[i]=arraySum(arr2D[i]);
		}
		return sum;
	}
	public static boolean isDiverse(int[][] arr2D) {
		int[] rowsum = rowSums(arr2D);
		for (int i = 0; i<rowsum.length; i++) {
			for (int j=i+1; j<rowsum.length; i++) {
				if(rowsum[i]==rowsum[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
