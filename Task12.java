class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    // Ito yung scale method na kailangan mo
    public void scale() {
        this.x /= 2;
        this.y /= 2;
    }
}

public class Task12 {
    public static void main(String[] args) {
        // Gumawa ng point sa (32, 32)
        Point p = new Point(32, 32);

        // Loop para i-scale ng 5 beses
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}