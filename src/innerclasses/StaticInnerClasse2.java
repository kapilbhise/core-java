package innerclasses;

public class StaticInnerClasse2 {
	private static int data=12;
	static class XYZ{
		void message() {
			System.out.println("The value of data is "+data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticInnerClasse2.XYZ obj= new StaticInnerClasse2.XYZ();
		obj.message();
		

	}

}
