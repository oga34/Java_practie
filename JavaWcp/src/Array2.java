
public class Array2 {
	public static void keisan(int[] x) {
		int i;
		int sum = 0;
		for(i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("平均点：" + (sum / 3));
	}
	public static void main(String[] args) {
		int[] score = {64,78,94};
		keisan(score);
	}
}
