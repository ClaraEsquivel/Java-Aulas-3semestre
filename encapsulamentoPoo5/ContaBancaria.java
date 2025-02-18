package encapsulamentoPoo5;

public class ContaBancaria {
    private String banco;
    private String agencia;
    private String numeroConta;
    private String tipoConta;
    private String saldoAtual;
    private String limiteDisponivel;


    public ContaBancaria() {
    }

    public ContaBancaria(String banco, String agencia, String numeroConta, String tipoConta, String saldoAtual,
            String limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }


    public String getBanco() {
        return banco;
    }


    public void setBanco(String banco) {
        this.banco = banco;
    }


    public String getAgencia() {
        return agencia;
    }


    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public String getNumeroConta() {
        return numeroConta;
    }


    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }


    public String getTipoConta() {
        return tipoConta;
    }


    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }


    public String getSaldoAtual() {
        return saldoAtual;
    }


    public void setSaldoAtual(String saldoAtual) {
        this.saldoAtual = saldoAtual;
    }


    public String getLimiteDisponivel() {
        return limiteDisponivel;
    }


    public void setLimiteDisponivel(String limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "\nBanco: " + banco + 
        "\nAgência: " + agencia + 
        "\nNúmero Conta: " + numeroConta+
        "\nTipo da Conta: " + tipoConta + 
        "\nSaldo Atual: " + saldoAtual + 
        "\nLimite Disponível: " + limiteDisponivel;
    }

    
    

    
}
