import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Converter de Real para Dollar:  \n 2. Converta de Dollar para Real:  ");//EXIBIR
        Scanner ler = new Scanner(System.in);
        int valor = ler.nextInt();


        switch (valor){
            case 1:{
                System.out.println("Informe quantos Reais para ser convertido");
                int real = ler.nextInt();
                double dollar = (real * 5.06);
                System.out.println("Dollar convertido fica exatamente: " + dollar);
                break;
        }
            case 2:{
                System.out.println("Informe quantos reais para ser convertido em Dolares");
                double dollar = ler.nextInt();//1 * 5.06
                double real = (dollar / 5.06);
                System.out.println("Reais convertido fica exatamente:  " + real);
                break;
        }

        }
    }
}
