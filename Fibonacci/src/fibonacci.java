import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa el numero de fibonacci que quieres");
		
		int numerofib = leer.nextInt();
		/*int num1 = 0;
		int num2 = 1;
		int sumatoria = 0;
		
		
		for(int j = 1; j<= numerofib; j++) {
			
			sumatoria = num1 + num2;
		
			num1 = num2;
			num2 = sumatoria;
		}
		System.out.println("Numero fibonacci #"+ numerofib + " "+ num1);*/
		
		System.out.println("Numero fibonacci: "+ recursiva(numerofib+1));
	}
	public static int recursiva(int n) {
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}
		return recursiva(n-1)+recursiva(n-2);
		
	}
}
