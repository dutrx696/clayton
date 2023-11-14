package aprendendoJava;

public class q9 {    Scanner scanner = new Scanner(System.in);

String nomeMaisNova = "";
int idadeMaisNova = Integer.MAX_VALUE;

for (int i = 1; i <= 10; i++) {
    System.out.print("Digite o nome da pessoa " + i + ": ");
    String nome = scanner.nextLine();

    System.out.print("Digite a idade da pessoa " + i + ": ");
    int idade = scanner.nextInt();
    scanner.nextLine();

    if (idade < idadeMaisNova) {
        idadeMaisNova = idade;
        nomeMaisNova = nome;
    }
}

System.out.println("A pessoa mais nova é: " + nomeMaisNova);

scanner.close();
}

}
