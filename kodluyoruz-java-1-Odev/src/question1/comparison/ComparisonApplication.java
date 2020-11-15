package question1.comparison;

import java.util.Scanner;

public class ComparisonApplication {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String password1 = "8954";
		
		System.out.println("Lütfen bir şifre giriniz: ");
		String password2 = input.next();
		
		if(password2.equals(password1)) {
			
			System.out.println("Giriş Başarılı!");
		}
		else
		{
			System.out.println("Giriş Başarısız");
		}
		
		input.close();
	}

}
