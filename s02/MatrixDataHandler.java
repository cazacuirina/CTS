package ro.ase.cts.s02;

import java.io.*;

public class MatrixDataHandler {
    private int[][] matrix;
    private int height;
    private int width;
    private String filename;

    /**
     *Constructorul matricei & scrierea ei in fisier
     * @param height - h - lungime
     * @param width - w - latime
     * @param filename - nume fisier in care scriem matricea
     */
    public MatrixDataHandler(int height, int width, String filename) {

        initializeMatrix( height,  width,  filename);

        writeMatrixInFile();

        //metoda a clasei
//        if(this.writeMatrixInFile()==false){
//            System.out.println("Scriere incorecta");
//        }

    }
    private void initializeMatrix(int w, int h, String filename){
        this.height = h;
        this.width = w;
        this.filename = filename;
        this.matrix = new int[h][];

        for (int i = 0; i < h; i++) {
            this.matrix[i] = new int[w];
        }
    }

    //boolean nu void pe succes scriere/citire
    private void writeMatrixInFile(){
        try {
            FileWriter fw = new FileWriter(this.filename);
            fw.write(this.height + " " + this.width + "\n");
            for (int i = 0; i < this.height; i++) {
                for (int j = 0; j < this.width; j++) {
                    fw.write(this.matrix[i][j] + " ");
                }
                fw.write("\n");
            }
            fw.close();

            //return true
        } catch (IOException exception) {
            //System.exit dc vrem sa oprim aplicatia
            System.out.println(exception.getMessage());
        }
    }

    private void readMatrixFromFile(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            height = Integer.parseInt(line.split(" ")[0]);
            width = Integer.parseInt(line.split(" ")[1]);

            //citire matrice din fisier - fct separata
            //POSH si POSW daca sunt mai mari decat dimens initiale - exceptie?
            //daca e o pb - reinitializam matricea cu posh si posw

            for (int i = 0; i < this.height; i++) {
                line = br.readLine();
                for (int j = 0; j < this.width; j++) {
                    this.matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }
            br.close();

            //return true
        } catch (IOException exception) {
        System.out.println(exception.getMessage());
    }

    }

    private void checkIndex(int posH, int posW){
        if(this.width<posW || this.height<posH){
            initializeMatrix(posH, posW, this.filename);
        }
    }

    /**
     *
     * @param filename - fisier din care citim
     * @param posH -  linie
     * @param posW -  coloana
     * @param val
     */
    public void modifyValueAndUpdateFile(String filename, int posH, int posW, int val) {

            //POSH si POSW daca sunt mai mari decat dimens initiale - reinitializam matricea cu posh si posw

             readMatrixFromFile();

             checkIndex(posH, posW);

            //inlocuire valoare & scriere matrice in fisier

            matrix[posH-1][posW-1] = val;

            writeMatrixInFile();


    }

    /**
     *
     * @param filename - fisier din care citim
     * @param posH -  linie
     * @param posW -  coloana
     * @return
     */
    public int getValueFromPosition(String filename, int posH, int posW) {

        //if(!this.readMatrix()){
        //sysoutprintln(citire incorecta)
        readMatrixFromFile();

        checkIndex(posW, posH);

        return this.matrix[posH-1][posW-1];

//            if(this.h< posH || this.w<posH){
//                //throw new Error("Indexul nu se afla in matrice!");
//                return -1;
//            }else{
//                readMatrixFromFile();
//                return this.matrix[posH][posW];
//            }

    }
}
