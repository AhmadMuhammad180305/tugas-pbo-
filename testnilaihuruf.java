import java.util.Scanner;
public class TestNilaiHuruf{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai angka: ");
		int angka = input.nextInt();

        //jika nilai lebih dari 90 maka A
		if(angka > 90 && angka <=100)
		{
			System.out.println("A = sangat baik");
			}
        
        //jika nilai lebih dari 80 maka A-
			else if(angka >= 80 && angka <= 89)
			{
				System.out.println("A-");
			}

        //jika nilai lebih dari 70 maka B
			else if(angka >= 70 && angka <= 79)
			{
				System.out.println("B");
			}

        //jika nilai lebih dari 65 maka b-
				else if(angka >= 65 && angka <= 69)
			{
				System.out.println("B-");
			}

        //jika nilai lebih dari 56 maka C
		else if(angka >= 56 && angka <= 64)
			{
				System.out.println("C");
			}

        //jika nilai lebih dari 40 maka D
        		else if(angka >= 40 && angka <= 55)
			{
				System.out.println("D");
			}
        //jika nilai lebih dari 0 maka E
        else if(angka >= 0 && angka <= 39)
        {
            System.out.println("E");
        }
			
		}
	} 