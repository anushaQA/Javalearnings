package learning;

public class Advanceforloopforarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int a[] = new int[5];
		int b[] = {3,4,5,6,9,0,34 };
	/*	b[0]=145;
		b[1]=678;
		b[2]=435;
		b[3]=435;
		b[4]=523;
		//a[5]=6; */
		
		System.out.println("lenght of the array is :" + b.length);
/*		for(int i=0;i<b.length ;i++) {
			System.out.println(b[i]);  
		}*/
		
		//Advanced for loop
	
		
		for(int i:b) {
			
			System.out.println(i);
			

	}

}
}
