import java.util.Scanner;

public class UserInput {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    float r = sc.nextFloat();
    int t = sc.nextInt();
    
    float UserInput = p*r*t/100;
    System.out.println("The Simple Intrest is"+ UserInput); 
    sc.close();

    }
}
