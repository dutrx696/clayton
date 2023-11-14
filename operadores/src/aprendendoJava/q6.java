package aprendendoJava;

public class q6 {public static void main (String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	int idade = 0;
	
	for(int i = 0; i <= 20; i++) {
		System.out.print("Digite sua idade: ");
		int numero = scanner.nextInt();
		idade += numero;
	}
	
	System.out.println ("A soma das idades números é: " + idade);
}

}
