package Test;

//Abstract class representing a vehicle
abstract class Vehicle {
 private String brand;
 private String color;
 
 public Vehicle(String brand, String color) {
     this.brand = brand;
     this.color = color;
 }
 
 public abstract void start();  // Abstract method to start the vehicle
 
 public void displayInfo() {
     System.out.println("Brand: " + brand);
     System.out.println("Color: " + color);
 }
}

//Concrete class representing a Car
class Car extends Vehicle {
 public Car(String brand, String color) {
     super(brand, color);
 }
 
 @Override
 public void start() {
     System.out.println("Starting the car...");
     // Code to start the car
 }
}

//Concrete class representing a Bike
class Bike extends Vehicle {
 public Bike(String brand, String color) {
     super(brand, color);
 }
 
 @Override
 public void start() {
     System.out.println("Starting the bike...");
     // Code to start the bike
 }
}

//Main class to demonstrate the abstraction
public class AbsTest {
 public static void main(String[] args) {
     Vehicle car = new Car("Toyota", "Red");
     car.displayInfo();
     car.start();
     
     System.out.println();
     
     Vehicle bike = new Bike("Honda", "Black");
     bike.displayInfo();
     bike.start();
 }
}
