package ro.ase.cts.s02;

import java.io.IOException;

//CALCUL
//exceptia aruncata
//val nonumerice - recitire
//metoda putere separata
//denumire metoda neclara

//MATRICE
//tratare caz fisier modificat
//metode diferite - initializare, citire din fisier, scriere in fisier (vezi exceptii)
public class Main {
    public static void main(String[] args) throws IOException {

        //incearca si CalculatorRefactored
        Calculator calculator = new Calculator();

        double result = calculator.calculateSumOfPowers();
        System.out.println("Rezultatul este: " + result);

        MatrixDataHandler mH = new MatrixDataHandler(5, 7, "matrix.txt");
        mH.modifyValueAndUpdateFile("matrix.txt", 3, 4, 345);
//        mH.modifyValueAndUpdateFile("matrix.txt", 7, 5, 345);
//        mH.modifyValueAndUpdateFile("matrix.txt", 9, 9, 345);
        int value= mH.getValueFromPosition("matrix.txt",3,4);
//        int value= mH.getValueFromPosition("matrix.txt",9,9);
        System.out.println(value);
    }
}
