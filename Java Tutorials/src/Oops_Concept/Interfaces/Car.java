package Oops_Concept.Interfaces;

public class Car implements brakes,Engine,seats{
    @Override
    public void power() {
        System.out.println("this car has 150 HP of power");
    }

    @Override
    public void torque() {
        System.out.println("this car has 200 Nm of torque");
    }

    @Override
    public void front() {
        System.out.println("Disc brakes at front");
    }

    @Override
    public void rear() {
        System.out.println("disc brakes at rear");
    }

    @Override
    public void seatingCapacity() {
        System.out.println("this car has 5 seats");
    }

    @Override
    public void seatMaterial() {
        System.out.println("leather seats");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.front();
        c.rear();
        c.power();
        c.seatingCapacity();
    }
}
