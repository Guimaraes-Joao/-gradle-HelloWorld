package guimaraes.joao.grandle;

/**
 * @Author João Pedro Guimaraes
 * @Version 0.1
 */

public interface Conta {

    public void depositar(double valor);
    public void sacar(double valor);
    public double getSaldo();

}
