public class Lecture_10 {
    public static void main(String[] args) {
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
        if (a && b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println("For Logical OR...");
        boolean c = true;
        boolean d = false;
        if (c || d){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println("For Logical Not");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
