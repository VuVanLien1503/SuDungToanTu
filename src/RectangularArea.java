import java.util.Scanner;


public class RectangularArea {
    public static void main(String[] args) {
       float width;
       float height;
        float area;
       Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Width :");
        width = scanner.nextFloat();

        System.out.println("Enter Height :");
        height = scanner.nextFloat();

        area = width*height;
        System.out.println("Area : "+area);

    }
}