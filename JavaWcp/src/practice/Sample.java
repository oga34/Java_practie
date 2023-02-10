package practice;

class New{
		public int num;
		public New() {
			System.out.println("引数なし");
		}
		public New(int x) {
			System.out.println("引数あり:" + x);
		}
}

class Sample {
	public static void main(String[] args) {
		New Obj1, Obj2;
		Obj2 = new New(10);
	}
}
