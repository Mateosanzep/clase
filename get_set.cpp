// metodos get: son diseñados para acceder a los valores de los atributos de cada clase
// metodos set: son diseñados para establecer el valor a los atributos de cada clase

// cada atributo debe de tener get y set para tener control completo del objeto

#include <iostream>
using namespace std;

class persona {
    private:
        string nombre;
        int edad;
        float altura;

    public:
        persona(string _nombre, int _edad, float _altura){
            nombre = _nombre;
            edad = _edad;
            altura = _altura;
        }
        
        string getNombre(){
        	return nombre;
		}
		
		void setNombre(string _nombre){
			nombre = _nombre;
		}
		
		int getEdad(){
        	return edad;
		}
		
		void setEdad(int _edad){
			edad = _edad;
		}
		
		float getAltura(){
        	return altura;
		}
		
		void setAltura(float _altura){
			altura = _altura;
		}
		
		void crecer(){
			setEdad(getEdad() + 1);
		}

        void info(){
            cout<<getNombre()<<endl<<getEdad()<<endl<<getAltura()<<endl;
        }
};

int main(){
    
    persona p1("Juan", 18, 1.72);
    p1.info();
    cout<<p1.getNombre()<<endl;
    p1.setNombre("pepe");
    p1.crecer();
    p1.info();
    
    
    return 0;
}