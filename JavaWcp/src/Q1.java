
public class Q1 {
	public static void main(String[] args) {
		
		int[] array = {2,14,6,4,8,54,42,46,3,9};
		int bigNumber = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (bigNumber < array[i]) {
				bigNumber = array[i];
			}
		}
		
		int secondNumber = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == bigNumber) {
				continue;
			} else if (secondNumber < array[i]){
				secondNumber = array[i];
			}
		}
		System.out.println(secondNumber);
	}
}
