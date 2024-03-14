import java.util.Scanner;
public class ProgramA1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Weight in KG");
        double Weight =sc.nextDouble();
        System.out.println("Enter height in meter");
        double Height=sc.nextDouble();
        double BMI  =Weight/(Height*Height);
        System.out.println("The BMI value is " + BMI);

        if(BMI<18.5){
            System.out.println("You are Under Weight");
        }else if(BMI<25){
            System.out.println("Your weight is Normal");
        }else if(BMI<30){
            System.out.println("You are Overweight");
        }else{
            System.out.println("You are Obese");
        }
    }
    
}
