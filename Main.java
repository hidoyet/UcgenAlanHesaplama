package UcgenAlaniniHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,b,c,toplam;
		double u,alan;
		Scanner kenarUzunlugu=new Scanner(System.in);
		System.out.println("��genin kenar uzunluklar�n� giriniz: ");
		System.out.println("Birinci kenar uzunlu�unu giriniz");
		a=kenarUzunlugu.nextInt();
		System.out.println("�kinci kenar uzunlu�unu giriniz");
		b=kenarUzunlugu.nextInt();
		System.out.println("���nc� kenar uzunlu�unu giriniz");
		c=kenarUzunlugu.nextInt();
		
		toplam=a+b+c;
		
		u=toplam/2;
		alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("��genin alan�:" + alan);
		
	}

}
