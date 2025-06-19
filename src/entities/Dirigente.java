package entities;

import enums.Dipartimento;

public class Dirigente extends Dipendente {
    private double stipendioBase;
    private double bonus;

    public Dirigente(int matricola, Dipartimento dipartimento, double bonus) {
        super(matricola, dipartimento);
        this.stipendioBase = stipendioBase;
        this.bonus = bonus;

    }

    @Override
    public double calculateSalary() {
        return stipendioBase + bonus;
    }
}
