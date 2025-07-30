public class Exercise_5 {
    public static void main(String[] args) {
//        question 1
        String name = "Anirudha Hota";
        name = name.toLowerCase();
        System.out.println(name);

//        question 2
        String text = "To my friend";
        text = text.replace(" ","_");
        System.out.println(text);

//        question 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Anil");
        System.out.println(letter);

//        question 4
        String mystring ="this string contains  single and double spaces";
        System.out.println(mystring.indexOf(" "));
        System.out.println(mystring.indexOf("  "));

//        question 5
        String myLetter = "Dear Anil,\n\tThis java course is nice.\nThanks!";
        System.out.println(myLetter);






    }
}
