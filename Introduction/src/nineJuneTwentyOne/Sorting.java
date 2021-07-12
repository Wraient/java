package nineJuneTwentyOne;

public class Sorting {
    public static void main(String[] args){
        int list[] = {7,2,3,9,6,1,0};
        for(int item: list){
            System.out.print(item + " ");
        }
        System.out.println();
        // Bubble Sort
        /* 
        int temp = 0;
        for(int i=0; i<list.length; i++){
            boolean sorted = true;
            for(int j=0; j<(list.length-1-i); j++){
                if(list[j]>(list[j+1])){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    sorted = false;
                }
                for(int item: list){
                    System.out.print(item + " ");
                }
                System.out.println();
            }
            if(sorted) break;
        }
        */

        // Selective Sort
        /*
        for(int i=0; i<list.length-1; i++){
            int smallestInd = i;
            for(int j=i; j<list.length; j++){
                if(list[smallestInd]>list[j]){
                    smallestInd = j;
                }
            }
            int temp=list[i];
            list[i] = list[smallestInd];
            list[smallestInd] = temp;
        }

        for(int item: list){
            System.out.print(item +" ");
        }
        */
    }
}
