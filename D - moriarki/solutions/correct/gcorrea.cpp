#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int N, x, acumulado_multiplicacion = 1, total = 0, limite;
    vector <int> multiplicaciones;
    cin >> N;
    limite = ((2*N)-1);
    for(int i = 0; i < limite ; i++ ){
        cin >> x;
        if (x == 0 && i%2!=0){
            multiplicaciones.push_back(acumulado_multiplicacion);
            acumulado_multiplicacion = 1;
        }else if (i%2==0){
            acumulado_multiplicacion = acumulado_multiplicacion * x;
        }
        if (i+1 == limite){
            multiplicaciones.push_back(acumulado_multiplicacion);
        }
    }

    for(int i = 0; i < multiplicaciones.size() ; i++){
        total = total + multiplicaciones[i];
    }
    cout << total << endl;
	return 0;
}
