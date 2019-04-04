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

    //Method for sorting the list with the concept of Bubble sort
    public void bubbleSort() {
        Pokemon temp = null;
        int n = pokeList.size();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < (n - i - 1); j++) {
                Pokemon current = pokeList.get(j);
                Pokemon next = pokeList.get(j + 1);
                //In this case we sort by attack in ascending order
                if (current.getAttack() > next.getAttack()) {
                    temp = current;
                    pokeList.set(j, next);
                    pokeList.set(j + 1, temp);
                }
            }
        }
    }
}
