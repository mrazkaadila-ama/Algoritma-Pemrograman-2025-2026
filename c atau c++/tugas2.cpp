#include<iostream>
using namespace std;

int main(){
    const float PI=3.14159;
    float r;
    cout<<"Masukan jari-jari:";
    cin>>r;
    float luas=PI*r*r;
    cout<<"Luas lingkaran="<<luas;
    return 0;
}