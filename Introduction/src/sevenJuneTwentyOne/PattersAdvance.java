package sevenJuneTwentyOne;
// import java.util.Scanner;

public class PattersAdvance {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // Astrisk Pyramid
        /*
        for(int i=1; i<=num; i++){
            for(int j=(num-i)*2; j>0; j--){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*       ");
                
            }
            System.out.println( );
        }
        */

        // Number Pyramid
        /* 
        int integer = 0;
        for(int i=1; i<=num; i++){
            for(int j=(num-i)*2; j>0; j--){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                integer +=1;
                if(integer>9){
                    System.out.print(integer + "      ");
                }
                else{
                    System.out.print(integer + "       ");}

            }
            System.out.println();
        } 
        */

        // Astrisk Arrow
        /* 
        for(int i=1; i<=(num*2)-1; i++){
            if(i<=num){
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                    }
                }
            else if(i>num){
                for(int k=1; k<=num; k++){
                    for(int j=num-k; j>0; j--){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            }
            System.out.println();
        }
        */
        
        //  Hollow Pyramid
        /* 
        for(int i=1; i<=num; i++){
            if(i==1 || i==num){
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=1; j<=num; j++){
                    if(j==1 || j==i){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        */
    }
}
