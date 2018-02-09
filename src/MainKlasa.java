
import java.io.PrintStream;
import java.util.Scanner;

public class MainKlasa{

			public static void main(String[] args) {

				Scanner input = new Scanner(System.in);

				System.out.print("Molim unesite prvi broj: ");
				int broj1 = input.nextInt();
				System.out.print("Molim unesite drugi broj: ");
				int broj2 = input.nextInt();

				System.out.println(
						"Izaberite: \n"
						+ " * 1 za sabiranje \n * 2 za oduzimanje \n * 3 za mnozenje \n * 4 za dijeljenje \n * 5 stepenovanje \n * 6 korjenovanje \n");
				
				
				int opcija;
				opcija = input.nextInt();
				System.out.println("Izabrali ste: " + opcija);
				
				if (opcija == 1) {
				System.out.println("Rezultat sabiranje je: " + add(broj1, broj2));

				}
				if (opcija == 2) {
					System.out.println("Rezultat oduzimanja je: " + sub(broj1, broj2));
				}

				if (opcija == 3) {
					System.out.println("Rezultat mnozenja je: " + mul(broj1, broj2));
					
				}

				if (opcija == 4) {
					System.out.println("Rezultat dijeljenja je: " + div(broj1, broj2));
				}

				if (opcija == 5) {
					System.out.print("Rezultat stepenovanja je: " + step(broj1, broj2));
				}
				if (opcija == 6) {
					kor(broj1, broj2);
				
				}
			}

			private static int add(int broj1, int broj2) {
				return broj1 + broj2;
			}

			private static int sub(int broj1, int broj2) {
				return broj1 - broj2;
			}

			private static int mul (int broj1, int broj2) {
				return broj1 * broj2;
				
			}

			private static double div(int broj1, int broj2) {
				return broj1 / (double)(broj2);
				
			}

			public static int step(int number, int eksponent) {

				int result = 1;

				for (int i = 0; i < eksponent; i++) {
					result = result * number;
					
				}
				
				return result;
			
			}

			public static void kor(int broj1, int broj2) {

				double result_1 = Math.sqrt(broj1);
				double result_2 = Math.sqrt(broj2);
				
				System.out.println("korijen broja " + broj1 + " iznosi : " + result_1);
				System.out.println("korijen broja " + broj2 + " iznosi : " + result_2);

				
			}
		
}

