package br.com.zorp.contas;

public class ContaCorrente extends Conta {
  private double taxa = 10;

  public ContaCorrente(String titular, String agencia) {
    super(titular, agencia);
  }

  public void cobrarTaxa() {
    saldo -= taxa;
  }

  public void cobrarTaxa(double taxa) {
    if (taxa < 0) {
      throw new IllegalArgumentException("A taxa não pode ser negativa!");
    }
    this.saldo -= taxa;
  }

}
