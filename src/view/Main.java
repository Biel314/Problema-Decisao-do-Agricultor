package view;

import java.util.Scanner;
import controller.CtlDecididor;
import model.Sensores;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CtlDecididor decisor = new CtlDecididor();

        int qtdSensores = 0;

        while (qtdSensores < 1 || qtdSensores > 1000) {

            System.out.print("Digite a quantidade de sensores (1 a 1000): ");
            System.out.println("");
            qtdSensores = scanner.nextInt();

            if (qtdSensores < 1 || qtdSensores > 1000) {
                System.out.println("Quantidade invalida de sensores, digite novamente!");
            }
        }

        scanner.nextLine();

        while (qtdSensores > 0) {
            System.out.println("Digite temperatura, umidade (%) e previsao chuva (0 nao / 1 sim): ");
            System.out.println("(Separados por espaço!)");
            
            double temperatura = scanner.nextDouble();
            double umidade = scanner.nextDouble();
            int previsao = scanner.nextInt();

            umidade = umidade / 100;

            Sensores sensor = new Sensores(temperatura, umidade, previsao);

            decisor.verificarPrevisao(sensor);

            qtdSensores--;
            
            if(qtdSensores > 0) {
            	System.out.println("Proximo sensor");
            	System.out.println("");
            } else {
            	System.out.println("Todos os sensores foram programados!");
            }
        }

        scanner.close();
    }
}