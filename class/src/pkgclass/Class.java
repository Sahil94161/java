package pkgclass;

class Test
{
int a,b,c;
void getdata(int x,int y)
{
a=x;
b=y;
}
void disp()
{
    System.out.println("Addition="+(a+b));
}


}
class Main
        {
    public static void main(String[] args) {
        
        Test obj=new Test();
        obj.getdata(10,20);
        obj.disp();
    }

}
