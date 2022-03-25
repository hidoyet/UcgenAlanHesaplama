package UcgenAlaniniHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,b,c,toplam;
		double u,alan;
		Scanner kenarUzunlugu=new Scanner(System.in);
		System.out.println("Üçgenin kenar uzunluklarýný giriniz: ");
		System.out.println("Birinci kenar uzunluðunu giriniz");
		a=kenarUzunlugu.nextInt();
		System.out.println("Ýkinci kenar uzunluðunu giriniz");
		b=kenarUzunlugu.nextInt();
		System.out.println("Üçüncü kenar uzunluðunu giriniz");
		c=kenarUzunlugu.nextInt();
		
		toplam=a+b+c;
		
		u=toplam/2;
		alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Üçgenin alaný:" + alan);
		
	}

}
