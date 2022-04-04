
public class pilotoAutomatico {

	public static void main(String[] args) {
		
		/*Scanner ler = new Scanner(System.in);*/
		/*System.out.println("Informe o valor de x:");
		int x = ler.nextInt();
		
		System.out.println("Informe o valor de y:");
		int y = ler.nextInt();
		
		System.out.println("Informe o valor de z:");
		int z = ler.nextInt();*/
		
		int x = 105;
		int y = 212;
		int z = 319;
		double diferenca1 = (y - x);
		double diferenca2 = (y - z);
		
		/*diferenca1 = (y - x);*/
		/*diferenca2 = (y - z);*/
		
		if (diferenca1 == diferenca2) {
			System.out.println("MANTER!");
		}
		else if (diferenca1 < diferenca2){
			System.out.println("ACELERAR!");
		}
		else {
			System.out.println("DESACELERAR!");
		}
		
		/*Scanner ler = new Scanner(System.in);*/
	}
	
}
