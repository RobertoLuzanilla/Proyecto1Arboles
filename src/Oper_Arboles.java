public class Oper_Arboles {
    nodoArbol raiz=null;

    public void insertar(nodoArbol n, int dato){
        if (raiz==null){
            raiz=new nodoArbol(dato);
        }else {
            if (dato<n.dato){
                if (n.iz==null){
                    n.iz = new nodoArbol(dato);
                }
                else {
                    insertar(n.iz,dato);
                }
            }else {
                if (n.de==null){
                    n.de = new nodoArbol(dato);
                }
                else {
                    insertar(n.de,dato);
                }
            }
        }
    }
    public void preorden(nodoArbol n){
        if (n!=null)
            System.out.println(n.dato);
        if (n.iz!=null)
            preorden(n.iz);
        if (n.de!=null)
            preorden(n.de);
    }
    public void inorden(nodoArbol n){
        if (n.iz!=null)
            preorden(n.iz);
        if (n!=null)
            System.out.println(n.dato);
        if (n.de!=null)
            preorden(n.de);
    }
    public void postorden(nodoArbol n){
        if (n.de!=null)
            preorden(n.de);
        if (n.iz!=null)
            preorden(n.iz);
        if (n!=null)
            System.out.println(n.dato);
    }
    public int suma(nodoArbol n){
        if (n!=null){
            return n.dato + suma(n.iz) + suma(n.de);
        }
        return 0;
    }
    public int tamaño(nodoArbol n){
        if (n!=null){
            return 1 + tamaño(n.iz) + tamaño(n.de);
        }
        return 0;
    }
    public void mostrarSuma(nodoArbol n){
        int resultado = suma(n);
        System.out.println("La suma de los nodos del árbol es: " + resultado);
    }

    public int contarHojas(nodoArbol raiz) {
        if (raiz == null) {
            return 0;
        } else if (raiz.iz == null && raiz.de == null) {
            return 1;
        } else {
            return contarHojas(raiz.iz) + contarHojas(raiz.de);
        }
    }

    public void MayordeMenores(){
        if (raiz==null){

        }
    }

}
