import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = 0.0, altura = 0.0, lado = 0.0, comprimento = 0.0, largura = 0.0;
        double volume = 0.0;
        int opcao = 0;

        do {
            System.out.println(" ---------------------------------------------------- ");
            System.out.println("   Programa: calcular volume de figuras geométricas   ");
            System.out.println(" ---------------------------------------------------- ");
            System.out.println(" 1 - Volume do Cilindro");
            System.out.println(" 2 - Volume do Cone");
            System.out.println(" 3 - Volume do Prisma");
            System.out.println(" 4 - Volume da Esfera");
            System.out.println(" 5 - Volume do Cubo");
            System.out.println(" 6 - Volume da Pirâmide");
            System.out.println(" 7 - Volume do Paralelepípedo");
            System.out.println(" 0 - Sair");
            System.out.println("\n\n");
            System.out.println("Escolha sua opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(" Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println(" Digite o valor da altura ");
                    altura = sc.nextDouble();

                    volume = Cilindro.calcularCilindro(raio, altura);

                    System.out.printf("O volume do cilindro é: %.2f \n\n\n", volume);

                case 2:
                    System.out.println("Calcular volume do cone");

                    System.out.println(" Digite o raio do cone: ");
                    raio = sc.nextDouble();
                    System.out.println(" Digite a altura do cone: ");
                    altura = sc.nextDouble();

                    volume = Cone.calcularCone(raio,altura);
                    System.out.printf(" Volume do cone é: %.2f \n\n\n",volume);

                case 3:
                    System.out.println(" Digite o tamanho do lado: ");
                    lado = sc.nextDouble();
                    System.out.println(" Digite a altura:");
                    altura = sc.nextDouble();

                    volume = Prisma.Calcularprisma(lado,altura);

                    System.out.printf("O volume do prisma é: %.2f \n\n\n",volume);

                case 4:
                    System.out.println("Digite o raio: ");
                    raio = sc.nextDouble();
                    volume = Esfera.Calcularesfera(raio);
                    System.out.printf("O volume da esfera é: %.2f \n\n\n",volume);
                case 5:
                    System.out.println("Digite o tamanho do lado: ");
                    lado = sc.nextDouble();
                    volume = Cubo.Calcularcubo(lado);
                    System.out.printf("O volume do cubo é: %.2f \n\n\n",volume);
                case 6:
                    System.out.println("Digite o tamanho do lado: ");
                    lado = sc.nextDouble();
                    volume = Piramidetriangular.Calcularpiramidetriangular(lado,altura);
                    System.out.printf(" O volume da Pirâmide Triângular é: %.2f \n\n\n",volume);
                case 7:
                    System.out.println(" Digite o comprimeento: ");
                    comprimento = sc.nextDouble();
                    System.out.println(" Digite a largura: ");
                    largura = sc.nextDouble();
                    System.out.println(" Digite a altura: ");
                    altura = sc.nextDouble();
                    volume = Paralelepipedo.CalcularParalelepipedo(comprimento,largura,altura);
                    System.out.printf("O volume do paralepípedo é: %.2f \n\n\n",volume);


                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println(" Opção inválida !");
                    break;
            }
        }while(opcao != 0);


        sc.close();
    }
}
