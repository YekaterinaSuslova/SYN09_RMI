package syn.rmi;

import java.io.Serializable;

// Класс "Персона" с сериализацией для поддержки RMI
public class Value implements Serializable {

    private static final long serialVersionUID = 1L;
    private double x, a, b;
    private double y;

    public Value(double x, double a, double b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("\na = %s\nb = %s\nx = %s\ny = %.3f", a, b, x, y);
    }
}
