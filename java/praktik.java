import java.util.Scanner;

public class StrukPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        double harga;
        int jumlah;

        System.out.print("Masukkan nama barang : ");
        nama = input.nextLine();

        System.out.print("Masukkan harga barang: ");
        harga = input.nextDouble();

        System.out.print("Masukkan jumlah beli : ");
        jumlah = input.nextInt();

        double total = harga * jumlah;
        double diskon;

        if (total > 431000) {
            diskon = total * 0.1; // 10% diskon
        } else {
            diskon = 0;
        }

        double total_bayar = total - diskon;

        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Nama Barang   : " + nama);
        System.out.println("Harga Satuan  : " + harga);
        System.out.println("Jumlah Beli   : " + jumlah);
        System.out.println("Total Harga   : " + total);
        System.out.println("Diskon        : " + diskon);
        System.out.println("Total Bayar   : " + total_bayar);
        System.out.println("============================");
    }
}
