package com.example;

//exercicio 1
/*public class Main {
    public static void main(String[] args) {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;

        }
        System.out.println("O valor da soma e: " + SOMA);
        }
    }
*/

/*exercicio 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero para verificar se pertence a sequencia de Fibonacci: ");
        int numero = scanner.nextInt();
        
        int a = 0, b = 1, fibonacci = 0;
        
        if (numero == 0 || numero == 1) {
            System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci.");
            return;
        }
        

        while (fibonacci < numero) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }
        
        if (fibonacci == numero) {
            System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println("O numero " + numero + " nao pertence a sequencia de Fibonacci.");
        }
    }
}
*/
/*exercicio 3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de dias no mes: ");
        int numDias = scanner.nextInt();

        double[] faturamento = new double[numDias];

        System.out.println("Digite o faturamento diario:");
        for (int i = 0; i < numDias; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            faturamento[i] = scanner.nextDouble();
        }

        double menorFaturamento = faturamento[0];
        double maiorFaturamento = faturamento[0];
        double somaFaturamento = 0;

        for (double valor : faturamento) {
            if (valor < menorFaturamento) {
                menorFaturamento = valor;
            }
            if (valor > maiorFaturamento) {
                maiorFaturamento = valor;
            }
            somaFaturamento += valor;
        }

        double mediaFaturamento = somaFaturamento / numDias;

        int diasAcimaDaMedia = 0;
        for (double valor : faturamento) {
            if (valor > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Numero de dias com faturamento acima da media mensal: " + diasAcimaDaMedia);
    }
}
    */

/* Exercício 4
    import java.lang.reflect.Type;
    import java.util.Map;

    import com.google.gson.Gson;
    import com.google.gson.reflect.TypeToken;
    
    public class Main {
        public static void main(String[] args) {
            String jsonString = "{\"sp\": 67836.43, \"rj\": 36678.66, \"mg\": 29229.88, \"es\": 27165.48, \"outros\": 19849.53}";
    
            Gson gson = new Gson();
            Type type = new TypeToken<Map<String, Double>>() {}.getType();
            Map<String, Double> faturamento = gson.fromJson(jsonString, type);
    
            double total = faturamento.values().stream().mapToDouble(Double::doubleValue).sum();
    
            faturamento.forEach((estado, valor) -> {
                double percentual = (valor / total) * 100;
                System.out.printf("%s: %.2f%%\n", estado.toUpperCase(), percentual);
            });
    
            System.out.printf("Valor Total: R$ %.2f\n", total);
        }
    }
 */



/* Exercicio 5
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Digite uma string para inverter: ");
            String input = scanner.nextLine();
            
            String invertedString = "";
            
            for (int i = input.length() - 1; i >= 0; i--) {
                invertedString += input.charAt(i); 
            }
            
            System.out.println("String invertida: " + invertedString);
            
            scanner.close();
        }
    }
    */