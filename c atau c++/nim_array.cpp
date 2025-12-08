#include <iostream>
#include <vector>
using namespace std;

int main() {
    string nim;
    cout << "Masukkan NIM: ";
    cin >> nim;

    vector<int> digits;

    // Pisahkan digit
    for(char c : nim) {
        digits.push_back(c - '0');
    }

    // Hitung total, max, min
    int total = 0;
    int maks = digits[0], minim = digits[0];

    for(int d : digits) {
        total += d;
        if(d > maks) maks = d;
        if(d < minim) minim = d;
    }

    float rata = (float)total / digits.size();

    // Reverse array
    vector<int> reverse_digits(digits.rbegin(), digits.rend());

    cout << "Array digit: ";
    for(int d : digits) cout << d << " ";
    cout << endl;

    cout << "Total digit: " << total << endl;
    cout << "Digit maksimum: " << maks << endl;
    cout << "Digit minimum: " << minim << endl;
    cout << "Rata-rata digit: " << rata << endl;

    cout << "Reverse array: ";
    for(int d : reverse_digits) cout << d << " ";
    cout << endl;

    return 0;
}
