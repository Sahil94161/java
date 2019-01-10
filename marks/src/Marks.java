import java.util.Scanner;
class Test
{
 public static void main(String[] args) {
Scanner obj= new Scanner(System.in);
int marks;
char grade;
System.out.print("Enter Marks :");
marks=obj.nextInt();
if(marks>=85)
{
grade='A';
}
else if(marks>=65)
{
grade='B';
}
else
{
grade='C';

}
System.out.println("Your Grade :"+grade);
 }
}