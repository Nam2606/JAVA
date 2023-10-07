package Constructor_Overloading;

public class Student {
    int marks, rollno;
    String email, name;
    Student(int marks, int rollno)
     { 
       System.out.println("I'm in 1st Constructor"); 
       this.marks=marks;
       this.rollno=rollno;
    }
    Student(int marks, int rollno, String name)
    {
        System.out.println("I'm in 2nd Constructor");
        this.marks=marks;
        this.rollno=rollno;
        this.name=name;
    }
    Student(String email, int marks, int rollno)
    {
        System.out.println("I'm in 3rd Constructor");
        this.email=email;
        this.marks=marks;
        this.rollno=rollno;
    }
    void display()
    {
        System.out.println("Marks obtained by student"+marks);
        System.out.println("Roll no of the student"+rollno);
        System.out.println("Email of the student"+email);
        System.out.println("Name of the student"+name);
    }
    public static void main(String[] args){
        Student st1= new Student(100,101);
        st1.display();
        Student st2= new Student("namrata@mes", 100, 101);
        st2.display();
        Student st3= new Student(99,101,"Chakli");
        st3.display();


    }
    
    
}
