package create.buildpattern;

public abstract class ColdDrink implements Item{
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract Float price();
}
