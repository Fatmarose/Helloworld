package EnbuyukSayiBulma;

import java.util.Scanner;

public final class EnbuyukSayiBulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("5 tane sayı girin.");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();
		int sayi4 = scan.nextInt();
		int sayi5 = scan.nextInt();
		
		int EnBuyuk= sayi1;
		if (sayi2 > EnBuyuk) {
			EnBuyuk = sayi2;
		}
		if (sayi3 > EnBuyuk) {
			EnBuyuk = sayi3;
		}
		if (sayi4 > EnBuyuk) {
			EnBuyuk = sayi4;
		}
		if (sayi5 > EnBuyuk) {
			EnBuyuk = sayi5;
		}
			System.out.println(EnBuyuk);
		
		
	}

}