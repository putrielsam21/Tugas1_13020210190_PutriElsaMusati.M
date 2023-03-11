/*13020210190 
Putri Elsa Musati. M 
Selasa 7 Maret 2023 9.52 pm*/

import java.util.Scanner;

public class Ekspresi 
{
	public static void main(String[] args) 
	{
		int x, y;
		Scanner input = new Scanner(System.in);
	
		System.out.print("Masukkan nilai x : ");
		x = input.nextInt();
	
		System.out.print("Masukkan nilai y : ");
		y = input.nextInt();
	
		System.out.print("x = "+ x + "\n"); 
		System.out.print("y = "+ y + "\n");
	
		if(x < y) {
			System.out.print("hasil ekspresi  (x < y) ? x : y = " + x);
		} else {
			System.out.print("hasil ekspresi  (x > y) ? x : y = "+y);
		}
	
	}
}