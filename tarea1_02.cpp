#include <iostream>
using namespace std;

class producto {
    private:
        string nombre;
        float precio;
        int stock;

    public:
        producto(string _nombre, float _precio, int _stock){
            nombre = _nombre;
            precio = _precio;
            stock = _stock;
        }
        
        string getNombre(){
        	return nombre;
		}
		
		void setNombre(string _nombre){
			nombre = _nombre;
		}
		
		float getPrecio(){
        	return precio;
		}
		
		void setPrecio(float _precio){
			precio = _precio;
		}
		
		int getStock(){
        	return stock;
		}
		
		void setStock(int _stock){
			stock = _stock;
		}

        void vender(int cantidad){
            if (getStock()<cantidad){
                cout<<"No hay suficiente stock"<<endl;
            }else{
                int nuevaCantidad = getStock()-cantidad;
                setStock(nuevaCantidad);
            }
            
        }

        void info(){
            cout<<getNombre()<<endl<<getPrecio()<<endl<<getStock()<<endl;
        }
};

int main(){
    producto p1("Pan", 10.00, 10);
    p1.setNombre("Pan Integral");
    p1.vender(20);
    p1.vender(5);

    p1.info();
    return 0;
}