#include <iostream>
using namespace std;

    class Persona{
        private:
        string nombre;
        int edad;
        float altura;

        public:
        Persona(string _nombre, int _edad, float _altura){
            nombre = _nombre;
            edad = _edad;
            altura = _altura;
        }
        void caminar (int numPasos){
            cout<<nombre<<" camina "<<numPasos<<" numPasos"<<endl;
        }
        void crecer (){
            edad++;
            cout<<"Edad actual: "<<edad<<endl;
        }
        
    };

int main()
{
    Persona p1("Juan", 20, 1.78);
    p1.caminar(10);
    p1.crecer();

    return 0;
    
}
