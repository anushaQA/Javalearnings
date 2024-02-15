package learning;

public class Assignment {

	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub
		int a[]={4,6,9,2,3};
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			if (a[i]%2==0)
			{
				System.out.println("Array contains even number"+a[i]);
			} else if(a[i]%2!=0)
			{
				System.out.println("Array contains odd number"+a[i]);
			}
			
			// sum =sum+a[i];
			
		}

		//System.out.println("Sum of array"+sum); 
	}

}
