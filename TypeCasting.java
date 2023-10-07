public class TypeCasting {
    //type casting -implicit-lower to higher
    public static void main(String args[]){
    int a,b;
    a=10;
    b=20;
    float a1,b1,div;
    a1=a;
    b1=b;
    div=a1/b1;
    System.out.println("div is"+div);

    
    //type casting -implicit-higher to lower
        float a2=10.25f;
        int add=(int)a2+5;
        System.out.println("sum is"+add);

    }
    
}
