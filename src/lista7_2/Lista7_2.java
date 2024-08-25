package lista7_2;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista7_2 {
    public static void main(String[] args) {
        final int LIMITEMAX = 100;
        final int LINHA = 5;
//        final int COLUNA = 5;
        int vet[][] = new int [LINHA][LINHA];
        int vetorSL[] = new int [LINHA];
        int vetorSC[] = new int [LINHA];
        for(int x=0; x < LINHA; x++){
            for(int y=0; y < LINHA; y++){
                vet[x][y] = (int) (Math.random() * (LIMITEMAX+1));
            }
        }
        for(int x=0; x < LINHA; x++){
            for(int y=0; y < LINHA; y++){
                vetorSL[x] += vet[x][y];
            }
        }
        for(int y=0; y < LINHA; y++){
            for(int x=0; x < LINHA; x++){
                vetorSC[y] += vet[x][y];
            }
        }
        String vetorOriginal = "";
        for (int x = 0; x < LINHA; x++) {
            vetorOriginal += Arrays.toString(vet[x]) + "\n";
        }
        JOptionPane.showMessageDialog(null, "Matriz original: \n" +vetorOriginal+ "\nSoma das linhas: " 
                +Arrays.toString(vetorSL)+ "\nSoma das colunas: " +Arrays.toString(vetorSC));
    }    
}
