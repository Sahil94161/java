
import java.util.*;


class test
{
    public static void main(String[] args) {
        int roll;
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter Roll No:");
        roll=obj.nextInt();
        switch(roll)
        {
            case 100:
                System.out.println("Ram");
                break;
            case 101:
                System.out.println("Shyam");
                break;
            case 102:
                System.out.println("sita");
                break;
            default:
                System.out.println("Invild Entry");
        }
        
        
    }

}