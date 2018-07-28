import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.out;

/**
 *  This class reads input from a CSV file.
 * @author Jessica Dickinson Goodman
 */
public class CSVReader {
    private String[] names;
    private int[] population;
    private double[] area;
    String header;

    /**
     * Returns a File object and a Scanner object
     * @param filename      this is the name of the file
     */
    public CSVReader(String filename) {
        Scanner input = null;
        try {
            File infile = new File(filename);
            input = new Scanner(infile);
            int numRows = 0;

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] tokens = line.split(",");
                numRows++;
            }

            input = new Scanner(infile);
            names = new String[numRows];
            population = new int[numRows];
            area = new double[numRows];
            int nameIndex = 0;
            int areaIndex = 1;
            int popIndex = 2;

            int index = 0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] tokens = line.split(",", -1);

//                String[] tokens = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                if (! tokens[0].contains("County_or_Comparison")) {
                    names[index] = tokens[nameIndex];
                    try {
                        area[index] = Double.parseDouble(tokens[areaIndex]);
                    }
                    catch (NumberFormatException a){
                        area[index] = 0;
                    }
                    try {
                        population[index] = Integer.parseInt(tokens[popIndex]);
                    }
                    catch (NumberFormatException a) {
                        population[index] = 0;
                    }
                }
                else{
                    header = line;
                }

                index++;
            }
            input.close();
        }
        catch (FileNotFoundException e) {
            out.println("File " + filename + " not found.");
            out.println("Please try again.");
            out.println(e.getStackTrace());
            exit(-1);
        }
    }

    /**
     * This accessor method returns names
     * @return a string array names[]
     */
    public String[] getNames(){ return names; }

    /**
     * This accessor method returns population
     * @return an int array population
     */
    public int[] getPopulation(){ return population; }

    /**
     * This accessor method returns area
     * @return a two dimensional array of doubles getCellularDataTable
     */
    public double[] getArea(){ return area; }

    /**
     * This is the toString, it returns a formatted string version of the csv file
     * @return      String
     */
    public String toString() {
        String[] tokens = header.split(",", -1);
        String returnStr = String.format("%1$-55s %2$-15s %3$-15s \n", tokens[0], tokens[1], tokens[2]);
        for(int i = 1; i < names.length; i++){
            returnStr +=  String.format("%1$-55s %2$-15s %3$-15s \n", names[i], area[i], population[i]);
        }
        return returnStr;
    }
}
