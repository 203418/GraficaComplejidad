package complejidad.basicoGrafica;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Complejidad c = new Complejidad();
        int ejecuciones = 20,opcion;
        int resultados[][] = new int[ejecuciones][2];
        System.out.println("Digite el tipo de algoritmo del cual quiere ver la grafica");
        System.out.print("1.Lineal\n2.Cuadratica\n3.Gauss\n4.Logaritmica\n");
        opcion = entrada.nextInt();
        switch (opcion){
            case 1:
                for (int renglon = 0; renglon < ejecuciones; renglon++) {
                    int n = (renglon + 1) * 1;
                    resultados[renglon][0] = n;
                    resultados[renglon][1] = c.lineal(n);
                }
                break;
            case 2:
                for (int renglon = 0; renglon < ejecuciones; renglon++) {
                    int n = (renglon + 1) * 1;
                    resultados[renglon][0] = n;
                    resultados[renglon][1] = c.cuadratica(n);
                }
                break;
            case 3:
                for (int renglon = 0; renglon < ejecuciones; renglon++) {
                    int n = (renglon + 1) * 1;
                    resultados[renglon][0] = n;
                    resultados[renglon][1] = c.gauss(n);
                }
                break;
            case 4:
                for (int renglon = 0; renglon < ejecuciones; renglon++) {
                    int n = (renglon + 1) * 100;
                    resultados[renglon][0] = n;
                    resultados[renglon][1] = c.log(n);
                }
                break;
        }
        imprimir(resultados);


    }

    private static void imprimir(int [][] resultado){
        String[][] as = new String[resultado.length][resultado[resultado.length-1][1]];
        System.out.println("Grafica Horizontal");
        for (int renglon = 0; renglon < resultado.length ; renglon++){
            for(int veces = 0; veces < resultado[renglon][1]; veces++) {
                System.out.print("*\t");
                as[renglon][veces] = "*";
            }
            System.out.println();
        }
        for (int i=0;i< as.length;i++){
            for (int j=0;j<as[i].length;j++){
                if (as[i][j]==null){
                    as[i][j]=" ";
                }
            }
        }
        System.out.println("Grafica Vertical");
        for (int j = as[as.length-1].length-1;j>=0;j--) {
            for (int i = 0;i<as.length;i++)
                System.out.print(as[i][j]+"\t");
            System.out.println();
        }
    }
}
