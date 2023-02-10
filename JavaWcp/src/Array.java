import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int i;
		System.out.println("要素数はいくつですか？");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int[] array = new int[num];
		System.out.println("数値を入力してください");
		for(i = 0; i < num; i++) {
			array[i] = obj.nextInt();
		}
		System.out.println("入力した数はこちらです");
		for(i = 0; i < num; i++) {
			System.out.println(i + "番目" + array[i]);
		}
	}
}
