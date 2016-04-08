import java.util.List;

/**
 * Created by muhammadkhalilullah on 4/5/2016.
 */
public class Animal implements IAnimal {

    List<IAnimal> animals;
    IAnimal animal;

    public void allAnimnalSpeak() {
        for (IAnimal a : animals )
            a.Speak();
    }

    public List<IAnimal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<IAnimal> animals) {
        this.animals = animals;
    }

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
