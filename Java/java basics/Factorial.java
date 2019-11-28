class Factorial
{
  static int fact(int a)
  {
    int fact = 1;
    while(a > 0)
    {
     fact = fact*a;
     a--;
    }
    return fact;
  }
   public static void main(String args[])
   {
       int b = fact(5);
       System.out.println(b);   
   }
}