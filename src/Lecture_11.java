import java.util.Scanner;

public class Lecture_11 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if (age>46){
            System.out.println("You are semi-experienced!");
        }
        else if (age>36){
            System.out.println("You are semi-semi experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }
        String var = "rudra" ;

        switch (var){
            case "shubham" :
                System.out.println("You are going to become an Adult!");
                break;
            case "rudra" :
                System.out.println("You are going to join a Job!");
                break;
            case "sambit" :
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using my java code!");
    }
}
