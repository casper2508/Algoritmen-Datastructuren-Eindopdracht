import java.util.LinkedList;

/*
    A class for keeping track of a collection which consists 721 Pokemon
*/
public class Pokedex {

    private CSVReader csvReader;
    private LinkedList<Pokemon> pokeList;

    public Pokedex() {
        csvReader = new CSVReader();
        pokeList = csvReader.CSVToLinkedList();
    }

    //Method for printing all data of all Pokemon
    public void printAll() {
        for(Pokemon pokemon: pokeList) {
            pokemon.printInfo();
        }
    }

    //BubbleSort in progress...
    /*public void bubbleSort() {

    }*/
}
