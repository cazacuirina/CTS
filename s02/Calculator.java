package ro.ase.cts.s02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Calculator {
    /**
     * Aceasta metoda calculeaza suma dintre x ridicat la puterea a-5a si y ridicat la putearea a-7a.
     * @return Returneaza rezultatul calculat.
     * @throws IOException Arunca exceptie daca datele introduse nu au formatul corect.
     */

    //clasa statica (NU e istoric-e ok)
    public double calculateSumOfPowers() throws IOException {

        double result = 0.0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double x=0, y=0;
        x=citire(x, reader, "X");
        y=citire(y, reader, "Y");

        double x5=ridicaLaPutere(x, 5);
        double y7=ridicaLaPutere(y, 7);

        result = x5 + y7;
        return result;
    }
    public double citire(double x, BufferedReader reader, String variabila){
        boolean flagX=false;

        while(flagX==false)
        {
            try{
                if(flagX==false){
                    System.out.println("Tastati valoarea pentru "+variabila+":");
                    x = Double.parseDouble(reader.readLine());
                    flagX=true;
                }
            }catch (NumberFormatException ex){
                System.out.println(ex);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        return x;
    }
    public double ridicaLaPutere(double x, int p){
        double xp = x;
        for (int i = 1; i < p; i++) {
            xp *= x;
        }
        return xp;
    }
}