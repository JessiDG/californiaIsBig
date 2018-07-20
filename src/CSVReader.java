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

            int row = 0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] tokens = line.split(",", -1);

//                String[] tokens = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                if (! tokens[0].contains("County_Comparator")) {
                    names[row] = tokens[0];
                    try {
                        area[row] = Double.parseDouble(tokens[1]);
                    }
                    catch (NumberFormatException a){
                        area[row] = 0;
                    }
                    try {
                        population[row] = Integer.parseInt(tokens[2]);
                    }
                    catch (NumberFormatException a) {
                        population[row] = 0;
                    }
                }
                row++;
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

    public String toString() {
        String returnStr = "Name \t \t Population \t \t Area (Sq Miles) + \n";
        for(int i = 0; i < names.length; i++){
            returnStr +=  names[i] + ", \t" + population[i] + ",\t" + area[i] + "\n";
        }
        return returnStr;
    }
}
