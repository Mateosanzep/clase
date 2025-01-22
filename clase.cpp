#include <iostream>
using namespace std;

void masDos(double &n1, double &n2){
	double aux;
	aux = n1;
	n1 = n2;
	n2 = aux;
}

int main(){
	double numero = 10, numero2 = 100;
	
	double* pnt_numero = &numero;
	
	masDos(numero, numero2);
	cout<<numero<<numero2;
	return 0;
}