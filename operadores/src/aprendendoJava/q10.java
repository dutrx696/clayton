package aprendendoJava;

public class q10 {      Scanner scanner = new Scanner(System.in);

System.out.print("Por favor, digite um número: ");
int numero = scanner.nextInt();

System.out.println("Tabuada de multiplicação para " + numero + ":");

for (int i = 1; i <= 10; i++) {
    int resultado = numero * i;
    System.out.println(numero + " x " + i + " = " + resultado);
}
}


