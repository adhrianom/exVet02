package principal;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();
        
        double[] vect = new double[N];
        for (int i=0; i < N; i++){
        System.out.print("Digite um numero: ");
        vect[i] = sc.nextDouble();
        }
        
        System.out.print("VALORES = ");
        for (int i=0; i < N; i++){
            System.out.print(vect[i] + "  ");
                    }
        
        System.out.println();
        System.out.print("SOMA = ");
        double sum = 0.0;
        for (int i=0; i < N; i++){
            sum += vect[i];
        }
        System.out.println(sum);
        
        System.out.print("MEDIA = ");
        double media = 0.0;
        for (int i = 0; i < N; i++){
            media = sum / N;
        }
        System.out.print(media);
        
        sc.close();
    }
} // RESOLVIDO SEM AJUDA ALGUMA.
