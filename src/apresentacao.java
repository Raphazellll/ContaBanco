import java.util.Scanner;

public class apresentacao {
    
    public static void main(String[] args) {

    // Criando um Scanner para receber dados do usuário
    Scanner scanner2 = new Scanner(System.in);

    System.out.println("Olá, tudo bem? Como se chama? ");
    String nome = scanner2.nextLine(); 
    //Método para guardar o dado, no caso, nome.
    //dependendo do tipo de dado, como int, double, etc, colocar o tipo de dado
    //no final do parâmetro "scanner.next****;"

    System.out.println("Qual é a sua idade? ");
    int idade = scanner2.nextInt();

    String mensagem = "Olá, " + nome + " Tudo bem? Me chamo Raphael, tenho 29 anos e você ?\n"
    + idade + " \nMuito bacana! Estou aprendendo JAVA desde o básico, estou tendo muitos desafios, mas sinto que vou supera-los!";
    System.out.println(mensagem);
    //encerrendo o Scanner
    scanner2.close();
        
    }
}
