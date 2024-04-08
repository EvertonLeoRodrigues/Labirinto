package Classes;
import java.io.*;
import java.util.Scanner;

public class Labirinto {

    char[][] labirinto;

    public Labirinto(){};

    public char[][] carregaLabirinto( String fileName) throws IOException{

        FileReader fr = new FileReader(fileName);
        BufferedReader in = new BufferedReader(fr);
        int linhas = Integer.parseInt(in.readLine().trim());
        int coluna = Integer.parseInt(in.readLine().trim());
        labirinto = new char[linhas][coluna];
            
        for (int i = 0; i < linhas; i++){
            String linha = in.readLine();
            for (int j = 0; j < labirinto[i].length; j++) {
                labirinto[i][j] = linha.charAt(j);
            }
        }

        in.close();
        return labirinto;    
    }
    
    
    public boolean labirinto(char[][] labirintoCaminho){
        return labirinto(labirintoCaminho, 0, 0);
    }

    private boolean labirinto(char[][] labirintoCaminho, int linha, int coluna){

        int linhas = labirintoCaminho.length;
        int colunas = labirintoCaminho[0].length;

        if (linha<0 || linha >= linhas || coluna<0 || coluna>=colunas) return false;
        

        if (labirintoCaminho[linha][coluna]=='D') return true;
        

        if (labirintoCaminho[linha][coluna] == ' '){
            labirintoCaminho[linha][coluna]='.';

            boolean path = labirinto(labirintoCaminho, linha - 1, coluna) ||
                           labirinto(labirintoCaminho, linha + 1, coluna) ||
                           labirinto(labirintoCaminho, linha, coluna - 1) ||
                           labirinto(labirintoCaminho, linha, coluna + 1);

            return path;
        }
        
        return false;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < labirinto.length; i++) {
            for (int j = 0; j < labirinto[0].length; j++) {
                sb.append(labirinto[i][j]);
            }
            sb.append("\n");
        }

        return sb.toString();
    }

}