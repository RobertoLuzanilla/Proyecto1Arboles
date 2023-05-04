public class nodoArbol {
    int dato;
    nodoArbol iz,de;

    public nodoArbol(int d){
        dato = d;
        iz=null;
        de=null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
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
