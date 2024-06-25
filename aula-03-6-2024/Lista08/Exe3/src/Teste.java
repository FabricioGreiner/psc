import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Joãozinho", "031.312.645-32", 2500);
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Jacaré", "983.131.345-92", 12.50, 220);
        CFuncionario funcionarios[] = {
                funcionarioCLT, funcionarioHorista
        };

        for (CFuncionario func : funcionarios) {
            func.imprimiInfo();
        }
    }
}
