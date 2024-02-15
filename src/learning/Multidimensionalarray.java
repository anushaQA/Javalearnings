package learning;

public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][2];
		
		a[0][0] = 100;
		a[0][1] =200;
		
		a[1][0]= 101;
		a[1][1]=201;
						
		a[2][0]=301;
		a[2][1]	=302;
		
		int b[][]= {{200,300},{400,500},{600,700}};
		System.out.println("Number of rows: "+b.length);
		
		System.out.println("Number of coloumns" +b[0].length);
		
	/*	for(int i=0;i<b.length;i++) {
			for (int j=0;j<b[i].length;j++) {
				System.out.println(b[i][j]); 
			
			}
}*/


		for(int i[]:b) {
			
			for(int s:i) {
				System.out.println(s);
			}
			
		}
				

	}

}
