package ödevler;

import java.util.Iterator;

public class arraysDemo {

	public static void main(String[] args) {

		String ogrenci1 = "ahmet";
		String ogrenci2 = "derin";
		String ogrenci3 = "okan";
		String ogrenci4 = "beyza";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "engin";
		ogrenciler[1] = "derin";
		ogrenciler[2] = "okan";
		ogrenciler[3] = "beyza";
		// ogrenciler[4]="ahmet";

		for (int i = 0; i < ogrenciler.length; i++) {

			System.out.println(ogrenciler[i]);
		}

		// veyaaaa

		for (String ogrenci : ogrenciler) {
			System.err.println(ogrenci);

		}

	}

}
