package exercicio;

import java.util.Locale;

public class exercicio {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:\n" + product1 + ", which price is $ %.2f \n", price1);
		System.out.printf(product2 + ", which price is $ %.2f\n", price2);
		System.out.printf("Record :" + age + " years old, code " + code + " and gender: "+ gender + "\n\n");
		System.out.printf("Measue with eight decimanl places : " + measure + "\nRounded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
