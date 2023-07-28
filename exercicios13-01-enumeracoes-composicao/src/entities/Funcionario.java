package entities;

import entities.enums.NivelFuncionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario {

    private String nome;
    private NivelFuncionario nivel;
    private Double salarioBase;
    private Departamento departamento;
    private List<ContratoDeHoras> contratos = new ArrayList<>();

    public Funcionario() {
    }

    public Funcionario(String nome, NivelFuncionario nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelFuncionario getNivel() {
        return nivel;
    }

    public void setNivel(NivelFuncionario nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoDeHoras> getContratos() {
        return contratos;
    }

    public void adicionaContrato(ContratoDeHoras contract) {
        contratos.add(contract);
    }

    public void removeContrato(ContratoDeHoras contract) {
        contratos.remove(contract);
    }

    // salário base + os valores dos contratos de um mês
    public double renda(int mesDiditado, int anoDigitado) throws ParseException {
        double total = salarioBase;

        SimpleDateFormat formato = new SimpleDateFormat("MM/yyyy");
        Date dataDigitada = formato.parse(mesDiditado + "/" + anoDigitado );

        for (ContratoDeHoras c : contratos) {

            if (dataDigitada.getMonth() == c.getData().getMonth() && dataDigitada.getYear()
                    == c.getData().getYear()) {
                total += c.valorTotal();
            }
        }
        return total;
    }
}
