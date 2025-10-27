# ========================================
#     MENGHITUNG NILAI AKHIR
# ========================================

# Fungsi untuk menghitung nilai akhir
def hitung_nilai_akhir(kehadiran, forum, tugas_individu, tugas_kelompok, uts, uas, project):
    # Bobot setiap komponen nilai
    bobot_kehadiran = 0.10
    bobot_forum = 0.10
    bobot_tugas_individu = 0.10
    bobot_tugas_kelompok = 0.10
    bobot_uts = 0.20
    bobot_uas = 0.20
    bobot_project = 0.20

    # Rumus nilai akhir (rata-rata tertimbang)
    nilai_akhir = (
        kehadiran * bobot_kehadiran +
        forum * bobot_forum +
        tugas_individu * bobot_tugas_individu +
        tugas_kelompok * bobot_tugas_kelompok +
        uts * bobot_uts +
        uas * bobot_uas +
        project * bobot_project
    )
    return nilai_akhir


# Fungsi untuk menentukan huruf mutu
def tentukan_huruf_mutu(nilai_akhir):
    if nilai_akhir >= 85:
        return "A"
    elif nilai_akhir >= 75:
        return "B"
    elif nilai_akhir >= 65:
        return "C"
    elif nilai_akhir >= 55:
        return "D"
    else:
        return "E"


# ==============================
# Input data mahasiswa
# ==============================
print("========================================")
print("        MENGHITUNG NILAI AKHIR")
print("========================================")

nim = input("Masukkan NIM   : ")
nama = input("Masukkan Nama  : ")

print("\nMasukkan Nilai Anda:")
nilai_kehadiran = float(input("Nilai Kehadiran     : "))
nilai_forum = float(input("Nilai Forum         : "))
nilai_tugas_individu = float(input("Nilai Tugas Individu: "))
nilai_tugas_kelompok = float(input("Nilai Tugas Kelompok: "))
nilai_uts = float(input("Nilai UTS           : "))
nilai_uas = float(input("Nilai UAS           : "))
nilai_project = float(input("Nilai Project       : "))

# ==============================
# Proses perhitungan
# ==============================
nilai_akhir = hitung_nilai_akhir(
    nilai_kehadiran, nilai_forum,
    nilai_tugas_individu, nilai_tugas_kelompok,
    nilai_uts, nilai_uas, nilai_project
)

huruf_mutu = tentukan_huruf_mutu(nilai_akhir)

# ==============================
# Output hasil
# ==============================
print("\n========================================")
print(f"[ {nim} {nama} ]")
print(f"NILAI AKHIR : {round(nilai_akhir)}")
print(f"HURUF MUTU  : {huruf_mutu}")
print("========================================")
