package model.triangle;

public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(double side) {
        super("Равносторонний трегольник", side, side, side);
    }

    @Override
    public double getPerimeter() {
        return firstSide * 3;
    }

    @Override
    public double getSquare() {
        return Math.sqrt(3) / 4 * Math.pow(firstSide, 2);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nСторона: ").append(firstSide);
        builder.append("\nПериметр: ").append(getPerimeter());
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }
}

