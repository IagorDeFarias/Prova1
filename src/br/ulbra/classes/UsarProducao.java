package br.ulbra.classes;
/**
 * @author Iagor L.
 */
import java.util.Scanner;

public class UsarProducao 
{
    public static void main(String[] args) 
    {
        Producao prod = new Producao();
        Scanner ler = new Scanner (System.in);
        
        prod.calcularHMS();
        
        System.out.println(prod.toString());
        
        System.out.println("Digite a peça: ");
        prod.setPeca(ler.nextLine());
        System.out.println("Digite o valor em segundos: ");
        prod.setSegundos(ler.nextInt());
        
        prod.calcularHMS();
        System.out.println(prod.toString());
    }
}
