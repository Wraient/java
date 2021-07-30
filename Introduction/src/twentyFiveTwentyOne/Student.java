package twentyFiveTwentyOne;

public class Student {
    private String name;
    private int age;

    // Set name

    Student(String name){
        this.name = name;
    }

    Student(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // Set name and age

    Student(String name, int age){
        if(age>20){
            System.out.println("You are too old to be a student");
        }
        else{
            this.name  = name;
            this.age = age;
        }
    }

    public String getNameAndAge(){
        return name + " " + age;
    }

    public void setNameAndAge(String name, int age){
        if(age>20){
            System.out.println("You are too old to be a student");
        }else{
            this.name = name;
            this.age = age;
        }
    }

}
