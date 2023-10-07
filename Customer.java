public class Customer {
    String custName="Om";
    String custAdresss="Kamothe";
    
    void changeAdress(String add)
    {
        custAdresss = add;
    }
    void display()
    {
        System.out.println("Name is"+custName);
        System.out.println("Adress is"+custAdresss);
    }

}
