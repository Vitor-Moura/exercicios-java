package entities;

public class Ex02Funcionario {

    public String name;
    public double grossSalary, tax;


    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += grossSalary * (percentage / 100);
    }

    @Override
    public String toString() {
        return String.format("%s, $ %.2f", name, netSalary());
    }
}
