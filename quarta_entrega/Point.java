package quarta_entrega;

public class Point {
    public int x = 0, y = 0;

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            return getX() == other.getX() && getY() == other.getY();
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
}
