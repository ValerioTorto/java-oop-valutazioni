package org.lessons.java.valutazioni;

import java.util.ArrayList;

public class Corso {
    //Attributi
    private ArrayList<Studente> studenti = new ArrayList<>();
//MOSTRO A VIDEO GLI STUDENTI CON I DATI
    public static void elencoStudenti(ArrayList<Studente>studenti) {
        for (Studente studente : studenti) {
            System.out.println(studente);
        }
    }


    //PER AGGIUNGERE O RIMUOVERE UNO STUDENTE
    public static void remStudent(ArrayList<Studente>studenti, int ID) {studenti.remove(ID);}
    public static void addStudent(ArrayList<Studente>studenti, Studente newStudent){studenti.add(newStudent);}

        public static void elencoPromossi (ArrayList<Studente>studenti){
            int i = 0;
            for (Studente studente:studenti){
                if (studente.passNotPass()){
                    i++;
                }
            }

        //DO PERCENTUALE DEGLI STUDENTI PROMOSSI
        System.out.println("Gli studenti promossi sono il " + (i * 100/(studenti.size())) + "%");
    }

}
