package org.araujo;

public class AtivoAcao extends Ativo {

    private boolean fracionado = false;

    public boolean isFracionado() {
        return fracionado;
    }

    public void setFracionado(boolean fracionado) {
        this.fracionado = fracionado;
    }

    @Override
    public String getFullTicker() {
        String ft = ticker;
        ft += (fracionado) ? "F" : "";
        ft += ":" + exchange;
        return ft;
    }

    @Override
    public String getTipo() {
        return "Ação";
    }
}
