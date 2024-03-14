import java.util.Scanner;
class ProgramA1_1{
    public static void main(String [] args){
        System.out.println("The Grade of student");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percent");
        int value = sc.nextInt();
        
        
        if((value>70) && (value<100)){
            System.out.println("A");
        }
        else if(value>60 && value<71){
             System.out.println("B");
              }
              else if(value>40 && value<61){
                 System.out.println("C");

              }
              else if(value<40){
                 System.out.println("You failed the EXAM!");
              }
    }
}