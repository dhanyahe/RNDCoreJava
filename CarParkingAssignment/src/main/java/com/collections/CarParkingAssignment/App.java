package com.collections.CarParkingAssignment;

import com.collections.CarParkingAssignment.model.Customer;
import com.collections.CarParkingAssignment.model.ParkingId;
import com.collections.CarParkingAssignment.parkingOperations.ParkingOperations;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Customer cd1 = new Customer("abc","1234");
       Customer cd2 = new Customer("def","1234");
       Customer cd3 = new Customer("ghi","1234");
       Customer cd4 = new Customer("abc","1234");
       Customer cd5 = new Customer("def","1234");
       Customer cd6 = new Customer("ghi","1234");
       Customer cd7 = new Customer("abc","1234");
       Customer cd8 = new Customer("def","1234");
       Customer cd9 = new Customer("ghi","1234");
       Customer cd10 = new Customer("abc","1234");
       Customer cd11 = new Customer("def","1234");
       Customer cd12 = new Customer("ghi","1234");

       ParkingOperations p = new ParkingOperations();
       ParkingId pid=p.addCar(cd1);
       p.addCar(cd2);
       p.addCar(cd3);
       p.addCar(cd4);
       p.addCar(cd5);
       p.addCar(cd6);
       p.addCar(cd7);
       p.addCar(cd8);
       p.addCar(cd9);
       p.addCar(cd10);
       p.addCar(cd11);
       p.addCar(cd12);
       
       System.out.println(p.getAllDetails());
       ParkingId pid1= new ParkingId(5,1,1);
       System.out.println(p.retrieveByParkingId(pid1));

    }
}
