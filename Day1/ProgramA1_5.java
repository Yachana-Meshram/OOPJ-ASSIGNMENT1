
import java.util.Scanner;

class ProgramA1_5 {
    static boolean vowel(char ch){
        return ch =='a'|| ch =='e'|| ch =='i'||ch =='o'||ch =='u';
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Character");
        char character=sc.next().charAt(0);
        
        if(vowel(character)){
            System.out.println("The character '" +  character + "' is vowel.");
        }else{
            System.out.println("The character '"+  character +" 'is consonant.");
        }
        
    
    }
}
