import java.util.Scanner;

class Calendario {
	
	static int ano;
	
	public static void calendarioJudeu(){
		System.out.printf("O ano convertido e: %d", ano + 3760);
	}
	
	public static void calendarioIslamico(){
		System.out.printf("O ano convertido e: %d", ano - 579);
	}
  
	public static void validarAno(){
		if(ano <= 0){
			System.out.println("O Ano inserido e invalido, por favor, insira um ano valido para continuar...");
			main(null);
		}
	}
  
	public static void main(String args[]){  
   
    	Scanner teclado = new Scanner(System.in);
    	
		int calendario;
		
		System.out.printf("Digite o ano em formato gregoriano: \n");
		
		ano = teclado.nextInt();
		
		validarAno();
		
		System.out.printf("Digite 1 - Judeu\n");
		System.out.printf("Digite 2 - Islamico\n");
		
		calendario = teclado.nextInt();
		
		switch(calendario){
			case 1:
				calendarioJudeu();
			break;
			
			case 2:
				calendarioIslamico();
			break;
			
			default:
				validarAno();
			break;
			
		}				
    	System.exit(0);
	}
}
