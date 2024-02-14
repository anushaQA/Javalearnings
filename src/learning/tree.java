package learning;

public class tree {
	String fruit="Apple";
	void season1() {
		System.out.println("It's time for apples");
		
	}
}
class plants extends tree
{
	String fruit ="Mango";
	void season1() {
		System.out.println("It's time for mango");
		System.out.println(super.fruit);
		super.season1();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree t=new tree();
		
		t.season1();

	}

}
