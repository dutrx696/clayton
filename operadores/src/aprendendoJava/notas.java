package aprendendoJava;

import java.util.Scanner;

public class notas.java {
    public static void main (String [] args){
        Scanner valor = new Scanner(System.in);
        int nota;
        
        System.out.print("digite a sua nota: ");
        nota = valor.nextInt();
        
        if (nota>=7) {
        	System.out.println("voce foi aprovado");
        	
        }else if (nota>=7) {
        	System.out.println("voce esta de recuperaçao =");
        }
    }

