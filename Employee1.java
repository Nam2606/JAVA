import java.util.Scanner;

    class Employee1 
    {
    int ID;
    String NAME;
    double SALARY;

    void display()
     {
        System.out.println("Employee ID: " + ID);
        System.out.println("Employee Name: " + NAME);
        System.out.println("Employee Salary: " + SALARY);
    }
    
    Employee1(int ID, String NAME, double SALARY) 
    {
        this.ID = ID;
        this.NAME = NAME;
        this.SALARY = SALARY;
    }
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int ID = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        scanner.nextLine(); 
        String NAME = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double SALARY = scanner.nextFloat();

        
        Employee1 emp = new Employee1(ID,NAME,SALARY);

        System.out.println("\nEmployee Information:");
        emp.display();

        scanner.close();
    }
}
