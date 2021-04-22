package model.quadrangle;

import model.ISquare;

public class Trapeze extends Quadrangle implements ISquare {

    double height;

    public Trapeze(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        super("Трапеция", firstSide, secondSide, thirdSide, fourthSide);
        double diffSide = fourthSide - secondSide;
        height = Math.sqrt( Math.pow(firstSide, 2) - Math.pow(
                (Math.pow(diffSide, 2) + Math.pow(firstSide, 2) - Math.pow(thirdSide, 2))
                        / 2 / (diffSide), 2) );
    }

    @Override
    public double getSquare() {
        return (secondSide + fourthSide) / 2 * height;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("\nПлощадь: ").append(getSquare());
        builder.append("\nВысота: ").append(height);
        return builder.toString();
    }
}
