import java.util.*;

public class DoWhile2 {
    public static void main(String[] args) {
        List<String> usersLogged = new ArrayList<>();
        int usersLimit = 2;
        Scanner teclado = new Scanner(System.in);
        String usuario;

        try {
            while (usersLogged.size() < usersLimit) {
                if (usersLogged.size() == 0) {
                    System.out.println("Não temos usuarios conectados no momento.");
                } else {
                    System.out.println(usersLogged.size()+" Usuario(s) conectado(s).");
                    System.out.println("Temos o usario(s) "+usersLogged+" Logado(s).");
                }
                System.out.println("Digite um nome de usuário e/ou tecle enter para gerar um nome de usuario aleatorio");
                usuario = teclado.nextLine();
                if (usuario != "") {
                    usersLogged.add(usuario);
                } else {
                    usersLogged.add("user" + Math.ceil(Math.random() * 100));
                }
                Thread.sleep(1000); //
            }
            System.out.println("Limite de usuario(s) atingido.");
            System.out.println("Temos "+usersLimit+" usuarios logados.");
            for (int i = 0; i < usersLimit; i++) {
                System.out.println("Temos o usuario "+(i+1)+" ["+usersLogged.get(i)+"] logado.");
            }        
        } catch (Exception e) {
            System.out.println("Ocorreu um erro." + e.getMessage());
        }
        teclado.close();
    }
}