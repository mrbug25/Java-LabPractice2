package LabPractice2;
import java.awt.Color;
public class E210 {
    public static void main(String[] args) {
        Color brightColor = new Color(50, 100, 150);
        Color brighter = brightColor.brighter();
        System.out.println("The value of Red: " +brighter.getRed());
        System.out.println("The value of Green: " +brighter.getGreen());
        System.out.println("The value of Blue: " +brighter.getBlue());
    }
}
