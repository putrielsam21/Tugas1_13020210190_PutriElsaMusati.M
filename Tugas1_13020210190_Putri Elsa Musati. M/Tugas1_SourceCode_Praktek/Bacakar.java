/* 13020210190
Putri Elsa Musati. M
Selasa, 7 Maret 2023 9.14 pm */

import java.util.Scanner;
import java.io.Console;
import javax.swing.JOptionPane;

public class Bacakar 
{
	public static void main(String[] args) 
	{
		char cc;
		int bil;

		// menggunakan class Scanner untuk membaca input dari user
   		Scanner scanner = new Scanner(System.in);

		System.out.println("hello");
		System.out.print("baca 1 karakter: ");
		cc = scanner.next().charAt(0);
		System.out.print("baca 1 bilangan: ");
		bil = scanner.nextInt();

		System.out.println(cc);
		System.out.println(bil);
		System.out.println("bye");

		// menggunakan class Console untuk membaca input dari user
		Console console = System.console();

		if (console != null) 
		{
        		System.out.println("hello");
        		cc = console.readLine("baca 1 karakter: ").charAt(0);
        		bil = Integer.parseInt(console.readLine("baca 1 bilangan: "));
        		System.out.println(cc);
        		System.out.println(bil);
        		System.out.println("bye");
    		}

		// menggunakan class JOptionPane untuk membaca input dari user
		JOptionPane.showMessageDialog(null, "hello");
		cc = JOptionPane.showInputDialog("baca 1 karakter: ").charAt(0);
		bil = Integer.parseInt(JOptionPane.showInputDialog("baca 1 bilangan: "));
		JOptionPane.showMessageDialog(null, cc + "\n" + bil);
		JOptionPane.showMessageDialog(null, "bye");
	}
}