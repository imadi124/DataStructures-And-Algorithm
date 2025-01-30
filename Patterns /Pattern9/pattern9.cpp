#include <bits/stdc++.h>
using namespace std;


void pattern9(int n){
    //pattern 1 of traingle

    for (int i =0 ; i < n; i++){
        //spaces 
        for (int j =0 ; j< n-i-1  ; j++){
            cout << " ";
        }
        //stars
        for (int j =0 ; j< i*2 +1 ; j++ ){
            cout << "*";
        }

        //space 
        for (int j = 0 ; j< n-i-1 ; j++){
            cout << " ";
        }
        cout << endl;
    }

    //pattern 2 of  reverse traingle 
    for (int i = 0; i< n ; i++){
        //space 
        for (int j = 0 ; j < i ; j++){
            cout << " ";
        }

        //stars
        for (int j =0 ; j < (2*n) - (2*i)-1 ; j++){
            cout << "*";
        }

        //space 
        for (int j = 0 ; j < i ; j++){
            cout << " ";
        }  
        cout << endl;
    }
    
}
int main(){
    int n;
    cin >> n;
    pattern9(n);
}