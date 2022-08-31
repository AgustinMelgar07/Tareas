public class CuentaCorriente {
    private  double saldo;
    private String nombreTirular;
    private  long numeroCuenta;

    private double total;
    public CuentaCorriente (String nombreTirular, double saldo, long numeroCuenta){
        this.nombreTirular=nombreTirular;
        this.saldo=saldo;
        this.numeroCuenta=numeroCuenta;
    }
    //Getters y  setters
    public void ingreso (double suma){
        saldo=saldo+suma;
    }
    public void  reintegro(double resta){
        saldo=saldo-resta;
    }

    public double getSaldo(){
        return saldo;
    }
    public  String getNombreTirular(){return nombreTirular;}

    public String toString(){
        return "Nombre del titular: "+ nombreTirular+", Saldo: "+saldo;
    }
    public void transferencia(CuentaCorriente cuenta,double monto){
        cuenta.saldo+=monto;
        this.saldo -=monto;
    }

}
