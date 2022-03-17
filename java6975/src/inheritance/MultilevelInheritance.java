package inheritance;

class Semester1
{

int math, c, cpp; 

void input() 
{
 math=50;
 c=60;
 cpp=70;
}
public void output() 
{
System.out.println("Result of Semester-1 \n\n");
 System.out.println("Marks in Mathematics "+math);
 System.out.println("Marks in C-language "+c);
 System.out.println("Marks in CPP "+cpp);
 System.out.println("----------------------------------------");
}
}

class Semester2 extends Semester1
{
	
 int java, dbms, eng; 

 public void input2() 
 {
 java =55;
 dbms=88;
 eng=65;
 }
 public void output2()
 {
 System.out.println("\n\nResult of Semester-2\n");
 System.out.println("Marks in Java "+java);
 System.out.println("Marks in DBMS "+dbms);
 System.out.println("Marks in English "+eng);
 System.out.println("----------------------------------------");
 }
}

class Sem3 extends Semester2
{
 int mis, dm, android;
 
 public void input3()
 {
 mis =65;
 dm=88;
 android=65;
 }
 public void output3()
 {
 System.out.println("\n\nResult of Semester-3 \n");
 System.out.println("Marks in MIS "+mis);
 System.out.println("Marks in DM "+dm);
 System.out.println("Marks in Android "+android);
 }
}

class MultilevelInheritance
{
public static void main(String args[])
{
 Sem3 obj = new Sem3();
 obj.input();
 obj.input2();
 obj.input3();
 obj.output();
 obj.output2();
 obj.output3();
}
}