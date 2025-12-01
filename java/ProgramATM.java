
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ProgramATM {

    // Fungsi untuk memformat saldo dalam Rupiah
    public static String formatSaldo(double angka) {
        // Mengatur format agar menggunakan titik sebagai pemisah ribuan
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');

        DecimalFormat formatter = new DecimalFormat("#,###", symbols);
        return "Rp " + formatter.format(angka);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaPengguna = "";
        boolean namaBenar = false;
        long saldo = 0; // Menggunakan long agar bisa menampung nilai NIM yang besar

        // === BAGIAN 1: VERIFIKASI NAMA ===
        while (!namaBenar) {
            System.out.print("Masukkan Nama Anda: ");
            String inputNama = scanner.nextLine().trim();

            if (!inputNama.isEmpty()) {
                namaPengguna = inputNama;
                namaBenar = true; // TRUE
                System.out.println("Nama berhasil diverifikasi (TRUE).");
            } else {
                System.out.println("Nama tidak boleh kosong (FALSE). Mohon masukkan kembali.");
            }
        }

        // === BAGIAN 2: INPUT NIM & KONVERSI SALDO ===
        boolean nimValid = false;
        String nim = "";

        while (!nimValid) {
            System.out.print("Masukkan NIM Anda (hanya angka, misal: 2310355): ");
            nim = scanner.nextLine().trim();

            // Validasi NIM: Hanya angka
            if (nim.matches("\\d+")) { // Regex untuk memastikan hanya angka
                nimValid = true;
            } else {
                System.out.println("NIM harus berupa angka. Mohon masukkan kembali.");
            }
        }

        // Konversi NIM menjadi Saldo
        try {
            saldo = Long.parseLong(nim);
        } catch (NumberFormatException e) {
            // Ini seharusnya tidak terjadi karena sudah divalidasi, tapi untuk keamanan
            System.out.println("Error konversi NIM. Saldo diatur ke 0.");
            saldo = 0;
        }

        // === BAGIAN 3: TAMPILKAN INFO AWAL ===
        String saldoTampil = formatSaldo(saldo);
        System.out.println("\n==================================");
        System.out.println("Halo, **" + namaPengguna + "**!");
        System.out.println("Saldo Awal Anda: **" + saldoTampil + "**");
        System.out.println("==================================");

        // === BAGIAN 4: MENU ATM (SWITCH-CASE) ===
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Transfer");
            System.out.println("5. Keluar");
            System.out.println("====================");

            System.out.print("Pilih Menu (1-5): ");
            String pilihanString = scanner.nextLine().trim();
            int pilihan;

            try {
                pilihan = Integer.parseInt(pilihanString);
            } catch (NumberFormatException e) {
                pilihan = 0; // Menandakan pilihan tidak valid
            }

            switch (pilihan) {
                case 1:
                    // Cek Saldo
                    String saldoTampilCek = formatSaldo(saldo);
                    System.out.println("\n**[1. Cek Saldo]**");
                    System.out.println("Saldo Anda saat ini adalah: **" + saldoTampilCek + "**");
                    break;

                case 2:
                    // Tarik Tunai
                    System.out.println("\n**[2. Tarik Tunai]**");
                    System.out.print("Masukkan jumlah penarikan: Rp ");
                    long tarik;
                    try {
                        tarik = Long.parseLong(scanner.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Jumlah penarikan tidak valid.");
                        break;
                    }

                    if (tarik > 0 && tarik <= saldo) {
                        saldo -= tarik;
                        String tarikTampil = formatSaldo(tarik);
                        String saldoTampilBaru = formatSaldo(saldo);
                        System.out.println("Penarikan **" + tarikTampil + "** berhasil.");
                        System.out.println("Sisa saldo Anda: **" + saldoTampilBaru + "**");
                    } else if (tarik > saldo) {
                        System.out.println("Maaf, saldo tidak mencukupi.");
                    } else {
                        System.out.println("Jumlah penarikan tidak valid.");
                    }
                    break;

                case 3:
                    // Setor Tunai
                    System.out.println("\n**[3. Setor Tunai]**");
                    System.out.print("Masukkan jumlah setoran: Rp ");
                    long setor;
                    try {
                        setor = Long.parseLong(scanner.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Jumlah setoran tidak valid.");
                        break;
                    }

                    if (setor > 0) {
                        saldo += setor;
                        String setorTampil = formatSaldo(setor);
                        String saldoTampilBaru = formatSaldo(saldo);
                        System.out.println("Setoran **" + setorTampil + "** berhasil.");
                        System.out.println("Saldo Anda saat ini: **" + saldoTampilBaru + "**");
                    } else {
                        System.out.println("Jumlah setoran harus lebih dari nol.");
                    }
                    break;

                case 4:
                    // Transfer
                    System.out.println("\n**[4. Transfer]**");
                    System.out.print("Masukkan jumlah transfer: Rp ");
                    long transfer;
                    try {
                        transfer = Long.parseLong(scanner.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Jumlah transfer tidak valid.");
                        break;
                    }
                    System.out.print("Masukkan nomor rekening tujuan: ");
                    String rekeningTujuan = scanner.nextLine().trim();

                    if (transfer > 0 && transfer <= saldo) {
                        saldo -= transfer;
                        String transferTampil = formatSaldo(transfer);
                        String saldoTampilBaru = formatSaldo(saldo);
                        System.out.println("Transfer **" + transferTampil + "** ke rekening **" + rekeningTujuan + "** berhasil.");
                        System.out.println("Sisa saldo Anda: **" + saldoTampilBaru + "**");
                    } else if (transfer > saldo) {
                        System.out.println("Maaf, saldo tidak mencukupi untuk transfer.");
                    } else {
                        System.out.println("Jumlah transfer tidak valid.");
                    }
                    break;

                case 5:
                    // Keluar
                    System.out.println("\nTerima kasih, **" + namaPengguna + "**, telah menggunakan layanan ATM kami.");
                    lanjut = false;
                    break;

                default:
                    // Default/Pilihan tidak valid
                    System.out.println("\nPilihan menu tidak valid. Mohon masukkan angka 1 sampai 5.");
                    break;
            }
        }
        scanner.close();
    }
}
