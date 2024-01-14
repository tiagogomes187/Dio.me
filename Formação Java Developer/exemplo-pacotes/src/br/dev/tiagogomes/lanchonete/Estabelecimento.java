package br.dev.tiagogomes.lanchonete;

import br.dev.tiagogomes.lanchonete.area.cliente.Cliente;
import br.dev.tiagogomes.lanchonete.atendimento.Atendente;
import br.dev.tiagogomes.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		System.out.println("----| Início: Ações do Cozinheiro |----");
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		System.out.println("----| Fim: Ações do Cozinheiro |----");

		Atendente atendente = new Atendente();
		System.out.println("----| Início: Ações do Atendente |----");
		atendente.servindoMesa();
		atendente.receberPagamento();
		System.out.println("----| Fim: Ações do Atendente |----");

		Cliente cliente = new Cliente();
		System.out.println("----| Início: Ações do Cliente |----");
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();

		System.out.println("----| Início: Ações do Cliente |----");

	}
}