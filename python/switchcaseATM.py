# ===== Program ATM Python =====

while True:
    nama = input("Masukkan Nama: ")
    cek = input("Apakah nama sudah benar? (true/false): ")
    if cek.lower() == "true":
        break

while True:
    nim = input("Masukkan NIM (angka saja): ")
    if nim.isdigit():
        break

saldo = int(nim)

print("\n===== DATA NASABAH =====")
print(f"Nama: {nama}")
print(f"Saldo Awal: Rp {saldo:,}".replace(",", "."))

while True:
    print("\n===== MENU ATM =====")
    print("1. Cek Saldo")
    print("2. Tarik Tunai")
    print("3. Setor Tunai")
    print("4. Transfer")
    print("5. Keluar")

    menu = input("Pilih menu: ")

    match menu:
        case "1":
            print(f"Saldo Anda: Rp {saldo:,}".replace(",", "."))

        case "2":
            tarik = int(input("Jumlah tarik tunai: "))
            if tarik <= saldo:
                saldo -= tarik
                print("Penarikan berhasil!")
            else:
                print("Saldo tidak cukup!")

        case "3":
            setor = int(input("Jumlah setor tunai: "))
            saldo += setor
            print("Setor tunai berhasil!")

        case "4":
            transfer = int(input("Jumlah transfer: "))
            if transfer <= saldo:
                saldo -= transfer
                print("Transfer berhasil!")
            else:
                print("Saldo tidak cukup!")

        case "5":
            print("Terima kasih telah menggunakan ATM!")
            break

        case _:
            print("Menu tidak tersedia!")
