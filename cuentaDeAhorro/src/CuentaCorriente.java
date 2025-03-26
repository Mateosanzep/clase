public abstract class CuentaCorriente extends CuentaBancaria{

    private double limiteSobregiro;

    public CuentaCorriente(double saldo, String titular, double limiteSobregiro) {
        super(saldo, titular);
        this.limiteSobregiro = limiteSobregiro;
    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    
    
}
