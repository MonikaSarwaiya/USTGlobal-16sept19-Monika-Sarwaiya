class TestA
{
    public static void main(String args[])
    {
         int a = 10;
         int b = 20;
         int c = a++ + b;
         System.out.println("c is "+c);
         int x = 10;
     //  System.out.println("x is "+10++); Error 
         x++;
         System.out.println("x is "+x);
         ++x;
         System.out.println("x is "+x);
         c = ++a + b;
         System.out.println("c is "+c);     
    }
}