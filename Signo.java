import java.util.Scanner;

public class Signo {

    public static void main(String[] args) {
        
        //Declaração de variáveis
        int mes, num;

        //Criação instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t--Signos--\n");

        //Entrada
        System.out.println("Informe o mês: ");
        mes = entrada.nextInt();
        System.out.println("Informe o dia: ");
        num = entrada.nextInt();

          //Processamento

          if ((mes == 3) && (num >=21) || (mes == 4) && (num <= 19)){

          System.out.println("Seu signo é Áries");
          } else if ((mes == 4) && (num >=20) || (mes == 5) && (num <=20)){

          System.out.println("Seu signo é Touro");

          }else if ((mes== 5) && (num >=21) || (mes == 6) && (num<=20)){

          System.out.println("Seu signo é Gêmeos");

          }else if ((mes == 6) && (num >=21) || (mes == 7) && (num <=22)){

          System.out.println("Seu signo é Câncer");

          }else if ((mes == 7) && (num>=23) || (mes == 8) && (num <=22)){

          System.out.println("Seu signo é Leão");

          }else if ((mes == 8) && (num >=23) || (mes == 9) && (num<=22)){

          System.out.println("Seu signo é Virgem");

          }else if ((mes == 90 && (num >=23)) || (mes == 10) && ( num<=22)){

          System.out.println("Seu signo é Libra");

          }else if ((mes== 10) && (num >=23) || (mes == 11) && (num<=21)){

          System.out.println("Seu signo é Escorpião");

          }else if ((mes == 1) && (num>= 22) || (mes == 12) && (num<=21)){

          System.out.println("Seu signo é Sagitário");

          }else if ((mes == 12) && ( num >= 22) || (mes == 1) && (num <=19)){

          System.out.println("Seu signo é Capricórnio");

          }else if ((mes == 1) && (num>=20) || (mes == 2) && (num <=18)){

          System.out.println("Seu signo é Aquário");

          }else if ((mes== 2) && (num >=19) || (mes == 3) && ( num<=20)){

          System.out.println("Seu signo é Peixes");
        }
    }
}