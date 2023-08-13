package GameToys;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class ToyShopMachine {
    private final PriorityQueue<Toy> toys;


    public ToyShopMachine() {
        this.toys = new PriorityQueue<>(new ToyComparator());
    }

    public  void putToy(Toy toy) {
        this.toys.add(toy);
    }

    public Toy getToy() {
        return this.toys.poll();
    }

    public void getToysToFile(String file, int toysQuantity) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            int count = 0;
            while (count < toysQuantity) {
                Toy toy = getToy();
                if (toy == null) {
                    break;
                }
                fileWriter.write(toy +"\n");
                count++;

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void changeToyPriority(Toy toy, int dropPriority) {
        boolean remove = this.toys.remove(toy);
        toy.setDropPriority(dropPriority);
        if (remove) {
            this.toys.add(toy);
        }

    }

    @Override
    public String toString() {
        return "ToyShopMachine{" +
                "toys=" + toys +
                '}';
    }
}
