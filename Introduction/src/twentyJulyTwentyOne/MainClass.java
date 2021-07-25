package twentyJulyTwentyOne;

import twentyJulyTwentyOne.encaptulation.Student;

public class MainClass {
    public static void main(String[] args){
        Student stud1 = new Student("Abhijeet");
        System.out.println(stud1.getname());
        System.out.println(stud1.WeakestPass());
        // System.out.println(stud1.MediumPass()); // Not Visible
        // System.out.println(stud1.StrongPass()); // Not Visible

    }
}
