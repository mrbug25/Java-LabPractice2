package LabPractice2;
import java.awt.Rectangle;
public class E26 {

        public static void main(String[] args) {
            Rectangle box = new Rectangle(5, 10, 20, 30);
            box.add(0, 0);
            System.out.println(box.getX()+ " "+  box.getY()+ " "+ box. getWidth()+ " "+ box.getHeight());
        }
}
