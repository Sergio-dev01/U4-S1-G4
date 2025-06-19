import entities.Dipendente;
import entities.DipendenteFullTime;
import entities.DipendentePartTime;
import entities.Dirigente;
import enums.Dipartimento;

public class Main {
    public static void main(String[] args) {

        Dipendente d1 = new DipendenteFullTime(01, Dipartimento.AMMINISTRAZIONE, 1600.00);
        Dipendente d2 = new DipendentePartTime(05, Dipartimento.VENDITE, 8);
        Dipendente d3 = new Dirigente(07, Dipartimento.PRODUZIONE, 1600.00);

        Dipendente[] dipendenti = {d1, d2, d3};

        for (Dipendente d : dipendenti) {
            System.out.println("Matricola: " + d.getMatricola());
        }
    }
}