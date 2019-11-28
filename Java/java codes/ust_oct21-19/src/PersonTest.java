
public class PersonTest {
public static void main(String[] args) {
		Person p = new Person();
		p.age = 22;
		Person.color = "fair";
		p.name = "DK";
		//p.color = "white";
		
		System.out.println("Person name is "+p.name);
        System.out.println("Person color is "+Person.color);
        System.out.println("Person age is "+p.age);
      //System.out.println("Person color is "+p.color);
        
        Person.sleep();
        p.eat();
        p.walk();
        
        System.out.println("-----------------------------------");
        
        Person p1 = new Person();
		p1.age = 22;
		p1.name = "Deepesh";

		System.out.println("Person p1 name is "+p1.name);
        System.out.println("Person p1 age is "+p1.age);
        
        Person.sleep();
        p1.eat();
        p1.walk();
	}

}
