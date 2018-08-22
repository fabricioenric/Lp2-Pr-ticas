import java.util.*;

public class Main {
    public static void main(String[] args) {
        HugeInteger vetor = new HugeInteger();
        Scanner ler = new Scanner(System.in);
        long opcoes, input;
        int  index1, index2;

        do{
            System.out.println("\nEscolha uma das opcoes: \n1-Adicionar Huge Integer\n2-Visualizar Huge Integer\n3-Somar Huge Integers\n4-Subtrair Huge Integers\n5-Multiplicar Huge Integers\n6-Dividir Huge Integers\n7-Verificar se sao iguais\n8-Verificar se nao sao iguais\n9-Verificar se o primeiro eh maior que o segundo\n10-Verificar se o primeiro eh menor que o segundo\n11-Verificar se o primeiro eh maior ou igual que o segundo\n12-Verificar se o primeiro eh menor ou igual que o segundo\n13-Verificar se nao existem Huge Integers armazenados\n9999-Sair\n");
            opcoes = ler.nextLong();

            if(opcoes == 1){
                System.out.println("\nDigite um Huge Integer de 19 digitos: \n");
                input = ler.nextLong();

                vetor.inputHugeInteger(input);
            }

            else if(opcoes == 2){
                System.out.println("\nDigite a posicao desejada para acessar o Huge Integer: \n");
                index1 = ler.nextInt();

                vetor.outputHugeInteger(index1);
            }

            else if(opcoes == 3){
                System.out.println("\nDigite as duas posicoes desejadas para somar dois Huge Integers: \n");
                index1 = ler.nextInt();
                index2 = ler.nextInt();

                System.out.println("\nResultado da soma: "+ vetor.addHugeIntegers(index1, index2));
            }

            else if(opcoes == 4){
                System.out.println("\nDigite as duas posicoes desejadas para subtrair dois Huge Integers: \n");
                index1 = ler.nextInt();
                index2 = ler.nextInt();

                System.out.println("\nResultado da subtracao: "+ vetor.subtractHugeIntegers(index1, index2));
            }

            else if(opcoes == 5){
                System.out.println("\nDigite as duas posicoes desejadas para multiplicar dois Huge Integers: \n");
                index1 = ler.nextInt();
                index2 = ler.nextInt();

                System.out.println("\nResultado da multiplicacao: "+ vetor.multiplyHugeIntegers(index1, index2));
            }

            else if(opcoes == 6){
                System.out.println("\nDigite as duas posicoes desejadas para dividir dois Huge Integers: \n");
                index1 = ler.nextInt();
                index2 = ler.nextInt();

                System.out.println("\nResultado da divisao: "+ vetor.divideHugeIntegers(index1, index2));
            }

            else if(opcoes == 7){
                System.out.println("\nDigite as duas posicoes desejadas para verificar se dois Huge Intergers sao iguais: \n");
                index1 = ler.nextInt();
                index2 = ler.nextInt();

                System.out.println("\nResultado da comparacao: "+ vetor.isEqualTo​(index1, index2));
            }

            else if(opcoes == 8){
                System.out.println("\nDigite as duas posicoes desejadas para verificar se dois Huge Intergers nao sao iguais: \n");
                index1 = ler.nextInt();
                index2 = ler.nextInt();

                System.out.println("\nResultado da comparacao: "+ vetor.isNotEqualTo​(index1, index2));
            }

            else if(opcoes == 9){
                System.out.println("\nDigite as duas posicoes desejadas para verificar se o Huge Interger da primeira posicao eh maior do que o da segunda posicao: \n");
                index1 = ler.nextInt();
                index2 = ler.nextInt();

                System.out.println("\nResultado da comparacao: "+ vetor.isGreaterThan(index1, index2));
            }

            else if(opcoes == 10){
                System.out.println("\nDigite as duas posicoes desejadas para verificar se o Huge Interger da primeira posicao eh menor do que o da segunda posicao: \n");
                index1 = ler.nextInt();
                index2 = ler.nextInt();

                System.out.println("\nResultado da comparacao: "+ vetor.isLessThan(index1, index2));
            }

            else if(opcoes == 11){
                System.out.println("\nDigite as duas posicoes desejadas para verificar se o Huge Interger da primeira posicao eh igual ou maior do que o da segunda posicao: \n");
                index1 = ler.nextInt();
                index2 = ler.nextInt();

                System.out.println("\nResultado da comparacao: "+ vetor.isGreaterThanOrEqualTo(index1, index2));
            }

            else if(opcoes == 12){
                System.out.println("\nDigite as duas posicoes desejadas para verificar se o Huge Interger da primeira posicao eh igual ou menor do que o da segunda posicao: \n");
                index1 = ler.nextInt();
                index2 = ler.nextInt();

                System.out.println("\nResultado da comparacao: "+ vetor.isLessThanOrEqualTo(index1, index2));
            }

            else if(opcoes == 13){
                System.out.println("\nResultado: "+ vetor.isZero());
            }

            else if(opcoes == 14){
                System.out.println(vetor.tamanho());
            }

        }while(opcoes != 9999);

        System.out.println("\nSaindo....\n");

    }
}
