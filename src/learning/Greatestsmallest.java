package learning;

public class Greatestsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a[]= {2,6,1,7,9,10,13,56};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length-1;i++) {
			
			if(max>=a[i]) {
				max=a[i];
				
			}
		}
		System.out.println("Greatest number is "+max);
		
		for (int i=0;i<=a.length-1;i++) 
		{
			if(min<=a[i]) {
				min=a[i];
				
			}
			
		}
		System.out.println("Greatest number is "+min);
	}

}
