package Method_Overloading;

public class Operation {
    void add(int a, int b)
    {
        System.out.println("1st add is"+(a+b));
    }
    void add(int a, int b, int c)
    {
        System.out.println("1st add is"+(a+b+c));
    }
    void add(float a, int b)
    {
        System.out.println("1st add is"+(a+b));
    }
    double add(int a, double b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        
        Operation op = new Operation();
        op.add(10, 20);
        op.add(20, 30, 40);
        op.add(25, 10);
        op.add(100, 290);

    }
}
