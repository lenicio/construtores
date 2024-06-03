package br.com.zorp.contas;

public class ContaPoupanca extends Conta{

  double juros = 0.01;

  public ContaPoupanca(String titular, String agencia) {
    super(titular, agencia);
  }

  public void calcularJuros() {
    this.saldo += this.saldo * juros;
  }

  public void calcularJuros(double taxa) {
    if (taxa < 0) {
      throw new IllegalArgumentException("A taxa não pode ser negativa!");
    }

    this.saldo += this.saldo * taxa;
  }




}
