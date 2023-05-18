package Banca.Prototype;

import java.util.List;

public interface ICont {
    void setDetinator(String detinator);
    void setSuma(double suma);

    //pentru colectii - DEEP COPY
    void setDocumente(List<String> documente);

    void descrie();

    //implementare clonare
    ICont clone();
}
