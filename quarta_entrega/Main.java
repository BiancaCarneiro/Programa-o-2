package quarta_entrega;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.setX(10);
        p1.setY(20);
        p2.setX(10);
        p2.setY(20);
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);
        p2.moveBy(10, 20);
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);
        ScreenPoint sp1 = new ScreenPoint();
        sp1.setX(10);
        sp1.setY(500);
        System.out.println(sp1);
    }
}
