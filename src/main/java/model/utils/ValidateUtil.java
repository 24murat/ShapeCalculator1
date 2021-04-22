package model.utils;

public class ValidateUtil { //делаем статическим, чтобы не нужно было создавать
                                   //экземпляр класса
    public static boolean isValidSide (double side) {
        if (side == Double.NaN) {
            return false;
        }
        if (side == Double.POSITIVE_INFINITY){
            return false;
        }
        return side > 0;

    }

    public static boolean isValideTriangle (double firstSide, double secondSide, double thirdSide){

        if (secondSide + thirdSide <= firstSide) {
            return false;
        }
        if (firstSide + thirdSide <= secondSide) {
            return false;
        }
        if (firstSide + secondSide <= thirdSide) {
            return false;
        }
        return true;
    }

}
