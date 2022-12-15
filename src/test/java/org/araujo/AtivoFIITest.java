package org.araujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtivoFIITest {

    @Test
    void deveRetornarFullTicker() {
        AtivoFII fii = new AtivoFII();
        fii.setTicker("KNRI11");
        fii.setNome("Kinea FII");
        fii.setExchange("SAO");
        assertEquals("KNRI11:SAO", fii.getFullTicker());
    }

    @Test
    void deveRetornarInformacoes() {
        AtivoFII fii = new AtivoFII();
        fii.setTicker("KNRI11");
        fii.setNome("Kinea FII");
        fii.setExchange("SAO");

        assertEquals("FII{ticker='KNRI11:SAO', nome='Kinea FII'}", fii.getInfo());
    }
}