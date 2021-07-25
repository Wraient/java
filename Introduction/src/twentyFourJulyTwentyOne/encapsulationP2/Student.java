package twentyFourJulyTwentyOne.encaptulation;

public class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }
    public String getname() {
        return name;
    }

    public String WeakestPass(){
        return "WeakPassword";
    } // Works in every class

    String MediumPass(){
        return "MediumPassword";
    } // Works only in this package

    private String StrongPass(){
        return "StrongPass";
    } // Works only in this class

    protected String VeryStrongPass(){
        return "StrongestPass";
    } // Only visible to child of this class

    public static void main(String[] args){
        Student obj1 = new Student("Ishan");
        System.out.println(obj1.getname());
        System.out.println(obj1.WeakestPass());
        System.out.println(obj1.MediumPass());
        System.out.println(obj1.StrongPass());
        System.out.println(obj1.VeryStrongPass());
    }
}
