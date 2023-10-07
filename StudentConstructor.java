public class StudentConstructor {
    String name;
    int age;
    int marks;

    void initializeStudentConstructor()
    {
        name="om";
        age=19;
        marks=100;
    }
    void displayStudentConstructor()
    {
        System.out.println("Name of the Student:"+name);
        System.out.println("Age of Student-"+age);
        System.out.println("Marks obtained by Student:"+marks);
    } 
    public static void main(String[] args) {
        StudentConstructor st = new StudentConstructor();
        st.initializeStudentConstructor();
        st.displayStudentConstructor();
        System.out.println(st.name);

    }
}
