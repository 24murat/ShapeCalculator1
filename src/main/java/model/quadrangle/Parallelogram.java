package model.quadrangle;

import model.ISquare;

public class Parallelogram extends Quadrangle implements ISquare {

    protected double height;

    public Parallelogram(double side, double base, double height) {
        super("Параллелограмм", side, base, side, base);
        this.height = height;
    }

    @Override
    protected double getPerimeter() {
        return (firstSide + secondSide) * 2;
    }

    @Override
    public double getSquare() {
        return secondSide * height;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nСторона: ").append(firstSide);
        builder.append("\nОснование: ").append(secondSide);
        builder.append("\nВысота: ").append(height);
        builder.append("\nПериметр: ").append(getPerimeter());
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }

}
