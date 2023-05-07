package innerclasses;

public class LocalInnerClass {
	private int data=10;
	void show() {
		class ABC3{
			void display() {
				System.out.println("The value of data is "+ data);
			}
		}
		ABC3 obj= new ABC3();
		obj.display();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass obj=new LocalInnerClass();
		obj.show();
	}

}
