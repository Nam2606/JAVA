import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Enter your Greetings");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        System.out.println("Enter Time AM, NOON,PM");
        String time = sc.nextLine();
        switch(type)
        {
            case "GOOD MORNING":
                                System.out.println("GOOD MORNING");
                                switch (time)
                                {
                                    case "AM":
                                                System.out.println("AM");
                                                break;
                                    default:
                                                System.out.println("not valid time");
                                                break;

                                }
                                break;
            case "GOOD AFTERNOON":
                                 System.out.println("GOOD AFTERNOON");
                                 switch (time)
                                {
                                    case "NOON":
                                                System.out.println("NOON");
                                                break;
                                    default:
                                                System.out.println("not valid time");
                                                break;

                                }

                                 break;
            case "GOOD EVENING":
                                System.out.println("GOOD EVENING");
                                switch (time)
                                {
                                    case "PM":
                                                System.out.println("PM");
                                                break;
                                    default:
                                                System.out.println("not valid time");
                                                break;

                                }
                                break;
            default: 
                    System.out.println("Your input not match");
                    break;
                                
                                

        }
    }
}
