/*
    Classe de transmissão do execício.
    Cédulas são criadas pelo valor e a quantidade
    0 - 2 reais
    1 - 5 reais
    2 - 10 reais
    3 - 20 reais
    4 - 50 reais
    5 - 100 reais
    6 - 200 reais

    Para o Saque, devemos seguir a priorização das maiores notas primeiro
 */


public class Cedulas {
    
    int quantidade;
    
    public Cedulas(){
        this(0);
    }
        
    public Cedulas(int valor){
        quantidade = valor;
    }        
}
