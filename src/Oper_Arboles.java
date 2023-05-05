public class Oper_Arboles {
    nodoArbol raiz=null;

    public void insertar(nodoArbol n, String frase){
        nodoArbol nuevo = new nodoArbol(frase);

        if (raiz==null){
            raiz=nuevo;
        }else {
            if (n.getFrase().equals(frase)){
                n.setR(n.getR() + 1);
            }else {
                int TM = Integer.min(frase.length(), n.getFrase().length());
                boolean isM = false;
                for (int i = 0; i <TM; i++) {
                    if (frase.charAt(i) - 'A' < n.getFrase().charAt(i) - 'A'){
                        isM = true;
                        break;
                    } else if (frase.charAt(i) - 'A' > n.getFrase().charAt(i) - 'A')
                        break;
                }
                if (isM){
                    if (n.iz==null){
                        n.iz=nuevo;
                    }else{
                        insertar(n.iz, frase);
                    }
                }else {
                    if (n.de==null){
                        n.de=nuevo;
                    }else {
                        insertar(n.de, frase);
                    }
                }
            }
        }
    }

    public void preorden(nodoArbol n){
        if (n!=null){
            System.out.println(n.getFrase() + "--" + n.getR());
            if (n.iz != null)
                preorden(n.iz);
            if (n.de != null)
                preorden(n.de);
        }
    }

}
