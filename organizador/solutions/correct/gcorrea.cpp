#include <iostream>

using namespace std;

int main()
{
    int duracion_minutos, duracion_horas, duracion_segundos, canciones, minutos, segundos, total = 0, n = 0;
    cin >> duracion_horas >> duracion_minutos >> canciones;
    duracion_segundos =  duracion_horas*3600 + duracion_minutos*60;
    while( canciones-- ){
        cin >> minutos >> segundos;
        total = total + minutos*60+ segundos;
        if (total <= duracion_segundos ){
            n++;
        }
    }
    cout << n <<endl; 
	return 0;
}
