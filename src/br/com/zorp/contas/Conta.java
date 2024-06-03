package br.com.zorp.contas;

import java.util.Random;

public abstract class Conta {
  protected String titular, agencia, conta;
  protected double saldo;


  public Conta(String titular, String agencia) {
    if (titular.isEmpty()) {
      throw new IllegalArgumentException("O campo titular é obrigatório!");
    }

    if (agencia.isEmpty()) {
      throw new IllegalArgumentException("O campo agencia é obrigatório!");
    }

    Random random = new Random();

    this.titular = titular;
    this.agencia = agencia;
    this.conta = Integer.toString(random.nextInt(10000, 99999));
  }

  public void mostrarDados() {
    System.out.printf("""
        *****************************************
        Titular: %s
        Agencia: %s
        Conta: %s
        Saldo: %.2f
        *****************************************
        """, titular, agencia, conta, saldo);
  }

  public void sacar(Double valor) {
    if (valor <= 0) {
      throw new IllegalArgumentException("Valor inválido para saque!");
    }

    if (valor > saldo) {
      throw new IllegalArgumentException("Saque inválido, saldo insuficiente!");
    }

    this.saldo -= valor;
  }

  public void depositar(Double valor) {
    if (valor < 0) {
      throw new IllegalArgumentException("O valor não pode ser igual ou menor a 0!");
    }

    this.saldo += valor;
  }


  public double getSaldo() {
    return saldo;
  }


  public String getTitular() {
    return titular;
  }


  public void setTitular(String titular) {
    this.titular = titular;
  }


  public String getAgencia() {
    return agencia;
  }


  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }


  public String getConta() {
    return conta;
  }
}
