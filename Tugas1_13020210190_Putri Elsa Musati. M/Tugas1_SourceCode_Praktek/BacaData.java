/* 13020210190
Putri Elsa Musati. M
Selasa, 7 Maret 2023 7.01 pm*/

import java.util.Scanner;

public class BacaData
{
	public static void main (String[] args)
	{
		int a;
		Scanner masukan;

		System.out.print("Contoh membaca dan menulis, ketik integer : \n");
 		masukan = new Scanner(System.in);
		a = masukan.nextInt();

		System.out.print ("Nilai yang dibaca : " + a);
	}
}  