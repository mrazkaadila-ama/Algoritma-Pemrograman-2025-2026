tugas = float(input("Masukkan nilai tugas:"))
uts = float(input("Masukkan nilai UTS:"))
uas = float(input("Masukkan nilai uas"))

nilai_akhir = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas)

print("Nilai Akhir =", nilai_akhir)
if nilai_akhir >=60:
    print("Status: LULUS")
else
    print("Status: TIDAK LULUS")