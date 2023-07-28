package entities;

import java.util.Date;

public class ContratoDeHoras {

    private Date data;
    private Double valorPorHora;
    private Integer qtdHoras;

    public ContratoDeHoras() {
    }

    public ContratoDeHoras(Date date, Double valuePerHour, Integer hours) {
        this.data = date;
        this.valorPorHora = valuePerHour;
        this.qtdHoras = hours;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double valorTotal() {
        return valorPorHora * qtdHoras;
    }
}
