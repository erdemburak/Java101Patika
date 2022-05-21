package Class;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi A7", 10);
        audi.speedLimit = 240;
        audi.color = "Black";
        audi.increaseSpeed(20);
        audi.increaseSpeed(30);
        audi.increaseSpeed(50);
        audi.increaseSpeed(70);
        audi.printSpeed();
        System.out.println("=================");
        audi.printInfo();
        System.out.println();


        Car bmw = new Car("Bmw M5", 15);
        bmw.decreaseSpeed(10);
        bmw.printSpeed();
        bmw.color = "Blue";
        System.out.println("=================");
        bmw.printInfo();
        System.out.println();


        Car mercedes = new Car("Mercedes C380", 25);
        mercedes.increaseSpeed(10);
        mercedes.printSpeed();
        System.out.println("=================");
        mercedes.printInfo();
    }
}
