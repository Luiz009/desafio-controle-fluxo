import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = terminal.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = terminal.nextInt();

        try{
            contar(primeiroNumero, segundoNumero);
        }catch(NumerosInvalidosException errorMessage) {
            System.out.println(errorMessage);
        }
    }
    static void contar(int primeiroNumero, int segundoNumero) throws NumerosInvalidosException {
        if(primeiroNumero < segundoNumero){
            int i;
            int resultado = segundoNumero - primeiroNumero;

            for(i = 0; i < resultado; i++){
                System.out.println(i+1);
            }
        }else{
            throw new NumerosInvalidosException("O segundo número deve ser maior que o primeiro.");
        }
    }
}
