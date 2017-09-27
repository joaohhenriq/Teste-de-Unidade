package br.com.ufg.leilao.servico;
import br.com.ufg.leilao.testeDeUnidade.Lance;
import br.com.ufg.leilao.testeDeUnidade.Leilao;

public class Avaliador {

	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;

	public void avalia(Leilao leilao){
		for (Lance lance : leilao.getLances()){
			if (lance.getValor() > maiorDeTodos) maiorDeTodos  = lance.getValor();
			if (lance.getValor() < menorDeTodos) menorDeTodos = lance.getValor();
		}
	}
	
	public double getMaiorLance() {
		return maiorDeTodos;
	}
	
	public double getMenorDeLance() {
		return menorDeTodos;
	}
}
