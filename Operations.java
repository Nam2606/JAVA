public class Operations {
    
        float result=0;
        float sum()
        {
            int a,b;
            a=10;
            b=20;
            result=a+b;
            return result;
        }
        float div()
        {
            int a,b;
            a=10; 
            b=20;
            result=a/b;
            return result;
        }
        public static void main(String[] args)
         {
            Operations op=new Operations();
            System.out.println("sum is"+op.sum());
            System.out.println("div is"+op.div());
            
        }
    }
    
