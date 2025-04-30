package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static org.example.ConnectionDetails.*;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {
        TruckService truckService = new TruckService();

        Truck tata = new Truck("TATA","2014",1500,"Adarsh Dayal");
        Truck ashokeLeyland = new Truck("AshokLeyLand","2010",1500,"Sanu Kumar");
        Truck bharatbenz = new Truck("BharatBenz","2015",1000,"Monu Singh");
        Truck eicher = new Truck("EICHER","2018",2000,"Pushpa Raj");
        Truck mahindra = new Truck("MAHINDRA","2016",1800,"Anand");

        // adding data into the DataBase;
//        truckService.addTruck(tata);
//        truckService.addTruck(ashokeLeyland);
//        truckService.addTruck(bharatbenz);
//        truckService.addTruck(eicher);
//        truckService.addTruck(mahindra);

    // deleting truck row
//        truckService.deleteTruck(6);
//        truckService.deleteTruck(7);
//        truckService.deleteTruck(8);
//        truckService.deleteTruck(9);
//        truckService.deleteTruck(10);




    }
}
