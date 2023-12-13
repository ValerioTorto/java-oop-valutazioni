package org.lessons.java.valutazioni;

public class Studente {
    //ATTRIBUTI
    private int idStudent;
    private int assenze;

    private int media;

    private static int counter = 10;


//GETTER E SETTER
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getAssenze() {
        return assenze;
    }

    public void setAssenze(int assenze) {
        this.assenze = assenze;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }
    //COSTRUTTORE
    public Studente(int assenze, int media) {
        this.idStudent = counter++;
        this.assenze = assenze;
        this.media = media;
    }

    //METODO SE PROMOSSO O BOCCIATO
        public boolean passNotPass() {
            if (assenze > 50) {
                return false;
            } else if (assenze >25 && assenze < 50 && media > 2) {
                return true;
            } else if (assenze < 25 && media >= 2) {
                return true;
            }else
                return false;
            }
            @Override
            public String toString() {
                return "id studente: " + idStudent  + " Media studente: " + media + " Percentuale di assenze: " + assenze + "%";
            }
        }


