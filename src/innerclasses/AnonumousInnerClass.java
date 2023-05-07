package innerclasses;

abstract class Person{
	abstract void show();
}
public class AnonumousInnerClass {
	public static int data=20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person obj= new Person() {
			void show() {
				System.out.println("The value of daata is "+ data);
			}
		};
		obj.show();
	}

}
