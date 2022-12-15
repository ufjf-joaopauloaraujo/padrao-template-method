package org.araujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtivoAcaoTest {

    @Test
    void deveRetornarFullTicker() {
        AtivoAcao acao = new AtivoAcao();
        acao.setTicker("BBAS3");
        acao.setNome("Banco do Brasil");
        acao.setExchange("SAO");
        assertEquals("BBAS3:SAO", acao.getFullTicker());
    }

    @Test
    void deveRetornarFullTickerFracionado() {
        AtivoAcao acao = new AtivoAcao();
        acao.setTicker("BBAS3");
        acao.setNome("Banco do Brasil");
        acao.setExchange("SAO");
        acao.setFracionado(true);
        assertEquals("BBAS3F:SAO", acao.getFullTicker());
    }

    @Test
    void deveRetornarInformacoes() {
        AtivoAcao acao = new AtivoAcao();
        acao.setTicker("BBAS3");
        acao.setNome("Banco do Brasil");
        acao.setExchange("SAO");

        assertEquals("Ação{ticker='BBAS3:SAO', nome='Banco do Brasil'}", acao.getInfo());
    }

    @Test
    void deveRetornarInformacoesFracionado() {
        AtivoAcao acao = new AtivoAcao();
        acao.setTicker("BBAS3");
        acao.setNome("Banco do Brasil");
        acao.setExchange("SAO");
        acao.setFracionado(true);

        assertEquals("Ação{ticker='BBAS3F:SAO', nome='Banco do Brasil'}", acao.getInfo());
    }
}