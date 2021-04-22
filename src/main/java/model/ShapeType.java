package model;

public enum ShapeType {
    TRIANGLE("Треугольник"),
    ISOSCELES_TRIANGLE("Равнобедренный треугольник"),
    EQUILATERAL_TRIANGLE("Равносторонний треугольник"),
    RECTANGULAR_TRIANGLE("Прямоугольный треугольник"),
    QUADRANGLE("Четырёхугольник"),
    TRAPEZE("Трапеция"),
    PARALLELOGRAM("Параллелограмм"),
    RECTANGLE("Прямоугольник");

    private final String name;

    ShapeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    /*
    @Override
    public String toString() {
        return name;
    }*/
}
