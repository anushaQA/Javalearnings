package learning;

public class Student {
	
	int sid;
	String sname;
	char grade;
	
	void display() {
		System.out.println(sid+" "+sname+" "+grade);
	}
	
	void passingvalues(int id, String name, char g) {
		sid=id;
		sname=name;
		grade=g;
		
	}
	
	/* Student(int id, String name, char g) {
		sid=id;
		sname=name;
		grade=g;
	 } */
	 
	 Student(){
		 sid=20;
		 sname="anusha";
		 grade='P';
	 }
	 
	 Student(int id,String name,char h){
		 sid=id;
		 sname="";
		 grade='P';
	 }
	 
	

}
