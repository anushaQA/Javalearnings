package learning;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		int b=30;
	//	 int c = a+b;   // Arithmetic operators
		System.out.println("Addition: "+ (a+b));
		System.out.println("sub: "+ (a-b));
		System.out.println("Mul: "+ (a*b));
		System.out.println("Div: "+ (a/b));
		System.out.println("Mod: "+ (a%b));
		
		System.out.println("***Relational operators**");
		
		//Relational operators
		 System.out.println(a==b); //F
		 System.out.println(a>=b); //F
		 System.out.println(a<=b); //T
		 System.out.println(a>b);  //F
		 System.out.println(a<b);  //T
		 System.out.println(a!=b); //T
		 
		 System.out.println("***Logical operators**");
		  System.out.println((a<b)&&(a!=b));
		  System.out.println((a>=b)&&(a!=b)); 
		  
		 System.out.println("***Increment/decremental operators**");
		 
		 System.out.println(a++);
		 System.out.println(a--);
		 System.out.println(b++);
		 System.out.println(b--);
		 



	}

}
