package ArrayDemo;

public class EvenNumberArray {
    public static void main(String[] args) {
        int Numbers[][]={{15,16,75,42},
                         {80,18,92,75},
                         {15,26,37,12}};
        int i,j;

        System.out.println("Defined Array");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=3;j++)
                {
                    System.out.print("\t"+Numbers[i][j]);
                } 
            System.out.println();
        } 


        System.out.println("Display Of Even Numbers From The Array");

        
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=3;j++)
            {   
                 if(Numbers[i][j]%2==0)
                   {
                        System.out.print("\t"+Numbers[i][j]);
                   } 
            }
            System.out.println();
        }
        
    }  
}

