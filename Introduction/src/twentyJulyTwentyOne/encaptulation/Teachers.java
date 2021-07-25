package twentyJulyTwentyOne.encaptulation;

public class Teachers {
    public static void main(String[] args){
        Student obj = new Student("Ajay");
        System.out.println(obj.getname());
        System.out.println(obj.WeakestPass());
        System.out.println(obj.MediumPass());
        // System.out.println(obj.StrongPass()); // Not Visible

    }

}
