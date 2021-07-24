package twentyFourJulyTwentyOne.encapsulationP2;

public class encaptulation{
    public static void main(String[] args){
        Student loda = new Student("Abhijeet", 18);
        System.out.println(loda.name);
        System.out.println(loda.age);

        int age1 = 69;
        int age2 = 96;
        System.out.println(maxOf(age1, age2));

    }
    static int maxOf(int a, int b){
        return a>b ? a : b;
    }


}