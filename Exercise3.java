/* Exercise3 Digite 3 valores, e a soma dos dois maiores*/
import java.util. *;
public class Exercise3{
public static void main (String [] args) {  
Scanner sc = new Scanner (System.in);
System.out.println ("Informe o primeiro valor: ");  
		int n1 = sc.nextInt(); 
System.out.println ("Informe o segundo valor: ");  
		int n2 = sc.nextInt(); 
System.out.println ("Informe o terceiro valor: ");  
		int n3 = sc.nextInt(); 
if (n1 > n2 && n1 > n3 && n2 > n3 || n2 > n1 && n2 > n3 && n1 > n3) {
        int soma = n1 + n2;
System.out.println ("A soma dos dois maiores valores �: " + soma);    
}
if (n1 > n2 && n1 > n3 && n3 > n2 || n3 > n1 && n3 > n2 && n1 > n2) {
        int soma = n1 + n3;
System.out.println ("A soma dos dois maiores valores �: " + soma);    
}
else {
        int soma = n2 + n3;
System.out.println ("A soma dos dois maiores valores �: " + soma);  
}
}
}