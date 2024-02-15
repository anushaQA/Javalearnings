package learning;

public class Overloadingandoverriding {

	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, double b) {
		System.out.println(a+b);
	}
	void add(double a, double b) {
		System.out.println(a+b);
	}
	void add(float a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloadingandoverriding ol =new Overloadingandoverriding();
		ol.add(2.3, 9);
		ol.add(36.90, 45.98);
		ol.add(4, 4);

	}

}
