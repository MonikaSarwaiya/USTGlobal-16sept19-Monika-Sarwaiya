package com.ustglobal.objectclass;

public class TestCar {

	public static void main(String[] args) {
		 
         Car c = new Car(1400000, "Honda City", "Black");
         System.out.println(c);
         
         int h = c.hashCode();
         System.out.println(h);
         
         Car c1 = new Car(4000000, "BMW", "Black");
         System.out.println(c1);
         
         int h1 = c1.hashCode();
         System.out.println(h1);
         
         Car c2 = new Car(40000000, "Lemberghini", "Red");
         System.out.println(c2);
         
         int h2 = c2.hashCode();
         System.out.println(h2);
  
         }
}
