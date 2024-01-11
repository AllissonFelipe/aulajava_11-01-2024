import java.util.*;
public class tryCatch {
    public static void main(String[] args) {
        String[] letras = {"A", "B", "C", "D", "E", "F", "G"};
        Scanner teclado = new Scanner(System.in);
        boolean erro = true;

        for (int i = 0; i < letras.length; i++) {
                System.out.println(i+" - [ "+letras[i]+" ] ");
            }
        while (erro == true) {
            try {
                System.out.println("Escolha uma letra [0 a 6].");
                int num = teclado.nextInt();
                if (num < 0 || num > 6) {
                    System.out.println("Invalido.");
                } else {
                    System.out.println("A Letra escolhida foi: "+letras[num]);
                    erro = false;
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro." +e.getMessage());
            }
        }    
        teclado.close();
    }
}