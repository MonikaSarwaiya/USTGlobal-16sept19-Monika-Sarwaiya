class Operators
{
  public static void main(String[] args)
  {
      int a = 10;
      double b = a;
      System.out.println("a is "+a);
      System.out.println("b is "+b);
      double c = 20.6;
   // int d = c; Error storing higher data type into lower
      System.out.println("c is "+c);
      int x = 10;
      double y = 28.7;
      double z = x + y;
      System.out.println("z is "+z);
      int p = 5/2;
      System.out.println("p is "+p);
      int j = 7;
      double k = 2.0;
   // int l = 7/2.0; Error:Incompatible type
   // System.out.println("l is "+l);
      double l = 7/2.0;
      System.out.println("l is "+l); 
  }
}