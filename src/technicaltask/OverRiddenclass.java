package technicaltask;

public class OverRiddenclass extends Baseclass{
	@Override
	public void method1() {
		System.out.println("It is a Over Ridden class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRiddenclass obj=new OverRiddenclass();
		obj.method1();
	

	}

}
