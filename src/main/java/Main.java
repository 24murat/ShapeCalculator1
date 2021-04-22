import model.Shape;
import model.triangle.EquilateralTriangle;
import model.triangle.IsoscelesTriangle;
import model.triangle.RectangularTriangle;
import model.triangle.Triangle;
import model.quadrangle.Parallelogram;
import model.quadrangle.Quadrangle;
import model.quadrangle.Trapeze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        //System.out.println(new Triangle(4,5,6).type);
        /*
        File derictory = new File("C:\\JAVA_projects\\Output");



        File[] files = derictory.listFiles();
        ObjectInputStream ois;
        for (File file : files) {
            try {
                FileInputStream fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                Shape shape = (Shape)(ois.readObject());
                shapes.add(shape);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }*/



        try {
            shapes.add( new Triangle(4, 5, 6 ));
            shapes.add( new IsoscelesTriangle(5, 4));
            shapes.add( new EquilateralTriangle(3));
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
            }
        shapes.add( new RectangularTriangle(3, 4));
        shapes.add( new Quadrangle(2, 4, 2, 4));
        shapes.add( new Trapeze(5, 2,5,8));
        shapes.add( new Parallelogram(5,8,4));
        System.out.println(shapes.toString() + "\n");

        /*ObjectOutputStream oos;
        for (Shape shape: shapes) {
            System.out.println(shape.toString() + "\n");

            String path = derictory.getPath() + File.separator + shape.getName() + ".shp";
            try {
                FileOutputStream fos = new FileOutputStream(path);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(shape);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }*/

        /*Triangle triangle1 = new Triangle(3,4,5);
        Triangle triangle2 = new Triangle(3,4,5);
        System.out.println(triangle1 == triangle2);
        System.out.println(triangle1.equals(triangle2));
        System.out.println(triangle1.hashCode());
        System.out.println(triangle2.hashCode());*/


    }
}
