import java.util.Scanner;
import java.util.InputMismatchException;
public class Contador {
	public static void main(String[] args) throws Contador.ParametrosInvalidosException {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (InputMismatchException exception) {
			System.out.println(exception);
			
		}
		
	}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		int toatalIntercao = 0;
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro, tente novamente");
			

        int contagem = parametroDois - parametroUm;
        for (int interacao = 1;interacao <=contagem ; interacao++){
            System.out.println("Imprimindo o número " + interacao);
			toatalIntercao += interacao;
        }
		System.out.println("Total de interação foi de:"+ (toatalIntercao - 1));
    }

    private static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String errorMessage) {
            super(errorMessage);
        }
	}
}