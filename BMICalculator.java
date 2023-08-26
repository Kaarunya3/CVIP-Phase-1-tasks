import java.util.*;
class BMICalculator
{
    public static void main(String args[])
    {
	Scanner s=new Scanner(System.in);
        float bmi=0;
        System.out.println("Enter your weight in kgs");
        float weight=s.nextFloat();
        System.out.println("Enter your height in meters");
        float height=s.nextFloat();
        if(weight>0 && height>0)
        {
            bmi=weight/(height*height);
        }
        else
        {
            System.out.println("Enter valid weight and height");
        }
        System.out.println("Your BMI is "+ bmi);
        if(bmi<18.5)
        {
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<25)
        {
            System.out.println("Normalweight");
        }
        else if(bmi>=25 && bmi<30)
        {
            System.out.println("Overweight");
        }
        else if(bmi>30 && bmi<35)
        {
            System.out.println("Obese");
        }
        else{
            System.out.println("Morbid Obesity");
        }
    }
}