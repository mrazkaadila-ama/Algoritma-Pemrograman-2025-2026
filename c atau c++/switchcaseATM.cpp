#include <iostream>
#include <string>
using namespace std;

int main() {
    string nama, cek, nim;

    do {
        cout << "Masukkan Nama: ";
        getline(cin, nama);
        cout << "Apakah nama sudah benar? (true/false): ";
        getline(cin, cek);
    } while (cek != "true");

    do {
        cout << "Masukkan NIM (angka saja): ";
        getline(cin, nim);
    } while (nim.find_first_not_of("0123456789") != string::npos);

    long saldo = stol(nim);

    cout << "\n===== DATA NASABAH =====\n";
    cout << "Nama: " << nama << endl;
    cout << "Saldo Awal: Rp " << saldo << endl;

    int menu;
    while (true) {
        cout << "\n===== MENU ATM =====\n";
        cout << "1. Cek Saldo\n";
        cout << "2. Tarik Tunai\n";
        cout << "3. Setor Tunai\n";
        cout << "4. Transfer\n";
        cout << "5. Keluar\n";
        cout << "Pilih menu: ";
        cin >> menu;

        switch (menu) {
            case 1:
                cout << "Saldo Anda: Rp " << saldo << endl;
                break;

            case 2: {
                long tarik;
                cout << "Jumlah tarik tunai: ";
                cin >> tarik;
                if (tarik <= saldo) saldo -= tarik;
                else cout << "Saldo tidak cukup!\n";
                break;
            }

            case 3: {
                long setor;
                cout << "Jumlah setor tunai: ";
                cin >> setor;
                saldo += setor;
                break;
            }

            case 4: {
                long transfer;
                cout << "Jumlah transfer: ";
                cin >> transfer;
                if (transfer <= saldo) saldo -= transfer;
                else cout << "Saldo tidak cukup!\n";
                break;
            }

            case 5:
                cout << "Terima kasih telah menggunakan ATM!\n";
                return 0;

            default:
                cout << "Menu tidak tersedia!\n";
        }
    }
}
