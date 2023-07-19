package LabPractice2;
import java.awt.Rectangle;
public class E23 {

        public static void main(String[] args) {

            Rectangle rectangle = new Rectangle(5, 10, 20, 30);

            int width = (int) rectangle.getWidth();
            int height = (int) rectangle.getHeight();

            int area = width * height;

            System.out.println("Calculated Area: " + area);
            System.out.println("Expected Area: " + (width * height));
        }
}
