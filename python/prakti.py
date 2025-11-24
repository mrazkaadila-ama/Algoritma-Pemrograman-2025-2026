# Program Struk Pembelian

nama = input("Masukkan nama barang: ")
harga = float(input("Masukkan harga barang: "))
jumlah = int(input("Masukkan jumlah beli: "))

total = harga * jumlah

if total > 100000:
    diskon = total * 0.10
else:
    diskon = 0

total_bayar = total - diskon

print("\n===== STRUK PEMBELIAN =====")
print(f"Nama Barang   : {nama}")
print(f"Harga Satuan  : {harga}")
print(f"Jumlah Beli   : {jumlah}")
print(f"Total Harga   : {total}")
print(f"Diskon        : {diskon}")
print(f"Total Bayar   : {total_bayar}")
print("============================")

