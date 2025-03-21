public abstract class CuentaBancaria {

    private double saldo;
    private String titular;
    
    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double monto){
        setSaldo(getSaldo() + monto);
        System.out.println("Nueva cantidad: " + getSaldo());
    }

    public abstract void retirar(double monto);
    
}
