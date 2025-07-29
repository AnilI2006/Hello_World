public class Lecture_8 {
    public static void main(String[] args) {
        String name = "Anil";
//        System.out.println(name);
        int value = name.length();
        System.out.println(value);

//        String lstring = name.toLowerCase();
//        System.out.println(lstring);
//
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);
//
//        String nonTrimmedString = "   Anil    ";
//        System.out.println(nonTrimmedString);
//        String trimmedString;
//        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));

        System.out.println(name.replace('l','t'));
        System.out.println(name.replace("l","rudha"));

        System.out.println(name.startsWith("ru"));
        System.out.println(name.startsWith("Ani"));
        System.out.println(name.endsWith("Ani"));

        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("n"));

        String modifiedname = "Anilnil";
        System.out.println(modifiedname.indexOf("nil",3));
        System.out.println(modifiedname.lastIndexOf("nil"));

        System.out.println(name.equals("Anil"));
   }
}
