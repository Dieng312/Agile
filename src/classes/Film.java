package classes;

import java.util.ArrayList;

public class Film {

    private String name;
    private int duration;
    private Category category;
    private final ArrayList<Seance> seances;

    public Film() {
        seances = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ArrayList<Seance> getSeances() {
        return seances;
    }
    public void addSeance(Seance seance){
        this.seances.add(seance);
    }
    public void rmvSeance(Seance seance){
        this.seances.remove(seance);
    }

}
