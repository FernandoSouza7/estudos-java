package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		System.out.println();
			double raio = 3.4;
			//Uma vez que a variável é declarada com final, ela não poderá ser alterada.
			final double PI = 3.14159;
			
			raio = 10;
			double area = PI * raio * raio;
				
			System.out.println(area);
	}
}
