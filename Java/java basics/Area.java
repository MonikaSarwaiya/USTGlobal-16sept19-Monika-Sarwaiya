//Calculate Area of a circle.
class Area
{
  static double area(double r)
  {
      double d = r * 3.14 * r;
      return d;
  }
  public static void main(String args[])
  {
      double d = area(5.5);
      System.out.println(d);
  }
}