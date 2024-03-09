package quarta_entrega;

public class ScreenPoint extends Point{
    @Override
    public void setX(int x) {
        if (x >=0 && x <= 300){
            super.setX(x);
        }
    }
    @Override
    public void setY(int y) {
        if (y >=0 && y <= 300){
            super.setY(y);
        }
    }
}
