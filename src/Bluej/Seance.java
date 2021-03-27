package Bluej;

public class Seance {

    private String day;
    private int time;
    private int duration;
    private Salle salle;
    private Film film;



    public Seance() {
    }

    public Seance(String day, int time, int duration, Salle salle, Film film) {
        this.day = day;
        this.film = film;
        this.salle = salle;
        this.time = time;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public int getTime() {
        return time;
    }

    public String getDay() {
        return day;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
