/*Exercício 2*/
import java.util. *;
public class Exercise2 {
public static void main (String [] args) {  
Scanner sc = new Scanner (System.in);
System.out.println ("Informe o primeiro valor: ");  
		int n1 = sc.nextInt(); 
System.out.println ("Informe o segundo valor: ");  
		int n2 = sc.nextInt(); 
System.out.println ("Informe o terceiro valor: ");  
		int n3 = sc.nextInt(); 
if (n1 > n2 && n1 > n3) {
System.out.println ("O primeiro valor, " + n1 + ", é o maior valor.");    
}
if (n2 > n1 && n2 > n3) {
System.out.println ("O segundo valor, " + n2 + ", é o maior valor."); 
}
else {
System.out.println ("O terceiro valor, " + n3 + ", é o maior valor."); 
}
}
}