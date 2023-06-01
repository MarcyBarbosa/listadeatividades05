import java.util.Scanner;
public class DadosColetados {
    private int numeroUm;
    private int numeroDois;
    private int numeroTres;

    public void setNumeroUm(int numeroUm){
        this.numeroUm = numeroUm;
    }

    public int  getNumeroUm( ){
        return numeroUm;
    }

    public void setNumeroDois(int numeroDois){
        this.numeroDois = numeroDois;
    }

    public int  getNumeroDois( ){
        return numeroDois;
    }

    public void setNumeroTres(int numeroTres){
        this.numeroTres = numeroTres;
    }

    public int  getNumeroTres( ){
        return numeroTres;
    }

    public int soma(){
        int Soma = numeroUm + numeroDois + numeroTres;
        return Soma;
    }
}
