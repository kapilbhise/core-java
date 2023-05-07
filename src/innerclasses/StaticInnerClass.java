package innerclasses;

public class StaticInnerClass {
	private int data=10;
	
	//non static inner class
	class ABC{
		void show() {
			System.out.println("The value of data is "+data);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInnerClass obj= new StaticInnerClass();
		ABC obj2= obj.new ABC();
		obj2.show();
	}

}
