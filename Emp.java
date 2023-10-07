public class Emp {
    int empAge;
    String empName;
    //Defalut Constructor
    Emp()
    {
        System.out.println("Invoking Default Constructor");
        empAge=19;
        empName="om";
    }
    //Parametrized Constructor
    Emp(int age, String name)
    {
        empAge=age;
        empName=name;
    }
    void displayEmp()
    {
        System.out.println("age is"+empAge);
        System.out.println("Name is "+empName);
    }
    
}
