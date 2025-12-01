<?php
// ===== Program ATM PHP =====

do {
    echo "Masukkan Nama: ";
    $nama = trim(fgets(STDIN));

    echo "Apakah nama sudah benar? (true/false): ";
    $cek = trim(fgets(STDIN));
} while ($cek !== "true");

do {
    echo "Masukkan NIM (angka saja): ";
    $nim = trim(fgets(STDIN));
} while (!ctype_digit($nim));

$saldo = (int)$nim;

echo "\n===== DATA NASABAH =====\n";
echo "Nama: $nama\n";
echo "Saldo Awal: Rp " . number_format($saldo, 0, ',', '.') . "\n\n";

while (true) {
    echo "===== MENU ATM =====\n";
    echo "1. Cek Saldo\n";
    echo "2. Tarik Tunai\n";
    echo "3. Setor Tunai\n";
    echo "4. Transfer\n";
    echo "5. Keluar\n";
    echo "Pilih menu: ";
    $menu = trim(fgets(STDIN));

    switch ($menu) {
        case 1:
            echo "Saldo Anda: Rp " . number_format($saldo, 0, ',', '.') . "\n\n";
            break;

        case 2:
            echo "Masukkan jumlah tarik tunai: ";
            $tarik = trim(fgets(STDIN));
            if ($tarik <= $saldo) {
                $saldo -= $tarik;
                echo "Penarikan berhasil!\n";
            } else {
                echo "Saldo tidak cukup!\n";
            }
            break;

        case 3:
            echo "Masukkan jumlah setor tunai: ";
            $setor = trim(fgets(STDIN));
            $saldo += $setor;
            echo "Setor tunai berhasil!\n";
            break;

        case 4:
            echo "Masukkan jumlah transfer: ";
            $transfer = trim(fgets(STDIN));
            if ($transfer <= $saldo) {
                $saldo -= $transfer;
                echo "Transfer berhasil!\n";
            } else {
                echo "Saldo tidak cukup!\n";
            }
            break;

        case 5:
            echo "Terima kasih telah menggunakan ATM!\n";
            exit;

        default:
            echo "Menu tidak tersedia!\n";
    }
}
?>
