import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("João", "031.312.432-63", 2750.22);
        Gerente gerente1 = new Gerente("Carlos", "041.982.770-60", 2750.22,"Gerente");
        Funcionario []vetor = {func1,gerente1};

        for(Funcionario e : vetor){
            System.out.println(e.imprimirInfo());
        }
    }


}

