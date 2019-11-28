class BMI1
{
     public static void main(String args[])
     {
          int weight = 55;
          double height = 1.7;
          double bmi;
          bmi = weight / (height * height);
          System.out.println("BMI is = "+bmi);
          if(bmi > 40)
          {
          System.out.println("Out of Range");
          }
          else if(bmi >=30 && bmi <= 39.9)
          {
          System.out.println("Obese Range");
          }
          else if(bmi >=25)
          {
          System.out.println("Overweight Range");
          }
          else if(bmi >=18.5)
          {
          System.out.println("Healthy Weight Range");
          }
          else if(bmi < 18.5)
          {
          System.out.println("Underweight Range");
          }
     }
}