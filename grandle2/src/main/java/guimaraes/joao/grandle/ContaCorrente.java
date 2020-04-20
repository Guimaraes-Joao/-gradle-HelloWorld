package guimaraes.joao.grandle;

/**
 * @Author João Pedro Guimaraes
 * @Version 0.1
 */

public class ContaCorrente {

    public double saldo;

    /**
     *
     * @return Method used to discount the rate
     */
    public double taxa(){
        return  0.55;
    }

    /**
     *
     * @return Calculate the balance amount after deposit
     */
    public void depositar(double valor){
        this.saldo = this.saldo + valor - taxa();
    }

    /**
     *
     * @return Calculate the balance amount after withdrawal
     */
    public void sacar(double valor){
        this.saldo = this.saldo -  valor - taxa();
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String toString(){
        return "\n saldo: R$ " + this.getSaldo();
    }

}


