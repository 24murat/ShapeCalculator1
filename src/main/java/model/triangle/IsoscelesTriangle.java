package model.triangle;

public class IsoscelesTriangle extends Triangle{ //новый класс для равнобедренного треугольника
                                                 //наследуется от класса для треугольника

    public IsoscelesTriangle(double side, double base) {                //предлагается конструктор как
        super("Равнобедренный трегольник", side, side, base);     // в родительском классе
    }                                                                   // но для иннициализации
                                                                        // равнобедренного треугольника
                                                                        // достаточно два значения


    //переопределим текстовое описание: Alt+Insert -- Override Methods -- переопределим getPerimeter getSquare toString

    @Override
    public double getPerimeter() {
        return firstSide * 2 + thirdSide;
    }

    @Override
    public double getSquare() {
        return thirdSide * Math.sqrt(Math.pow(firstSide, 2) - Math.pow(thirdSide, 2) / 4) / 2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append("\nБоковая сторона: ").append(firstSide);
        builder.append("\nОснование: ").append(thirdSide);
        builder.append("\nПериметр: ").append(getPerimeter());
        builder.append("\nПлощадь: ").append(getSquare());
        return builder.toString();
    }
}
