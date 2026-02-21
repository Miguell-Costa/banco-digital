package model;

import java.time.LocalDateTime;

public class Transacao {
    private TipoTransacao tipoTransacao;
    private double valor;
    private LocalDateTime dataHora;

    // construtor
    public Transacao(TipoTransacao tipoTransacao, double valor) {
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
    }

    // getters e setters
    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "tipoTransacao=" + tipoTransacao +
                ", valor=" + valor +
                ", dataHora=" + dataHora +
                '}';
    }
}
