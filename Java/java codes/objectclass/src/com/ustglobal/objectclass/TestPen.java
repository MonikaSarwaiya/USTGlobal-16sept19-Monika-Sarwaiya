package com.ustglobal.objectclass;

public class TestPen {

	public static void main(String[] args) {
		Pen p = new Pen();
		int pHashCode = p.hashCode();
		System.out.println("HashCode of p "+pHashCode);
		p.write();
		
		Pen q = new Pen();
		int qHashCode = q.hashCode();
		System.out.println("HashCode of q "+qHashCode);
        q.write();
	}
}
