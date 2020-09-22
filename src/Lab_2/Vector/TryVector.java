package Lab_2.Vector;

public class TryVector {
    public static void main(String[] args) {
        Vector a = new Vector(-1, 2, -2);
        Vector b = new Vector(2, 1, -1);
        System.out.println("Модуль вектора : " + a.getVectorModule());
        System.out.println("Множення на вектора на число : " + a.multiplyVector(3).getAllParametrsToString());
        System.out.println("Додавання векторів : " + a.sumVectors(b).getAllParametrsToString());
        System.out.println("Скалярне множення векторів : " + a.scalarProductOfVectors(b));
        System.out.println("Векторне множення векторів : " + a.vectorProductOfVectors(b).getAllParametrsToString());
    }
}
