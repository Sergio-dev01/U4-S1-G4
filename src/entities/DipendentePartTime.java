package entities;

import enums.Dipartimento;

public class DipendentePartTime extends Dipendente {
    private double stipendioBase;
    private int oreLavorative;

    public DipendentePartTime(int matricola, Dipartimento dipartimento, int oreLavorative) {
        super(matricola, dipartimento);
        this.stipendioBase = stipendioBase;
        this.oreLavorative = oreLavorative;
    }

    @Override
    public double calculateSalary() {
        return stipendioBase * oreLavorative;
    }
}
