
public class AP2018Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public interface StringChecker{
		boolean isValid(String str);
	}
	public class CodeWordChecker implements StringChecker{
		int min;
		int max;
		String restriction;
		public CodeWordChecker(int min, int max, String restriction) {
			this.min = min;
			this.max = max;
			this.restriction = restriction;
		}
		public CodeWordChecker(String restriction) {
			min = 6;
			max = 20;
			this.restriction = restriction;
		}
		public boolean isValid(String str) {
			// TODO Auto-generated method stub
			if (str.length()<min||str.length()>max||str.contains(restriction)) {
				return false;
			}
			return true;
		}
		
	}
}
