//Calculate Circumference of a circle.
class Circumference
{
  static double circum(double r)
  {
      double d = 2 * 3.14 * r;
      return d;
  }
  public static void main(String args[])
  {
      double d = circum(3);
      System.out.println(d);
  }
}