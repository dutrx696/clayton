package aprendendoJava;

public class q8 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int idade = 0;
    int maiores = 0;

    for (int i = 1; i <= 20; i++) {
        System.out.print("Digite a idade da pessoa " + i + ": ");
        idade = scanner.nextInt();
        
        if (idade >= 18) {
        	maiores++;
    }

    }

    System.out.println("Número de pessoas que são maiores de idade: " + maiores);

}

}
