package model.quadrangle;

import model.ISquare;

public class Rectangle extends Quadrangle implements ISquare {

    public Rectangle(double firstSide, double secondSide) {
        super("Прямоугольник", firstSide, secondSide, firstSide, secondSide);
    }

    @Override
    protected double getPerimeter() {

        return (firstSide + secondSide) * 2;
    }

    @Override
    public double getSquare() {

        return firstSide * secondSide;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nПервая сторона: ").append(firstSide);
        builder.append("\nВторая сторона: ").append(secondSide);
        builder.append("\nПериметр: ").append(getPerimeter());
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }

}
