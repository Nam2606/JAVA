package ArrayDemo;

public class StudentMarks {
    int i;
    int marks[]=new int[6];
    void StoreMarks()
    {
        marks[0]=100;
        marks[1]=200;
        marks[2]=120;
        marks[3]=220;
        marks[4]=250;
    }
    void display()
    {
        for(i=0; i<6; i++)
        {
            System.out.println("Marks are"+marks[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("after display");
        StudentMarks st = new StudentMarks();
        st.StoreMarks();
        st.display();
    }

    
    
}
