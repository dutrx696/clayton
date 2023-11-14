package aprendendoJava;

public class q5 {public static void main (String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	int num = 0;
	
	for(int i = 0; i <= 10; i++) {
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		num += numero;
	}
	
	System.out.println ("A soma dos 10 números é: " + num);
}

}
