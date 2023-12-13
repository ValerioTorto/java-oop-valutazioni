package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studente>students = new ArrayList<>();
        Random randoms = new Random();
        int totalStudents = randoms.nextInt(10,20);

        for (int i = 0; i <totalStudents; i++){
            int assenze = randoms.nextInt(0,100);
            double media = randoms.nextInt(0,10);
            Studente studente = new Studente(assenze, media);
            students.add(studente);
        }
        Corso.elencoStudenti(students);
        Corso.elencoPromossi(students);
    }
}
