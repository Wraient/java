package twentyFourJulyTwentyOne.encapsulationP2;

class Student{
    String name;
    int age = 13;
    Student(String name){
        this.name = name;
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
