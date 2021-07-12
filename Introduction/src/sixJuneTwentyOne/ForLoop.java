package sixJuneTwentyOne;

public class ForLoop {
    public static void main(String[] args) {
        /*
        int rating = 5;
        switch(rating){
            case 1:
            case 2:
                System.out.println("Bad");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 4:
            case 5:
                System.out.println("Good");
                break;
        }
        */

        /*
        for(int i = 0; i<100; i+=1){
            System.out.println("Hello world " + i);
        }  
        */

        /*
        int sum=0;
        for(int i=0; i<=100; i++){
            sum += i;
        }
        System.out.println(sum);
        */

        int facOf = 10;
        for(int i=facOf-1; i>0; i--){
            facOf *= i;
            // sum = sum*i;
        }
        System.out.println(facOf);

    }
    
}
