package sixJuneTwentyOne;
// import java.util.Scanner;

public class MoreForLoops {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        
        // int integer = sc.nextInt();

        // Factorial
        /*
        float facOf = integer;
        for(int i=(int)facOf-1; i>0; i--){
            facOf*=i;
        }
        System.out.println(facOf);
        */

        // Fibonacci numbers
        /*
        int a = 0, b = 1;
        for(int i=0; i<integer; i++){
            System.out.print(a + " ");
            int  c = a + b;
            a = b;
            b = c;     
        }
        */

        // power
        /*
        System.out.println("Enter the power : ")
        int power = sc.nextInt();
        float sum = (float)integer;
        for(int i=0; i+1<power; i++){
            sum *= integer;
        }
        System.out.println(integer + " to the power " + power + " is " + sum);
        */

        // Prime Number
        /*
        boolean run = true;
        for(int i=2; i<integer; i++){
            if(integer%i==0){
                System.out.println(integer + " is not a prime number.");
                run = false;
                break;
            } else if(run){
                System.out.println(integer + " is a prime number");
                break;
            }
        }
        */

        // Series sum
        /*
        double sum = 1.0;
        for(float i=2; i<=integer; i++){
            sum += 1/i;
        }
        System.out.println(sum);
        */

        // Series sum 2
        /*
        float sum = 0;
        for(float i=1; i<=integer; i++){
            if(i%2==0){
                sum -= 1/i;
            }
            else{
                sum += 1/i;
            }
        } 
        System.out.println(sum);
        */

    }    
}
