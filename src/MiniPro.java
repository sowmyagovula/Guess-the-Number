import java.util.Scanner;

public class MiniPro {
    public static void main(String[] args) {
        // Mini Project
        int givenNum = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int guess = 0;
        while(true){
            System.out.print("Enter your Guess (1- 100): ");
            guess = sc.nextInt();
            if (guess == givenNum){
                System.out.println("Huraayyy!!! you Won the Game.....");
                break;
            }
            else if (guess< givenNum){
                System.out.println("Please Enter Bigger Number....");
            }
            else if (guess> givenNum){
                System.out.println("Please Enter Smaller Number....");
            }
            else
                System.out.println("Please Enter Valid Number....");

        }
    }
}
