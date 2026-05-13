import java.util.ArrayList;

public class UsuarioService {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
public void inicio(){


        int opcao;

        do {
            IO.println("Menu Usuario");
            IO.println("1 - Adicionar");
            IO.println("2 - Editar");
            IO.println("3 - Remover");
            IO.println(" 4 - Listar");
            IO.println("0 - Sair ");
            opcao = Integer.parseInt(IO.readln("Digite uma opcao: "));
        } while (opcao !=0);
        switch (opcao){
            case 1:
                adicionar();
                break;
            case 2:
                editar();
                break;
            case 3:
                remover();
                break;
            case 4:
                listar();
                break;
            case 5:
                IO.println("Saindooo");
                break;
        } while (opcao != 0);
}
public void adicionar(){
    String nome = IO.readln("Digite nome do usuario: ");
    String username = IO.readln("Digite o username");
    String password = IO.readln("Digite o password");
    Usuario usuario = new Usuario(nome, username, password);
    usuarios.add(usuario);
}
public void listar(){
    for (int i = 0; i < usuarios.size(); i++) {
        System.out.println("Indice do usuário: " + i);
        System.out.println(usuarios.get(i).toString());
    }

}
public void editar(){
    listar();
    int indice = Integer.parseInt(IO.readln("Digite o indice para editar: "));
    usuarios.get(indice).setNome(IO.readln("Digite novo nome: "));
    usuarios.get(indice).setUsername(IO.readln("Digite novo usuario: "));
    usuarios.get(indice).setPassword(IO.readln("Digite nova senha "));
}
public void remover(){
    listar();
    int indice = Integer.parseInt(IO.readln("Digite o indice para remover: "));
    usuarios.remove(indice);
}
}

