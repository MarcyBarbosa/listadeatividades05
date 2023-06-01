import java.util.Scanner;

public class ListaCincoAtividadeSeis {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        DadosColetados dados = new DadosColetados();
        
        System.out.println("Escreva um numero inteiro por favor");
        dados.setNumeroUm(scanner.nextInt());
        
        System.out.println("Escreva outro numero inteiro por favor");
        dados.setNumeroDois(scanner.nextInt());
        
        System.out.println("Escreva mais um numero inteiro por favor");
        dados.setNumeroTres(scanner.nextInt());
        
        dados.soma();
        
        
        System.out.println("o resultado da soma destes numeros é\n" + dados.soma());
        
        scanner.close();
        
        }
    
}
