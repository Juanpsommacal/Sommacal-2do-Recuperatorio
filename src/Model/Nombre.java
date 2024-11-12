package Model;

public class Nombre {

    private String first;
    private String last;

    public Nombre(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public Nombre() {
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
