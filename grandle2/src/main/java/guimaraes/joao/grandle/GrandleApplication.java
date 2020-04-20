package guimaraes.joao.grandle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class GrandleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrandleApplication.class, args);

        byte opcao;

        System.out.println("\f");

        Scanner scanner = new Scanner(System.in);
        ContaCorrente contacorrente = new ContaCorrente();
        ContaPoupanca contapoupanca = new ContaPoupanca();


        System.out.println("Digite um valor para depósito(Conta poupança): R$");
        contapoupanca.depositar(scanner.nextDouble());
        System.out.println("Digite um valor para depósito(Conta corrente): R$");
        contacorrente.depositar(scanner.nextDouble());



        System.out.println(contacorrente
                +"\n"+contapoupanca);

        System.out.println("Digite um valor para saque(Conta poupança): R$");
        contapoupanca.sacar(scanner.nextDouble());
        System.out.println("Digite um valor para saque(Conta corrente): R$");
        contacorrente.sacar(scanner.nextDouble());

        System.out.println(contacorrente
                +"\n"+contapoupanca);
	}

}
