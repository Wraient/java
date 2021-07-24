package eighteenJulyTwentyOne;

public class Methods {
    public static void main(String[] args){
        int num1 = 69;
        int num2 = 96;
        System.out.println(maxOf(num1, num2));
    }
    static int maxOf(int a, int b){
        return a>b? a: b;
    }
}
