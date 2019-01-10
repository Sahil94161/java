class Test
{
int a,b;
Test(int x, int y)
{
    System.out.println("Deafult constructor");
    a=x;
    b=y;
    
}
void disp()
{
    System.out.println("addition="+(a+b));
}
}

class Main
        {

    public static void main(String[] args) {
        Test obj=new Test(20,30);
        obj.disp();
    }
}