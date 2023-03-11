/*13020210190 
Putri Elsa Musati. M
Selasa 7 Maret 2023 6.09 pm*/

import java.util.Scanner;

public class StudiKasus 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan total detik : ");
        int d = sc .nextInt();
       
	int d1 = d % 60;

	int m = d / 60 ; 

	int m2 = m % 60; 

        int j = m / 60;
	
	int j1 = j % 24;
        
        System.out.println("Detik sekarang  = " + d1 + " detik");
 	System.out.println("Total menit     = " + m + " menit");
	System.out.println("Menit sekarang  = " + m2 + " menit");
	System.out.println("Total Jam       = " + j + " jam");
	System.out.println("Jam sekarang    = " + j1 + " jam");
	System.out.println("Tampil Waktu    = "+ j1 + ":" + m2 + ":" + d1);
    }
}