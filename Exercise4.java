/*Exercise4*/
import java.util. *;
public class Exercise4{
public static void main (String [] args) {  
Scanner sc = new Scanner (System.in);
System.out.println ("Informe o primeiro valor: ");  
		double n1 = sc.nextDouble(); 
System.out.println ("Informe o segundo valor: ");  
		double n2 = sc.nextDouble(); 
System.out.println ("Escolha uma opcao: ) Subtracao. 1) Soma. 2) Multiplicacao. 3) Divisao. 4");  
        int escolha = sc.nextInt();
switch (escolha) {
      case 1:
        double calculo = n1 - n2;
        System.out.println (n1 + " - " + n2 + " = " + calculo);
        break;
      case 2:
        double calculo2 = n1 + n2;
        System.out.println (n1 + " + " + n2 + " = " + calculo2);
        break;
      case 3:
        double calculo3 = n1 * n2;
        System.out.println (n1 + " x " + n2 + " = " + calculo3);
        break;
      case 4:
        double calculo4 = n1 / n2;
        System.out.println (n1 + "/" + n2 + " = " + calculo4);
        break;
}
}
}