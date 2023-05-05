import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text, letras = "abcdefghijklmnñopqrstuvwxyz ";
        Oper_Arboles OA = new Oper_Arboles();

        System.out.println("Ingrese un texto: ");
        text=sc.nextLine().toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            if (!letras.contains(String.valueOf(text.charAt(i)))){
                text = text.substring(0,i) + text.substring(i + 1);
            }
        }
        String textS[]=text.split(" ", 0);
        for (String palabras : textS);

        OA.preorden(OA.raiz);

    }
}