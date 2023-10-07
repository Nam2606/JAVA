import java.util.Scanner;

public class CircleDemo
 {
 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius value");
        int radius= sc.nextInt();
        final float pi=3.14f;
        float area= pi*radius*radius;
        System.out.println("area of circle is "+area);
    }
    


    
}
