public class CuentaAhorro extends CuentaBancaria{

    private double tasaInteres;

    public CuentaAhorro(double saldo, String titular, double tasaInteres) {
        super(saldo, titular);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void retirar(double monto) {
        // TODO Auto-generated method stub
        if (monto > getSaldo() ) {
            System.out.println("Saldo insuficiente");
        } else{
            setSaldo(getSaldo()-monto);
        }
    }

    public void aplicarInteres(){
        setSaldo(getTasaInteres()*getSaldo());
    }

    
}
