public class dog2 extends Animal {
	private int numberOfLegs;
	private boolean hasOwner;
	
	public dog2() {
		numberOfLegs = 4;
		hasOwner = false;
	}
	private static void bark() {
		System.out.println("woof");
	}
	public static void move() {
		System.out.println("running");
	}
	public static void main(String [] args) {
		Animal.sleep();
		bark();
		Animal.eat();
		move();
		
	}
}