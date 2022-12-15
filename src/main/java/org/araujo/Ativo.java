package org.araujo;

public abstract class Ativo {

    protected String ticker;
    protected String nome;
    protected String exchange;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public abstract String getTipo();

    public String getFullTicker() {
        return ticker + ":" + exchange;
    }

    public String getInfo() {
        return getTipo() + "{" +
                "ticker='" + this.getFullTicker() + '\'' +
                ", nome='" + this.nome + '\'' +
                '}';
    }
}
