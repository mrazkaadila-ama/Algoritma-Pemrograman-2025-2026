<?php
$tugas = readline("Masukkan niali tugas:");
$uts = readline("Masukkan nilai UTS:");
$uas = readline("Masukkan nilai UAS:");

$nilaiAkhir = (0.3 * $tugas) + (0.3 * $uts) + (0.4 * $uas);

echo "NilaiAkhir = $nilaiAkhir\n";
if ($nilaiAkhir >= 60)
    echo "Status: LULUS\n";
else
    echo "Status: TIDAK LULUS\n";
?>