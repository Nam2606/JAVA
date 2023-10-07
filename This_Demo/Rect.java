package This_Demo;

public class Rect {
    int width, height;
    Rect(int width, int height)
    {
        System.out.println("I'm in Parametrized Constructor");
        this.width=width;
        this.height=height;

    }
    void display()
    {
        int area;
        area= width*height;
        System.out.println("area of rectangle is"+area);
    }
    public static void main(String[]args)
    {
        Rect rect = new Rect(100,200);
        rect.display();
    }
}
