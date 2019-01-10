import java.util.Scanner;
class Text
{
public static void main(String arg[])
{
    int no;
    Scanner obj= new Scanner(System.in);
    
    System.out.println("Enter a number:-");
    no=obj.nextInt();
    System.out.println("Sequre:-"+(no*no));
}
}