import javax.swing.*;
import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
//        question 1
//        int a = 10;
////        if(a = 11)
//        if(a==11);
//        System.out.println("I am 11");

//        question 2
//        byte m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in physics");
//        m1 = sc.nextByte();
//
//        System.out.println("Enter your marks in mathematics");
//        m2 = sc.nextByte();
//
//        System.out.println("Enter your marks in chemistry");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your overall percentage is = "+avg );
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulation, You have been promoted");
//        }
//         else{
//            System.out.println("Sorry, You have not benn promoted! Please try again.");
//        }
//        question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in lakhs per annum");
//        float tax = 0;
//       float income = sc.nextFloat();
//       if(income<=2.5){
//           tax = tax + 0;
//       }
//       else if(income>2.5f && income<=5f){
//           tax = tax + 0.05f * (income - 2.5f);
//       }
//       else if(income>5f && income<=10f){
//           tax = tax + 0.05f * (5.0f - 2.5f);
//           tax = tax + 0.2f * (income - 2.5f);
//       }
//       else if(income>10.0f){
//           tax = tax + 0.05f * (5.0f - 2.5f);
//           tax = tax + 0.2f * (10.0f - 5f);
//           tax = tax + 0.3f * (income - 10.0f);
//       }
//        System.out.println("The total tax paid by the employee is: "+ tax);

//        question 4

//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//       switch (day){
//           case 1 -> System.out.println("Monday");
//           case 2 -> System.out.println("Tuesday");
//           case 3 -> System.out.println("Wednesday");
//           case 4 -> System.out.println("Thusday");
//           case 5 -> System.out.println("Friday");
//           case 6 -> System.out.println("Saturday");
//           case 7 -> System.out.println("Sunday");
//           default -> System.out.println("Invalid choose");
//       }

//        question 5
//        Scanner sc = new Scanner(System.in);
//     String website = sc.next();
//     if(website.endsWith(".org")){
//         System.out.println("This is an organisational website");
//     }
//     else if(website.endsWith(".com")){
//         System.out.println("This is a commercial website");
//     }
//     else if(website.endsWith(".in")){
//         System.out.println("This is an Indian website");
//     }
//        question 6
        System.out.println("Enter the year: ");
  Scanner sc = new Scanner(System.in);
  int year = sc.nextInt();
  if((year%4==0 && year%100!=0)||(year%400==0)){
      System.out.println("Its a leap year");
  }
  else{
      System.out.println("Its not a leap year");
  }
    }
}
