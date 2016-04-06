/**
 * Created by muhammadkhalilullah on 4/5/2016.
 */
public class Animal implements IAnimal {

    IAnimal animal;

    public IAnimal getAnimal() {
        return animal;
    }

    public void setAnimal(IAnimal animal) {
        this.animal = animal;
    }

    public void Speak() {
        animal.Speak();
    }
}
