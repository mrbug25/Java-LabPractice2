package LabPractice2;
import java.awt.Rectangle;
public class E24 {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(0,0, 5,9);
            double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
            System.out.println(perimeter);
        }
}
