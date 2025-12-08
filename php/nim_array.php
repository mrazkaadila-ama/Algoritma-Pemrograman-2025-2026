<?php
$nim = readline("Masukkan NIM: ");

$digits = [];

// Pisahkan digit
for ($i = 0; $i < strlen($nim); $i++) {
    $digits[] = intval($nim[$i]);
}

$total = array_sum($digits);
$maks  = max($digits);
$minim = min($digits);
$rata  = $total / count($digits);

// Reverse array
$reverse = array_reverse($digits);

echo "Array digit: ";
print_r($digits);

echo "Total digit: $total\n";
echo "Digit maksimum: $maks\n";
echo "Digit minimum: $minim\n";
echo "Rata-rata digit: $rata\n";

echo "Reverse array: ";
print_r($reverse);
?>
