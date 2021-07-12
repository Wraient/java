package sixJuneTwentyOne;

public class NestedIfElse {
    public static void main(String[] args){
        /*
        int grade = 10;
        if (!(grade==10 || grade == 12)){
            System.out.println("You CANT give the board exam.");
        }else {
            System.out.println("You are fucked");
        }
        */
        int a = 10, b = 5, c = 7;
        // int result = 0;
        System.out.println(a > b || c > b ? a > c ? "Greatest number is " + a : "Greatest number is " + c : "Greatest number is " + b);
        /*
        if (a>b || c>b){
            if (a>c) {
                result = a;
            } else {
                result = c;
            }
        } else {
            result = b;
        }
        */
        // System.out.println("Greatest number is " + result);

    }
    
}
