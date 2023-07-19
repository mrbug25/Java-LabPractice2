package LabPractice2;

public class E21 {
    public static void main(String[] args) {
        String originalString = "Mississippi";

        String replacedI = originalString.replace("i", "ii");
        System.out.println( replacedI.length());

        String finalString = replacedI.replace("ss", "s");
        System.out.println(finalString.length());
    }

}
