package Test;

//Interface for the first parent class
interface Parent1 {
	void method1();
}

//Interface for the second parent class
interface Parent2 {
	void method2();
}

//First parent class implementing Parent1 interface
class ParentClass1 implements Parent1 {
	public void method1() {
		System.out.println("Method 1 of ParentClass1");
	}
}

//Second parent class implementing Parent2 interface
class ParentClass2 implements Parent2 {
	public void method2() {
		System.out.println("Method 2 of ParentClass2");
	}
}

//Child class inheriting from ParentClass1 and implementing Parent2 interface
class ChildClass extends ParentClass1 implements Parent2 {
	public void method2() {
		System.out.println("Method 2 of ChildClass");
	}
}

//Main class to test the hybrid inheritance
public class HybridInheritanceExample {
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		child.method1(); // Method 1 of ParentClass1
		child.method2(); // Method 2 of ChildClass
	}
}
