package org.example;

public class Truck {

    private String Name;
    private String Model;
    private int Capacity;
    private String DriverName;

    Truck(){

    }
    public Truck(String name, String model, int capacity, String driverName) {

        Name = name;
        Model = model;
        Capacity = capacity;
        DriverName = driverName;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    @Override
    public String toString() {
        return "Truck{" +
                ", Name='" + Name + '\'' +
                ", Model='" + Model + '\'' +
                ", Capacity=" + Capacity +
                ", DriverName='" + DriverName + '\'' +
                '}';
    }
}
