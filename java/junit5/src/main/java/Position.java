import java.util.Objects;

public class Position {
    int xAxis, yAxis;

    public Position(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public int getxAxis() {
        return xAxis;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return getxAxis() == position.getxAxis() && getyAxis() == position.getyAxis();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getxAxis(), getyAxis());
    }
}
