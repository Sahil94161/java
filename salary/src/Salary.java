import java.util.Scanner;
class Test
{
 public static void main(String[] args) {
Scanner obj= new Scanner(System.in);
int Sal,b;
System.out.print("Enter your Salary:");
Sal=obj.nextInt();
if(Sal>=10000)
{
b=(Sal*10)/100;
Sal=Sal+b;
}        
else
{
b=(Sal*5)/100;
Sal=Sal+b;
}
System.out.println("your Salary + Bouns:"+Sal);
}

}
