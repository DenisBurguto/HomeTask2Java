package GameToys;

import java.util.Objects;

public class Toy {
    static int count =0;
    private final long id = count++;
    private int dropPriority;
    private final String name;


    public Toy(int dropPriority, String name) {
        this.dropPriority = dropPriority;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", dropPriority=" + dropPriority +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return id == toy.id && dropPriority == toy.dropPriority && Objects.equals(name, toy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dropPriority, name);
    }

    public int getDropPriority() {
        return dropPriority;
    }

    public void setDropPriority(int dropPriority) {
        this.dropPriority = dropPriority;
    }


}
