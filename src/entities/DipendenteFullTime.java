package entities;

import enums.Dipartimento;

public class DipendenteFullTime extends Dipendente {
    private double stipendioMensile;

    public DipendenteFullTime(int matricola, Dipartimento dipartimento, double stipendioMensile) {
        super(matricola, dipartimento);
        this.stipendioMensile = stipendioMensile;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }
}
