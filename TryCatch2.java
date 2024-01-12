import java.util.*;

public class TryCatch2 {
    public static void verificarIdade(short idade) {
        if (idade >= 18) {
            System.out.println("Acesso garantido.");
        } else {
            throw new ArithmeticException("Idade não permitida.");
        }
    }
    public static void main(String[] args) {
        boolean deuRuim = false;
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite sua idade:");
            short idadeDigitada = teclado.nextShort();
            verificarIdade(idadeDigitada);
            teclado.close();
        } catch (Exception e) {
            deuRuim = true;
            Scanner sair = new Scanner(System.in);
            //System.out.println("Ops! Ocorreu um erro.");
            System.err.println(e.getMessage() + " Pressione enter para continuar...");
            sair.nextLine();
            sair.close();
        } finally {
            if (deuRuim == true) {
                System.out.println("Favor reiniciar o sistema!");
            } else {
                System.out.println("Ok! Zerou o jogo...");
            }
        }
    }
}
