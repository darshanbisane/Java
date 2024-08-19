package Training;

public class TaskI
{
    int c;
    static int e;
    TaskI ()
    {
        System.out.println(++c);
        System.out.println(++e);
    }
    public static void main(String []args)
    {
        int a=34;
            int b=21;            
            new TaskI().c-=a++ + ++b ;
            int d=--a + --b + new TaskI().c--;
            e=a + +b + +new TaskI().c + d--;
            
            
            int f=-a + b-- + -new TaskI().c - d++;
            
            int sum= a+ b + new TaskI().c + d + e + f;
            System.out.println("sum="+ sum);   
}
}