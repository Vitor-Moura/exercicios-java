package entities;

public class Ex03Aluno {

    public String nome;
    public double trimestre1, trimestre2, trimestre3;

    public double finalGrade() {
        return trimestre1 + trimestre2 + trimestre3;
    }

    public double missing() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
}
