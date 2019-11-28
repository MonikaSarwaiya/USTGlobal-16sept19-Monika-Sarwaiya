class TurnaryOperator
{
   public static void main(String args[])
   {
      int a = 10;
      int b = 20;
      int c = 30;

      int d = a > b ? a : b;
      int e = d > c ? d : c;
      System.out.println(e);
   }
}
