#include <iostream>
using namespace std;

class cuentaBancaria {
    private:
        string titular;
        float saldo;
        string moneda;

    public:
        cuentaBancaria(string _titular, float _saldo, string _moneda){
            titular = _titular;
            saldo = _saldo;
            moneda = _moneda;
        }
        
        string getTitular(){
        	return titular;
		}
		
		void setTitular(string _titular){
			titular = _titular;
		}
		
		float getSaldo(){
        	return saldo;
		}
		
		void setSaldo(float _saldo){
			saldo = _saldo;
		}
		
		string getMoneda(){
        	return moneda;
		}
		
		void setMoneda(string _moneda){
			moneda = _moneda;
		}

        void depositar (float deposito){
            float nuevoDinero = getSaldo() + deposito;
            setSaldo(nuevoDinero);
        }

        void retirar (float retiro){
            if (getSaldo() < retiro){
                cout<<"No hay fondos"<<endl;
            }else{
                float nuevoDinero = getSaldo() - retiro;
                setSaldo(nuevoDinero);
            }
            
        }

        void info(){
            cout<<getTitular()<<endl<<getSaldo()<<endl<<getMoneda()<<endl;
        }
};

int main(){
    cuentaBancaria cb1("Mateo", 1000.00, "MXN");
    cb1.setTitular("Mateo Sanchez");
    cb1.depositar(200.00);
    cb1.retirar(2000.00);
    cb1.retirar(100.00);

    cb1.info();
    return 0;
}