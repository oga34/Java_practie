class Sam {
	public static void main(String[] args) {
		Student Tarou = new Student();
		Tarou.num = 10;
		show(Tarou);
		System.out.println(Tarou.num);
	}
	public static void show(Student x) {
		System.out.println(x.num);
		x.num = 20;
	}
}