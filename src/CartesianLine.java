/**
 * Created by sumanthm on 12/17/15.
 */
public class CartesianLine {

    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public CartesianLine(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double length() {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public boolean isEqual(int x1, int y1, int x2, int y2) {
        if (this.x1 == x1 && this.x2 == x2 && this.y1 == y1 && this.y2 == y2)
            return true;
        else return false;
    }

    public boolean equals(Object o)
    {
        CartesianLine line=(CartesianLine)o;
        if (line.x1 == x1 && line.x2 == x2 && line.y1 == y1 && line.y2 == y2)
            return true;
        if (line.x1 == x2 && line.x2 == x1 && line.y1 == y2 && line.y2 == y1)
            return true;
        return false;
    }
}


