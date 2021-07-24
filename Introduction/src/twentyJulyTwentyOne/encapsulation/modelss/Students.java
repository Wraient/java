package twentyJulyTwentyOne.encapsulation.modelss;

public class Students {
    public String WeakPassword(){
        return "PasswordIsVeryWeak";
    } // can work anywhere

    String MediumPassword(){
        return"PasswordIsPassive";
    } // can only work with this package

    private static String StrongPassword(){
        return "PasswordIsPrettyStrong";
    } // can only work in this class

    protected String StrongestPassword(){
        return "PasswordIsVeryStrong";
    } // can only work with child

    public static void main(String[] args){
        System.out.println(StrongPassword());
    }

}
