import java.util.Scanner;

class Main {
  public static void main(String[] args) {

      Scanner g =new Scanner(System.in);

    
    double celsius,fahrenheit, resultado;
   
    System.out.println("escreva a temperatura em graus Fahrenheit :  ");
   fahrenheit= g.nextFloat();
    g.close();
    resultado=((fahrenheit-32) /1.8);
        System.out.println(" A temperatura em celsius e :  ºC" +resultado);