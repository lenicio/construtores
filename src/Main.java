import br.com.zorp.contas.ContaCorrente;
import br.com.zorp.contas.ContaPoupanca;

import java.util.Scanner;

class Main {
  // Esta é uma alteração 2
  public static void main(String[] args) {
    ContaCorrente conta = new ContaCorrente("Lenício Jr", "0036");
    conta.depositar(100.00);
    conta.cobrarTaxa(20);
    conta.sacar(10.00);
    conta.mostrarDados();

    ContaPoupanca contaP = new ContaPoupanca("Lenício Jr", "0036");
    contaP.depositar(100.00);
    contaP.calcularJuros(0.1);
    contaP.sacar(10000.00);
    contaP.mostrarDados();



  }
}