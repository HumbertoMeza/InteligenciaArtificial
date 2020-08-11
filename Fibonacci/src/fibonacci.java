
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Numerofib = 20;
		int num1 = 0;
		int num2 = 1;
		int sumatoria = 0;
		
		
		for(int j = 1; j<= Numerofib; j++) {
			System.out.println(j +".- "+ num1);
			
			sumatoria = num1 + num2;
		
			num1 = num2;
			num2 = sumatoria;
		}
	}

}
