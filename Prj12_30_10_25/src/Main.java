/*
    Código principal do projeto.
    Apenas o menu que chama os métodos:

    1 - Carregar notas;
    2 - Sacar Notas;
    3 - Estatísticas;
    9 - Sair.
 */

import java.io.*;
import javax.swing.*;
public class Main {
    public static void main(String args[])throws IOException{
        
        // Importando a classe de Procedimentos
        Procedimentos metodo = new Procedimentos();
        
        // Importando a classe de transmissão
        Cedulas[] notas = new Cedulas[7];
        
        int opc=0, saques=0;
        
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog("\nDigite a opção desejada:"
                                                            +"\n1 - Carregar notas"
                                                            +"\n2 - Sacar Notas"
                                                            +"\n3 - Estatíticas"
                                                            +"\n9 - Sair"));
            
            switch(opc){
                case 1:
                    metodo.CarregarNotas(notas);
                    break;
                    
                case 2:
                    saques++;
                    metodo.SacarNotas(notas);
                    break;
                    
                case 3:
                    metodo.Estatisticas(notas);
                    break;
                    
                case 9:
                    System.out.println("\nFim da operacao!");
                    break;
                    
                default:
                    System.out.println("\nOpcao invalida\nTente novamente.");
                    break;
            }
        }while(opc!=9);
    }
}
