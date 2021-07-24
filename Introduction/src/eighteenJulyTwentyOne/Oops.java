package eighteenJulyTwentyOne;

// only one public class in one file.

class dog{
    String name, breed;
    int legs, eyes;

    public void jump(){
        System.out.println("Your dog " + name + " is jumping");
    }

    public void description(){
        System.out.println("Your dog " + name + " has " + legs + " legs and " + eyes + " eyes");
    }
}

public class Oops{
    public static void main(String[] args){
        dog Loki = new dog();
        Loki.legs = 4;
        Loki.eyes = 2;
        Loki.name = "Yippe";
        Loki.jump();
        Loki.description();
        dog Seelvie = new dog();
        Seelvie.name = "Lol";
        Seelvie.legs = 2;
        Seelvie.eyes = 3;
        Seelvie.jump();
        Seelvie.description();

    }
}