
public class BTM {
	static int totalCount;
	int count;
	void swipe() {
		count++;
		totalCount++;
	}
	int getCount() {
		return count;
	}
	int getTotalCount() {
		return totalCount;
	}
	public static void main(String args[]) {
		BTM b = new BTM();
		b.swipe();
	int count = b.getCount();
	System.out.println("Count is "+count);
	int totalCount = b.getTotalCount();
	System.out.println("Total Count is "+totalCount);
	}
}
