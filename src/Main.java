import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Oper_Arboles OA = new Oper_Arboles();

        System.out.println("Ingrese texto");
        String text = sc.nextLine().toLowerCase();

        String signos = "abcdefghijklmnñopqrstuvwxyz ";

        for (int i = 0; i < text.length(); i++) {
            if (!signos.contains(String.valueOf(text.charAt(i))))
                text = text.substring(0, i) + text.substring(i + 1);
        }

        String TextS[] = text.split(" ", 0);

        for (String palabra : TextS)
            OA.insertar(OA.raiz, palabra);

        System.out.println();
        OA.preorden(OA.raiz);

    }

}
