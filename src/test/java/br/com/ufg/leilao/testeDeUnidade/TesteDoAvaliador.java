package br.com.ufg.leilao.testeDeUnidade;

import org.junit.Assert;
import org.junit.Test;

import br.com.ufg.leilao.servico.Avaliador;
import br.com.ufg.leilao.testeDeUnidade.Lance;
import br.com.ufg.leilao.testeDeUnidade.Leilao;
import br.com.ufg.leilao.testeDeUnidade.Usuario;

public class TesteDoAvaliador {

	@Test
	public void main() {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("Notebook HP");
		
		leilao.propoe(new Lance(joao, 250.0));
		leilao.propoe(new Lance(jose, 300.0));
		leilao.propoe(new Lance(maria, 400.0));
		
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		double maiorEsperado = 400;
		double menorEsperado = 250;
		
		
		Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
		Assert.assertEquals(menorEsperado, leiloeiro.getMenorDeLance(), 0.00001);
	
	}
}
