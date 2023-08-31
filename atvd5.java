import java.util.Scanner;

class atvd5{
    public static void question01(){
        Scanner s = new Scanner(System.in);
         // Crie um programa que leia 5 notas de alunos e exiba quantos deles foram aprovados (nota maior ou igual a 7).
        for(int i = 0; i < 5; i++){
            double nota = s.nextDouble();

            if(nota >= 7)
            System.out.println("Aprovado");
            else
            System.out.println("Reprovado");
        }
        s.close();
    }

    public static void question02(){
        /* Faça um programa que exiba a soma dos dígitos de um número inteiro fornecido pelo usuário */
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = s.nextInt();
        int soma = 0;

            while (n > 0) {
            int digito = n % 10;
            soma += digito;
            n /= 10;  
        }
                System.out.println("A soma dos dígitos do número inteiro é " + n );
                s.close();
    }

    public static void question03(){
         // Elabore um programa que leia um número inteiro e exiba todos os seus divisores.
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        int i = 1;
        while(i <= number){
            if(number % i == 0)
            System.out.println(i + " é divisor de : " + number);
            i++;
        }
        s.close();
    }

    public static void question04(){
         // Desenvolva um programa que calcule a média de altura de 5 pessoas.
        Scanner s = new Scanner(System.in);
        int pessoas = 5;
        double contador = 0;
        for(int i = 0; i <= pessoas; i++){
            double altura = s.nextDouble();
            contador = +altura;
        }
        double media = contador/5;
        System.out.println("Média das alturas: " + media);
        s.close();
    }

    public static void question05(){
        // Faça um programa que exiba os números de 1 a 100, substituindo os múltiplos de 3 pela palavra "Fizz"
        // e os múltiplos de 5 pela palavra "Buzz". Para os números que são múltiplos de ambos, utilize a palavra "FizzBuzz".
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println("Esse número não é multiplo de 3 e nem de 5.");
            }
        }
    }

    public static void question06(){
         // Elabore um programa que leia um número inteiro e exiba a soma dos dígitos pares desse número.
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int soma = 0;
        int i = 0;

        while(number > 0){
            int digito = number % 10;
            if (digito % 2 == 0) {
                soma += digito;
            }
            number/=10;
        } 
        System.out.println(soma);
        s.close();
    }

    public static void question07(){
          // Faça um programa que leia um número inteiro e exiba o número invertido. Por exemplo, se o
        // número lido for 123, o programa deve exibir 321.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int invertido = 0;

        while (n > 1) {
            int digito = n % 10; 
            invertido = invertido * 10 + digito;
            n /=10;
        }
        System.out.println(invertido);
        s.close();
    }

    public static void question08(){
         // Elabore um programa que calcule a soma dos números de 1 a 100 utilizando o while.
        Scanner s = new Scanner(System.in);
        int i = 1;
        int soma = 0; 

        while(i <= 100){
            soma += i;
            i++;
        }
        System.out.println(soma);
        s.close();
    }

    public static void question09(){
         // Faça um programa que calcule o produto dos números de 1 a 5 utilizando o while.
        int n = 1;
        int multi = 1;

        while (n <= 5) {
            multi *= n;
            n++;
    }
        System.out.println(multi);
    }

    public static void question10(){
        // Crie um programa que exiba a tabuada do 9 utilizando o while.
        int number = 9;
        int multi = 1;
        
        while (multi <= 10){
        int resultado = multi * number; 
        System.out.println(resultado);
        multi ++; 
        }
    }

    public static void question11(){
        // Crie um programa que leia uma sequência de números inteiros do usuário e exiba o maior e o
        // menor valor digitado. O programa deve parar de ler quando o usuário digitar o número 0 utilizando o while.
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int maior = number;
        int menor = number;

        while (number != 0) {
            if (number > maior) {
                maior = number;
            } else if (number < menor) {
                menor = number;
            }
            number = s.nextInt();
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        s.close();
    }

    public static void question12(){
        // Crie um programa que leia uma sequência de números inteiros do usuário e exiba a média dos
        // números digitados. O programa deve parar de ler quando o usuário digitar o número -1 utilizando o while.
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int soma = 0;
        int quant = 0;

        while (number != -1) {
            soma += number;
            quant++;
            number= s.nextInt();
        }

        if (quant > 0) {
            double media = (double) soma / quant;
            System.out.println("Média dos números digitados: " + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }
        s.close();
    }

    public static void question13(){
        // Faça um programa que leia um número inteiro e exiba a soma dos seus dígitos elevados ao cubo utilizando o while..
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int soma = 0;
        int i = 0;
        int res = 0;
    
        while(n > 0){
            int digito = n % 10;
            soma += digito;
            res = (int) Math.pow(soma, 2);
            n/=10;
        } 
        System.out.println(res);
        s.close();
    }

    public static void question14(){
         // Faça um programa que exiba os números ímpares de 1 a 100 utilizando o while.
        int n = 1;
        while (n <= 100) {
            if (n % 2 == 1) {
                System.out.println(n);
            }
            n ++; 
        }
    }

    public static void question15(){
        // Desenvolva um programa que exiba todos os múltiplos de 3 no intervalo de 1 a 50 utilizando o while.
        int n = 1;
        while (n <= 50) {
            if (n % 3 == 0) {
                System.out.println(n);
            }
            n ++;
        }
    }

    public static void question16(){
        // Crie um programa que leia 5 notas de alunos e exiba quantos deles foram aprovados (nota maior ou igual a 7) utilizando o while.
        Scanner s = new Scanner(System.in);
        int i = 0;
        int aprovados = 0;
        

        while (i < 5) {
            int nota = s.nextInt();
            if (nota >= 7) {
                aprovados ++;
            } 
            i++;
        }
        System.out.println(aprovados);
        s.close();
    }

    public static void question17(){
         // Elabore um programa que leia uma sequência de números inteiros do usuário e determine
        // quantos números pares foram digitados antes do primeiro número ímpar. O programa deve parar
        // de ler quando o usuário digitar o número 0 utilizando o while.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int AntesDeImpar = 0;
        boolean Impar = false;

        while (n != 0 && !Impar) {
            if (n % 2 == 0) {
                AntesDeImpar++;
            } else {
                Impar = true;
            }
            n = s.nextInt();
        }
        System.out.println(AntesDeImpar);
        s.close();
    }
    public static void question18(){
         // Crie um programa que leia uma sequência de números inteiros do usuário e exiba quantos
        // números pares e quantos números ímpares foram digitados. O programa deve parar de ler quando
        // o usuário digitar o número 0 utilizando o while.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int par = 0;
        int impar = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            
            n = s.nextInt();
        }
        System.out.println(par);
        System.out.println(impar);
        s.close();
    }
    public static void question19(){
         // Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
        // números são divisíveis por 2, quantos são divisíveis por 3 e quantos são divisíveis por 5. O
        // programa deve parar de ler quando o usuário digitar o número 0 utilizando o while.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int div2  = 0;
        int div3 = 0; 
        int div5 = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                div2++;
            }
            if (n % 3 == 0) {
                div3++;
            }
            if (n % 5 == 0) {
                div5++;
            }
            n = s.nextInt();
        }

        System.out.println(div2);
        System.out.println(div3);
        System.out.println(div5);
        s.close();
    }

    public static void question20(){
         // Desenvolva um programa que leia uma sequência de números inteiros do usuário e exiba a média
        // dos números divisíveis por 3. O programa deve parar de ler quando o usuário digitar o número 0
        // utilizando o while.
        Scanner s = new Scanner(System.in);
        int contador = 0;
        int div = 0;
        while (true){
            int n = s.nextInt();
            if (n == 0) {
                System.out.println("Fim.");
                break;
            }
            if (n%3 == 0){
                contador++;
                div += n;
            }
        }
        int media = div/contador;
        System.out.println(media);
        s.close();
    }

    public static void question21(){
         /* Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
             números possuem mais de três dígitos. O programa deve parar de ler quando o usuário digitar o
            número 0 utilizando o while....*/
        Scanner s = new Scanner(System.in);
        int contador = 0;
        while (true) {
            int n = s.nextInt();
            if (n == 0) {
                System.out.println("Fim.");
                break;
            } else {
                int numDigitos = 0;
                int numero = n;
                while (numero > 0) {
                    numero = numero / 10;
                    numDigitos++;
                }
                if (numDigitos > 3) {
                    contador++;
                }
            }
        }
        System.out.println(contador);
        s.close();
    }

    public static void question22(){
         //  Desenvolva um programa que leia uma sequência de números inteiros do usuário e exiba a média
        //  dos números que estão entre 50 e 100. O programa deve parar de ler quando o usuário digitar o
        //  número 0 utilizando o while.
        Scanner s = new Scanner(System.in);
        int numeros = 0;
        int contador = 0;
        while (true){
            int n = s.nextInt();
            if(n==0){
                System.out.println("Fim.");
                break;
            }
            if(n >= 50 && 100 > n){
                contador++;
                numeros += n;
            }
        }
        int media = numeros/contador;
        System.out.println(media);
        s.close();
    }

    public static void question23(){
         // Elabore um programa que leia uma sequência de números inteiros do usuário e exiba o menor
        // valor digitado que seja positivo e ímpar. O programa deve parar de ler quando o usuário digitar o
        // número 0 utilizando o while.
        Scanner s = new Scanner(System.in);
        int menor = 50000;
        while(true){
            int n = s.nextInt();
            if(n == 0){
                System.out.println("Fim.");
                break;
            }
            if(n > 0 && n%2 != 0){
                if(n < menor){
                    menor = n;
                }
            }
        }
        System.out.println(menor);
        s.close();
    }

    public static void question24(){
        // Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
        // números são pares e quantos números são ímpares entre o primeiro e o último número digitado.
        // O programa deve parar de ler quando o usuário digitar o número 0 utilizando o while.
        Scanner s = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        while (true) {
            int n = s.nextInt();
            if (n == 0) {
                System.out.println("Fim.");
                break;
            }
            if(n%2 == 0){
                par++;
            }else
                impar++;
        }
        System.out.println("Na sequência, existem " + par + " números pares e " + impar + " números ímpares." );
        s.close();
    }

    public static void main(String[] args) {
        
    }
}
