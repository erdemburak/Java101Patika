package Class;

public class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    Car(String model, int speed){
        this.model = model;
        this.speed = speed;
        this.color = "Red";
    }

    void increaseSpeed(int increment){
        if ((speed+increment) < speedLimit){
            this.speed += increment;
        }
    }
    void decreaseSpeed(int decrease){
        if (this.speed > 0){
            this.speed -=decrease;
        }
    }

    void printSpeed(){
        System.out.println(this.model + " Hızı : " + this.speed);
    }

    void printInfo(){
        System.out.println("Model : " + this.model);
        System.out.println("Speed : " + this.speed);
        System.out.println("Color : " + this.color);
    }
}
