package entities;

public class PessoaJuridica extends Contribuinte {

    private Integer qtdFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer qtdFuncionarios) {
        super(nome, rendaAnual);
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public Integer getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(Integer qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }


    @Override
    public Double imposto() {
        if (qtdFuncionarios > 10) {
            return getRendaAnual() * 0.14;
        }
        else {
            return getRendaAnual() * 0.16;
        }
    }
}
