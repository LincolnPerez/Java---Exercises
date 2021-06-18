/*7. Faca um programa que leia 10 numeros que o usuario vai informar. Todos os numeros lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada.*/
import java.util.*;

public class Exercise7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;

		while (x<10){
			System.out.print("Escreva um numero:");
			int n = sc.nextInt();
			
			if (n<40){
				y = y+n;
			}
			x++;
		}
		System.out.print("A soma dos numeros e " + y);
  }
}	