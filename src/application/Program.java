package application;

import entitites.Dados;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner in = null;
        Dados dados = new Dados();

        File file = new File("D:\\Temp\\archive.csv");

        try{
            in = new Scanner(file);
            while(in.hasNextLine()){
                String dado = (in.nextLine());
                dados.addList(dado);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        dados.createFIle();


        /*
        for (int i = 0; i < 4; i++) {
            String entrada = in.nextLine();
            dados.addList(entrada);
        }
        dados.createFIle();
        System.out.println(dados.toString());

         */

    }
}
