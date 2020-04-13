import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Scanner in=new Scanner(System.in);
        int r = in.nextInt();
        circle.setRadius(r);
        circle.disp();

    }
}
