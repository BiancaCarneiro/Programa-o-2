package terceira_entrega;

public class Point {
    private int x = 0, y = 0; // Resposta da segunda questão

    // Resposta da primeira questão:
    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) {
        if (x >=0 && x <= 400){ // Resposta da questão 3
            this.x = x;
        }
    }
    public void setY(int y) {
        if (y >=0 && y <= 400){ // Resposta da questão 3
            this.y = y;
        }
    }

    public void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
}
