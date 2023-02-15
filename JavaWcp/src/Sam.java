interface Speak{
	void speak();
}
interface Hello extends Speak{
	void hello();
}

class Dog implements Hello{
	public void speak() {
		System.out.println("わんわん");
	}
	public void hello() {
		System.out.println("わんちゃんです");
	}
}

class Sam {
	public static void main(String[] args) {
		Dog Inu = new Dog();
		Inu.speak();
		Inu.hello();
	}
}