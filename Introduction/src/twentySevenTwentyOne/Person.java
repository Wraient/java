package twentySevenTwentyOne;

public class Person {
    int age;
    String name;
    static String breed = "Homo Sapens";
    public static void main(String[] args) {
        Person obj = new Person();
        obj.age = 18;
        obj.name = "Homie";
        System.out.println(Person.breed); // Person.bread instead of obj.breed even if the both give the same result but using Person.breed is more efficient.
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(Math.round(3.4 + 3.09));
        System.out.println(Math.PI);
    }
}
