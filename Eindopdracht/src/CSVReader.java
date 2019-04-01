import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;

/*
    A class for converting data from Pokemon.csv into several Java data structures
*/
public class CSVReader {

    private String fileName = "Pokemon.csv";
    private String separator = ",";

    //Method for parsing the CSV file data into a LinkedList
    public LinkedList<Pokemon> CSVToLinkedList() {
        BufferedReader br = null;
        String line = "";

        //Create a List to store all the Pokemon info
        LinkedList<Pokemon> pokedex = new LinkedList<Pokemon>();

        try {
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null)
            {
                //Put the data into an array first
                String[] stats = line.split(separator);

                if(stats[0].equals("#")) {
                    //Do nothing with the first line of the CSV file
                }
                else {

                    //Create a new Pokemon object for every row of data and put the data in it
                    Pokemon pokemon = new Pokemon(Integer.valueOf(stats[0]), stats[1], stats[2], stats[3], Integer.valueOf(stats[4]),
                        Integer.valueOf(stats[5]), Integer.valueOf(stats[6]), Integer.valueOf(stats[7]), Integer.valueOf(stats[8]),
                        Integer.valueOf(stats[9]), Integer.valueOf(stats[10]), Integer.valueOf(stats[11]), Boolean.valueOf(stats[12]));

                    //Add every Pokemon to the List
                    pokedex.add(pokemon);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return pokedex;
    }
}