public class Marsvin implements Comparable {
    private String name;
    private String race;
    private int fodder;


    public Marsvin(String name, String race, int fodder){
        this.name = name;
        this.race = race;
        this.fodder = fodder;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", fodder=" + fodder + "\n";
    }

    public int getFodder(){
        return this.fodder;
    }

    @Override
    public int compareTo(Object o) {
        Marsvin myMarsvin = (Marsvin) o;
        return this.name.compareTo(myMarsvin.name);
    }
}
