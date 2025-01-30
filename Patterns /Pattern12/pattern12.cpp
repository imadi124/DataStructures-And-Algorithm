#include <bits/stdc++.h>
using namespace std;

void pattern12(int n){
    for (int i =1 ; i<=4 ; i++){
        //numbers 
        for (int j= 1 ; j <=i ; j++){
            cout << j;
        }
        //spaces 
        for (int j =1 ; j<= (2*n)-(2*i) ; j++){
            cout << " ";

        }

        //numbers 
        for (int j= i ; j >=1 ; j--){
            cout << j;
        }

        cout << endl;
    }
}
int main(){
    int n;
    cin >> n;
    pattern12(n);
}