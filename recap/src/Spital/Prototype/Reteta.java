package Spital.Prototype;

public interface Reteta extends Cloneable {
    void setCantitate(int grame);
    void setSubstanta(String substanta);
    void descrie();

    // suprascrie CLONE din cloneable
    Reteta clone() throws CloneNotSupportedException;
}
