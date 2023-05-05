public class nodoArbol {
    String frase;
    int r=1;
        nodoArbol iz,de;

    public nodoArbol(String frase) {
        this.frase = frase;
        iz=null;
        de=null;
    }
    public String getFrase() {
        return frase;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public nodoArbol getIz() {
        return iz;
    }

    public void setIz(nodoArbol iz) {
        this.iz = iz;
    }

    public nodoArbol getDe() {
        return de;
    }

    public void setDe(nodoArbol de) {
        this.de = de;
    }
}
