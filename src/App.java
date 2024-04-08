import java.io.*;
import java.util.Scanner;

import Classes.*;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Labirinto labirinto = new Labirinto();

        try {
            System.out.println("Entre o nome do arquivo que contém o labirinto: ");
            String arquivo = sc.nextLine();
            char[][] caminho = labirinto.carregaLabirinto(arquivo);
            boolean existeCaminho = labirinto.labirinto(caminho);
            System.out.println();
            String resultado = existeCaminho? "Existe um caminho para concluir o labitinto!" : "Não existe um caminho para concluir o labirinto!";

            File f = new File("saidaLabirinto.txt");
            FileWriter fw = new FileWriter(f);
            PrintWriter out = new PrintWriter(fw);

            out.println(resultado);
            out.println();
            out.println(labirinto.toString());

            out.close();
            fw.close();

        } catch (IOException e) {
            e.getMessage();
        }

    }
}
