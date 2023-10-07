package ArrayDemo;

public class TwoDim {
    public static void main(String[] args) {
        int i, j;
        int [][]student={
            {100,80,90}, 
            {70,90,50},
            {60,50,40},
        };
        for (i=0;i<=2;i++){
            for (j=0; j<=2; j++) {
                System.out.print("\t"+student[i][j]);
            }
            System.out.println();
        }
    }
    
}
