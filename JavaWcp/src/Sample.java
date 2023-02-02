
public class Sample {
	public static void main(String[] args) {
		int i, j;
		for(i = 1; i <= 9; i++) {
			System.out.print(i + "の段 : ");
			for(j = 1; j <= 9; j++) {
				System.out.print(String.format("%3s", i*j));
			}
			System.out.println();
		}
	}
}
