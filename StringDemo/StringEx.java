package StringDemo;

public class StringEx {
    public static void main(String[] args) {
        String s="Hello";
        System.out.println("length of the string is  "+s.length());

        String s1="Helloww";
        String s2= "Aptech";
        System.out.println("Character at index 0 is "+s1.charAt(0));
        System.out.println(s1.concat(s2));
        System.out.println("index of A is  "+s2.indexOf('A'));
        System.out.println("Last index of h "+s2.indexOf('h'));
        System.out.println("replace aptech  to kptech  "+s2.replace('A', 'K'));
        String s3="    Hello";
        System.out.println("Original s3 is "+s3);
        System.out.println("after using trim  "+s3.trim());
    }
    
}
