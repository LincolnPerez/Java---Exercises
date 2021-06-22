 import java.util.Scanner;

import org.graalvm.compiler.nodes.extended.OpaqueNode;

public class Cine {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		 String nome;
		 int alfa,aa=23,ba=23,ca=23,da=23,ea=24,fa=24,defa=12;
         int beta,ab=24,bb=24,cb=24,db=24,eb=24,defb=6;
         int opcao,ingresso=0,lugar;
        
         
         
         alfa=aa+ba+ca+da+ea+fa;
         beta=ab+bb+cb+db+eb;
         
         
         	System.out.println("Seja bem-vindo(a) ao Cinema ! Digite o seu nome: ");
        	 nome=in.nextLine();
         
         	System.out.println("Hoje temos dois filmes em cartaz, informe qual você deseja assistir: \n1- As branquela \n2- A chegada");
         	opcao=in.nextInt();
         
         
         
         
        if (opcao <=0 || opcao >=3 ) {
   	 		
   	 		System.out.println("No momento não temos essa opção, por favor escolha uma opção disponível");
         }
   	 		
		 	//OPCÇÃO 1// SALA ALFHA//
		 
        
         if(opcao==1) {
        	 
        	 
        	   	System.out.println("Você escolheu a opção 1, As Branquelas, informe qual fileira você deseja se sentar, sendo de 1 a 6 ou 7 sendo a fileira preferencial  " );
        	   lugar=in.nextInt();
        	 
        	if(opcao==1 && lugar<1 || lugar>7) {
        	   
        		 System.out.println("Essa fileira não está disponível, tente novamente");
        		 }
        	   
        	if(opcao==1 && lugar >= 1 && lugar<=7) {
        	  
        	  	System.out.println("Quantos ingressos você deseja: ");
        	 	ingresso=in.nextInt();
        	
        	}
        	  
        	
        	   
        	 	
        		if(lugar >0 && lugar<5) {
        	 	
        		
        	 
        	 
        	if(ingresso>0 && ingresso<24) {
        		  
        		  System.out.println("Obrigado " + nome + ", sua fileira é a " + lugar + ", e o seu número de ingressos é: " + ingresso);
        		  System.out.println("numero de acentos ainda disponivel:" + ((alfa+defa)-ingresso));
        	  }
        	 
        	else if (ingresso>23)	{
        	 
        		System.out.println("Essa fileira não está disponível ou numero de ingressos maior que a fileira, tente novamente");
        	}
        	 	
        	} 

        	if(lugar >4 && lugar<7) {
        	 	
        		
        	 
        	 
        	if(ingresso>0 && ingresso<25) {
        		  
        		  System.out.println("Obrigado " + nome + ", sua fileira é a " + lugar + ", e o seu número de ingressos é: " + ingresso);
        		  System.out.println("numero de acentos ainda disponivel:" + ((alfa+defa)-ingresso));
        	  }
        	 
        	else if (ingresso>24)	{
        	 
        		System.out.println(" Essa fileira não está disponível ou numero de ingressos maior que a fileira, tente novamente");
        	}
        	 	
        	} 
        	 
        	 
        	 
        	 
        	if(lugar==7 && ingresso<=12) {
        	 		
				System.out.println("Obrigado " + nome + ", sua fileira é a " + lugar + ", e o seu número de ingressos é: " + ingresso);
				System.out.println("numero de acentos ainda disponivel:" + ((alfa+defa)-ingresso));
        	 		
        	}else if(lugar==7 && ingresso>12) {
        	 		
				System.out.println(" Essa fileira não está disponível ou numero de ingressos maior que a fileira, tente novamente");
        	 	System.exit(0);
        	 	
        	 	}
        	 
         }
         
          
         
         
		 
      		//OPÇÃO 2 // SALA BETA//
         
         
        if(opcao==2) {
        	 

			System.out.println("Você escolheu a opção 2, A Chegada, informe qual fileira você deseja se sentar, sendo de 1 a 5 ou 6 sendo a fileira preferencial  " );
      	   lugar=in.nextInt();
      	 
      	   
      	if(opcao==2 && lugar<1 || lugar>6) {
      	   
    		System.out.println(" Essa fileira não está disponível ou numero de ingressos maior que a fileira, tente novamente");
    		 }
      	   
      	   
      	   
      	if(opcao==2 && lugar >= 1 && lugar <=6) { 
			System.out.println("Quantos ingressos você deseja: ");
      	    ingresso=in.nextInt();
      	  }  
      	if(lugar >0 && lugar<6) {
      	 	
      		
      	 
      	 
      	if(ingresso>0 && ingresso<25) {
      		  
			System.out.println("Obrigado " + nome + ", sua fileira é a " + lugar + ", e o seu número de ingressos é: " + ingresso);
			System.out.println("numero de acentos ainda disponivel:" + ((beta+defa)-ingresso));
      	  }
      	 
      	else if (ingresso>24)	{
      	 
			System.out.println(" Essa fileira não está disponível ou numero de ingressos maior que a fileira, tente novamente");
      	}
      	 	
      	} 

      	 
      	 

      	 
      	 if(lugar==6 && ingresso<=6) {
      	 		
			System.out.println("Obrigado " + nome + ", sua fileira é a " + lugar + ", e o seu número de ingressos é: " + ingresso);
			System.out.println("numero de acentos ainda disponivel:" + ((beta+defa)-ingresso));

      	}else if(lugar==6 && ingresso>6) {
      	 		
			System.out.println(" Essa fileira não está disponível ou numero de ingressos maior que a fileira, tente novamente");
      	 		System.exit(0);
      	 	
      	 		}	
         	 }
       	 }
	}

	