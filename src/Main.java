import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0, dato;
        Oper_Arboles OA = new Oper_Arboles();
        nodoArbol raiz = null;

        do{

            System.out.println("1.-Insertar raiz\n" +
                    "2.-Insertar dato\n" +
                    "3.-Preorden\n" +
                    "4.-Inorden\n" +
                    "5.-Posorden\n" +
                    "6.-Suma\n" +
                    "7.-Tamaño\n" +
                    "8.-Hojas\n" +
                    "9.-Interiores\n" +
                    "10.-Salir");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Introduzca el raiz: ");
                    dato=sc.nextInt();
                    raiz = new nodoArbol(dato);
                    break;
                case 2:
                    System.out.println("Introduzca el dato");
                    dato = sc.nextInt();
                    OA.insertar(raiz, dato);
                    break;
                case 3:
                    System.out.println("Recorrido preorden:");
                    OA.preorden(raiz);
                    break;
                case 4:
                    System.out.println("Recorrido inorden:");
                    OA.inorden(raiz);
                    break;
                case 5:
                    System.out.println("Recorrido posorden:");
                    OA.postorden(raiz);
                    break;
                case 6:
                    System.out.println("Suma");
                    OA.suma(raiz);
                    OA.mostrarSuma(raiz);
                    break;
                case 7:
                    System.out.println("Tamaño");
                    OA.tamaño(raiz);
                    break;
                case 8:
                    System.out.println("Hojas");
                    OA.contarHojas(raiz);
                    break;
                case 9:
                    System.out.println("Interiores");
                    break;

            }
        }while(opcion!=9);
    }
}