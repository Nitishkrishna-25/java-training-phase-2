class Vehicle{
    static  void  start()
    {
        System.out.println("I am Starting the vehicle");
    }
    static  void  stop()
    {
        System.out.println("I am going to stop my vehicle");
    }
    static  void  run()
    {
        System.out.println("my vehicle is running");
    }
}
class Car extends Vehicle
{
    static  void  run()
    {
        System.out.println("I am driving");
    }
}
class EvCar extends Car
{
    static void start()
    {
        System.out.println("My Ev is Starting by Motor");
    }
}
class Bike extends Vehicle
{
    static void gear()
    {
        System.out.println(" changing gear by leg");
    }
}
public class Main1
{
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        EvCar ev = new EvCar();
        ev.start();
        Bike b= new Bike();
        b.start();
        b.gear();
        b.stop();
    }
}