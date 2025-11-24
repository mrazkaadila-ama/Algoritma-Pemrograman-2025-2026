<?php

// Input
echo "Masukkan nama barang: ";
$nama = trim(fgets(STDIN));

echo "Masukkan harga barang: ";
$harga = floatval(trim(fgets(STDIN)));

echo "Masukkan jumlah beli: ";
$jumlah = intval(trim(fgets(STDIN)));

// Proses
$total = $harga * $jumlah;

if ($total > 431000) {
    $diskon = $total * 0.1;
} else {
    $diskon = 0;
}

$total_bayar = $total - $diskon;

// Output
echo "\n====== STRUK PEMBELIAN ======\n";
echo "Nama Barang   : $nama\n";
echo "Harga Satuan  : $harga\n";
echo "Jumlah Beli   : $jumlah\n";
echo "Total Harga   : $total\n";
echo "Diskon        : $diskon\n";
echo "Total Bayar   : $total_bayar\n";
echo "==============================\n";

?>
