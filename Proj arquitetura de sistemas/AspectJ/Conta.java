public class Conta {

    private String numero;
    private double saldo = 0.0;
    
    public Conta(String numero){
        this.numero = numero;
    }
    
    public void creditar (double valor){
    System.out.println("Vai creditar");
    saldo += valor;
    
    System.out.println("Creditou");
    }
    
    public void debitar (double valor){
    System.out.println("Vai debitar");
    
    saldo -= valor;
    System.out.println("Debitou");
    
    }
    
    public String getNumero() {
        return numero;
    }
    
    public double getSaldo() {
    return saldo;
    
    }
    
    public static void main (String[] args){
    
    //conta 123
    
    Conta c1 = new Conta("123");
    c1.creditar(100);
    
    c1.creditar(50);
    c1.debitar(30);
    
    System.out.println("Saldo conta " + c1.getNumero() + " valor: "+ c1.getSaldo());
    
    //conta 456
    
    Conta c2 = new Conta("456");
    c2.creditar(255.50);
    c2.debitar(55.25);
    
    System.out.println("Saldo conta " + c2.getNumero() + " valor: "+ c2.getSaldo());
    
    }
    
    
}
     
    