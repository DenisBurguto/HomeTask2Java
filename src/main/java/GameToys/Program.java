package GameToys;

public class Program {
    public static void main(String[] args) {

        ToyShopMachine toyShopMachine = new ToyShopMachine();

        Toy robot1 = new Toy(2, "robot1");
        Toy doll1 = new Toy(99, "doll1");
        Toy doll2 = new Toy(5, "doll2");

        toyShopMachine.putToy(robot1);
        toyShopMachine.putToy(doll1);
        toyShopMachine.putToy(doll2);


        Toy doll3 = new Toy(4564645, "doll3test");
        toyShopMachine.changeToyPriority(doll3, 10999);
        System.out.println(toyShopMachine);
        System.out.println("doll3 drop priority after change: " + doll3.getDropPriority());


        toyShopMachine.putToy(doll3);
        System.out.println(toyShopMachine);
        toyShopMachine.changeToyPriority(doll3, 4);
        System.out.println(toyShopMachine);

        toyShopMachine.changeToyPriority(doll3,0);
        System.out.println(toyShopMachine);

        toyShopMachine.getToysToFile("out.txt", 10);


    }
}
