package twentyJulyTwentyOne;


class Vehicle{
    int wheels = 5, headlights = 10;
    String color = "None";
    
    Vehicle(){
        
    }
    Vehicle(int wheels){
        this.wheels = wheels;
    }
    Vehicle(int wheels, int headlights){
        this.wheels = wheels;
        this.headlights = headlights;
    }
    Vehicle(int wheels, int headlights, String color){
        this.wheels = wheels;
        this.headlights = headlights;
        this.color = color;
    }
    Vehicle(String color){
        this.color = color;
    }
}

public class MyConstructor {
        public static void main(String[] args){
            Vehicle car1 = new Vehicle();
            System.out.println("wheels = " + car1.wheels + " lights = " + car1.headlights + " color = " + car1.color);
            Vehicle car2 = new Vehicle(2);
            System.out.println("wheels = " + car2.wheels + " lights = " + car2.headlights + " color = " + car2.color);
            Vehicle car3 = new Vehicle(4, 2);
            System.out.println("wheels = " + car3.wheels + " lights = " + car3.headlights + " color = " + car3.color);
            Vehicle car4 = new Vehicle(3, 4, "Yellow");
            System.out.println("wheels = " + car4.wheels + " lights = " + car4.headlights + " color = " + car4.color);
            Vehicle car5 = new Vehicle("Blue");
            System.out.println("wheels = " + car5.wheels + " lights = " + car5.headlights + " color = " + car5.color);
            Vehicle car6 = new Vehicle(69, 70);
            System.out.println("wheels = " + car6.wheels + " lights = " + car6.headlights + " color = " + car6.color);
    }
}
