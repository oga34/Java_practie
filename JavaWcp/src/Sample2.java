
/**
 * @author kii
 *
 */
public class Sample2 {
	public static int keisan(int x) {
		int goukei = x * 200;
		return goukei;
	}
	public static void main(String[] args) {
		int apple = 10;
		int result = keisan(apple);
		if(result > 3000)
			System.out.println("予算オーバーです");
		else
			System.out.println("予算以内で購入できます");
	}
}
