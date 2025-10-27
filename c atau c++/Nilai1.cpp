#include <iostream>
using namespace std;

int main() {
    float tugas, uts, uas, nilaiAkhir;
    cout <<"Masukkan nilai tugas:";
    cin >> tugas;
    cout <<"Masukkan nailai UTS:";
    cin >> uts;
    cout <<"Masukkan nilai UAS:";
    cin >> uas;

    nilaiAkhir = (0.3 * tugas) + (0.3 * uts) + (0.3 * uas);

    cout <<"Nilai Akhir = "<<nilaiAkhir<<endl;
    if(nilaiAkhir>=60)
        cout <<"Status:LULUS";
    else
        cout <<"Status:TIDAK LULUS";
}
