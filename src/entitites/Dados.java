package entitites;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dados {

    Scanner in = new Scanner(System.in);

    private String dado;


    public Dados() {
    }

    public Dados(String dado) {
        this.dado = dado;
    }

    private List<String> list = new ArrayList();

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public void addList(String entrada) {
        list.add(entrada);
    }

    public void createFIle(){
        File strPath = new File("D:\\Temp");
        boolean newPaste = new File (strPath + "\\out").mkdir();
        String[] lines = new String[] {toString()};
        String path = "D:\\Temp\\out\\summary.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (String lista : list) {
            String[] sepracoes = lista.split(",");
            double qtd = Double.parseDouble(sepracoes[1]);
            double valor = Double.parseDouble(sepracoes[2]);
            double tot =  qtd * valor;
            sb.append(sepracoes[0] + " " + String.format("%.2f", tot)  + "\n");
        }
        return sb.toString();
    }

}
