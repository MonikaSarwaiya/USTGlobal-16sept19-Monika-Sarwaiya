package com.ustglobal.accessmodifier.pkg2;

public class Run {
	public static void main(String[] args) {
		Demo d = new Demo();
		//Private
		//System.out.println(d.a); private not visible
		//d.add();
		
		//Default
	    System.out.println(d.b);
	    d.sub();
	    
	    //Protected
	    System.out.println(d.d);
	    d.mul();
	    
	    //Public
	    System.out.println(d.name);
	    d.div();
	}
}
