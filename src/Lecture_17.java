import java.awt.*;

public class Lecture_17 {
    public static void main(String[] args) {

        /*  float [] marks = {98.1f ,65.2f, 76.5f, 78.6f, 87.3f};
        System.out.println(marks.length);
        System.out.println(marks [2]);
        String [] students = {"ANIL","HARRY","RUDRA","DIPAK"};
        System.out.println(students.length);
        System.out.println(students [0]);
        */
         int [] marks = {98,65,76,78,87};
        System.out.println(marks.length);

//        displaying the array (native way)
        System.out.println(marks [0]);
        System.out.println(marks [1]);
        System.out.println(marks [2]);
        System.out.println(marks [3]);
        System.out.println(marks [4]);

//      Displaying the array (for loop)
        System.out.println("printing using the loop");
        for (int i=0; i<marks.length;i++) {
            System.out.println(marks[i]);
        }
//        Quick quiz: Displaying the array in reverse order(for loop)
            System.out.println("printing using the loop in reverse order");
            for (int i=marks.length -1;i>=0;i--){
                System.out.println(marks[i]);

//                Quick quiz: Displaying the array (for-each loop)
                System.out.println("printing using for-each loop ");
                for (int element: marks){
                    System.out.println(element);
                }
            }

        }
    }

