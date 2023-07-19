package LabPractice2;
import java.util.Random;
public class E214 {

    public static void main(String[] args) {
        Random randomPrice = new Random();
        System.out.println(randomPrice.nextDouble() * (19.95 - 10.00) + 10.00);
    }
}
