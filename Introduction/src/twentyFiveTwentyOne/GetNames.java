package twentyFiveTwentyOne;

public class GetNames {
    public static void main(String[] args) {
        Student stud1 = new Student("Ramesh");
        System.out.println(stud1.getName());
        
        Student stud2 = new Student();
        System.out.println(stud2.getName());
        stud2.setName("RamKrishna");
        System.out.println(stud2.getName());
        System.out.println(stud2.getNameAndAge());
        
        Student stud3 = new Student("Hari", 28);
        System.out.println(stud3.getNameAndAge());
        stud3.setName("Hari Krishna");
        System.out.println(stud3.getNameAndAge());
        stud3.setNameAndAge("Haye Ram", 69);
        System.out.println(stud3.getNameAndAge());
    }
}
