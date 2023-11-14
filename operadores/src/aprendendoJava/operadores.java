package aprendendoJava;

import java.util.Scanner;

public class operadores{
	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		double n1,n2,soma, sub, multi, div;

        System.out.print("informe o primeiro numero: ");
        n1 = in.nextInt();

        System.out.print("informe o segundo numero: ");
        n2 = in.nextInt();

        soma = n1 + n2;
        System.out.println("a soma deu" + soma);

        sub = n1-n2;
        System.out.println("a subtraçao deu" + sub);

        multi = n1*n2;
        System.out.println("a multiplicaçao deu" + multi);
        
        div = n1/n2;
        System.out.println("a divisao deu" + div);
        




    }
}


