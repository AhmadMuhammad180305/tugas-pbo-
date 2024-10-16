import java.util.Scanner;

public class ZakatMaal {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah harta
        System.out.print("Masukkan jumlah harta yang dimiliki (dalam angka desimal): ");
        double harta = scanner.nextDouble();

        // Menghitung zakat maal sebesar 2.5%
        double zakat = harta * 2.5 / 100;

        // Menampilkan jumlah zakat yang harus dibayarkan
        System.out.printf("Jumlah zakat yang harus dibayarkan: Rp %.2f\n", zakat);

        // Menutup scanner
        scanner.close();
    }
}
