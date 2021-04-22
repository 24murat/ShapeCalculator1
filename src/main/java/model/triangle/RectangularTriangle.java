package model.triangle;

import model.ShapeType;

public class RectangularTriangle extends Triangle{

    public RectangularTriangle(double firstCathet, double secondCathet) {
        super("Прямоуогльный треугольник", firstCathet, secondCathet,
                getHypotenuse(firstCathet, secondCathet));
    }

    private static double getHypotenuse(double firstCathet, double secondCthet){ //static позволяет обращаться к
        return Math.sqrt(Math.pow(firstCathet, 2) + Math.pow(secondCthet, 2));   //методу в конструкторах
    }                                                                            //в любой точке класса

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getSquare() {
        return firstSide * secondSide / 2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nПервый катет: ").append(firstSide);
        builder.append("\nВторой катет: ").append(secondSide);
        builder.append("\nГипотенуза: ").append(thirdSide);
        builder.append("\nПериметр: ").append(getPerimeter());
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }
}
