import java.util.Scanner;
class Jeet
{
    public static void main(String[] args)
    {
        int a,b,c;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        a=sc.nextInt();
        System.out.println("enter second number:");
        b=sc.nextInt();
        
        
        System.out.println("####### Menu Bar#######");
        System.out.println("press 1 for mul.");
        System.out.println("press 2 for sub.");
        System.out.println("press 3 for divide");
        System.out.println("press 4 for sum ");
        System.out.println("Enter the number for your choice");
        c=sc.nextInt();
         if(c==1)
             {
             System.out.println("muli.="+(a*b)); 
            }
         else if(c==2)
         {
             System.out.println("sub.="+(a-b));
         } 
         else if(c==3)
         {
             System.out.println("divide="+(a/b));
         }
         else if(c==4)
         {
             System.out.println("sum="+(a+b));
    }
}
}    