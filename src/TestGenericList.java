/**
 *  Tests the LinkedList class by creating multiple objects of type Node<T>.
 *  Creates one object of type CSVReader class, which reads input from a CSV file. Uses
 *  the attributes stored in CSVReader object to create objects of type Country class.
 *  Then adds countries to a singly linked list.
 * @author Foothill College, Bita M. Jessica Dickinson Goodman
 */

import java.util.Random;
import java.util.Scanner;
//
public class TestGenericList
{
//	// Sets the Scanner object to the beginning of the input stream
//	// Since we will be reading user input in more than one place.
//	// To avoid incorrectly closing/reopening closing the stream,
//	// the reference to the stream is set as a class attribute.
//	public static Scanner keyboard = new Scanner(System.in);
//
//	/**
//	 * Creates a generic linked list. Then based on the user's input,
//	 * adds a random number of countries to the list.
//	 * @param allCountries      An array of Country objects
//     * @return A linked list of type Country
//	 */
//	private LinkedList<Country> createRandomListOfCountries(Country [] allCountries)
//	{
//		int requestedSize;
//		do
//		{
//			// Prompts the user for the number of elements they want to add to the list.
//			System.out.println("How many countries do you want to add to the list?");
//			requestedSize = Integer.parseInt( keyboard.nextLine() );
//		} while (requestedSize < 1);
//
//		// Build the list out of a random selection of countries.
//		Random random = new Random();
//
//		// DONE: Defined the generic LinkedList class one element (that class is selectedCountries)
//		//       and a reference to the next node.
//		//       Define the LinkedList class to be a singly list list of generic Node objects.
//		LinkedList<Country> selectedCountries = new LinkedList<>();
//		Country crait = new Country("Crait");
//		selectedCountries.add(crait);
//
//
//		for (int i = 0; i < requestedSize; i++)
//		{
//			// Selects a random index of the Country data array
//			int selectedIndex = random.nextInt(allCountries.length);
//
//			// DONE: Modify all attributes and methods of the parameterized class LinkedList
//			//       to hold generic data types.
//			Country countryToAdd = allCountries[selectedIndex];
//			System.out.printf("Adding country with name %s to the end of the list.\n", countryToAdd.getName());
//			selectedCountries.add(countryToAdd);
//		}
//
//		return selectedCountries;
//	}
////
////	/**
////	 * Displays the list of countries.
////	 * Each country index is output along with the country's index in the list.
////	 * @param countryList	list of countries to display
////	 */
////	private void displayGeneratedList(LinkedList<Country> countryList)
////	{
////		String countryNames = "";
////		int counter = 0;
////
////		// DONE: Implement a nested ListIterator class in your generic LinkedList class
////		Iterator<Country> iterator = countryList.iterator();
////
////        // Uses a reference of type ListIterator to traverse your country list and collect country names
////		while(iterator.hasNext())
////		{
////			// NOTE: Each country should be output on a *separate* line.
////			//       Otherwise, your output will not be considered readable.
////			countryNames += counter + " " + iterator.next().getName();
////
////			// uses a ternary operator to prettify the output
////			countryNames += (counter++ % 10  + 1) == 0 ? "\n" : ", ";
////		}
////
////		System.out.println("\nNames of countries in list:\n" + countryNames);
////		// Assuming the user selects to add 3 songs to the list, the output would be
////		// Names of countries in list:
////		// 0 Brazil, 1 Germany, 2 Bangladesh,
////	}
//
//	/**
//	 * Tests the contains() method of the generic LinkedList class.
//	 * @param selectedCountryList  list of countries to search
//	 */
//	private void testSearchInList(LinkedList<Country> selectedCountryList)
//	{
//		// Tests that the iterator of the LinkedList class by calling its toString() method.
//		// Note: To debug your list, comment this line in
//		System.out.println("\nSize of list: " + selectedCountryList.size());
//		System.out.println("\nList of countries: " + selectedCountryList);
//
//		System.out.println("\nWhat country do you want to search for?");
//		String countryNameToFind = keyboard.nextLine();
//
//		// NOTE: The generic linked list should be able to check whether
//		//       the list has an element that equals the generic type
//		//       passed as an argument to the contains() method.
//		Country tmpCountry = new Country(countryNameToFind);
//		Country foundCountry = selectedCountryList.contains(tmpCountry);
//		if (foundCountry != null)
//		{
//			System.out.println("Country " + countryNameToFind + " found with details:\n" + foundCountry);
//		}
//		else
//		{
//			System.out.println("Country " + countryNameToFind + " not found.");
//		}
//	}
//
//	/**
//	 * Tests the getNumSubscriptionsForPeriod() method of LinkedList class.
//	 * @param selectedCountryList  list of countries to search
//	 */
//	private void testSubscriptionsTotalInList(LinkedList<Country> selectedCountryList)
//	{
//		// Testing getNumSubscriptionsForPeriod() method
//		displayGeneratedList(selectedCountryList);
//
//		System.out.printf("\nWhat country would you like subscription information about? (Enter a index between 0 and %d)\n", selectedCountryList.size()-1);
//		int selectedIndex = Integer.parseInt(keyboard.nextLine());
//		try
//		{
//			Country foundCountry = selectedCountryList.getIndex(selectedIndex);
//
//			System.out.println("\nWhat subscription period do you want to total? (Enter [starting year],[end year].)");
//			String period = keyboard.nextLine();
//			String [] tokens = period.split(",");
//			int requestedStartYear = Integer.parseInt(tokens[0]);
//			int requestedEndYear = Integer.parseInt(tokens[1]);
//
//			double totalSubscriptions = foundCountry.getNumSubscriptionsForPeriod(requestedStartYear,requestedEndYear);
//			System.out.printf("Total subscriptions for %s between %d and %d is %f \n", foundCountry.getName(), requestedStartYear, requestedEndYear, totalSubscriptions);
//		}
//		catch (IllegalArgumentException exc)
//		{
//			System.err.printf("ERROR: Requested index %d is out of range. ", selectedIndex);
//			System.err.printf("Valid element positions are (index >= 0 && index < %d).", selectedCountryList.size());
//		}
//	}
//

        public static void main(String[] args)
        {
            // NOTE: Make sure to use relative path instead of specifying the entire
            // path (such as /Users/alicew/myworkspace/so_on_and_so_forth).
            final String FILENAME = "resources/County_Facts_Scale_Comparison.csv";	// Directory path for Mac OS X

            // TODO: Make sure to test with the full input file as well
//		 final String FILENAME = "resources/cellular.csv"; // Directory path for Mac OS X
            // final String FILENAME = "resources\\cellular.csv"; // Directory path for Windows OS (i.e. Operating System)

            // TODO: Create the class cellularData.CSVReader to parse the CSV data file
            //       The class constructor should only take a string as argument
            //       for the name of the input file.
            //       The constructor should fill the array of country names, year labels, etc.
            // NOTE: Handle all exceptions in the constructor.
            //       For full credit, do *not* throw exceptions to main.
            CSVReader parser = new CSVReader(FILENAME);
            String printable = parser.toString();
            System.out.println(printable);
//
//            // TODO: In class cellularData.CSVReader the accessor methods should only return values
//            //       at instance variables.
//            String [] countryNames = parser.getNames();
//            int [] yearLabels = parser.getPopulation();
//            double [] parsedTable = parser.getArea();
//
//            // Stores the 2D array of cellular data for all countries.
//            CellularData datatable;
//            int numRows = parsedTable.length;
//            int numColumns = parser.getNumberOfYears();
//            int startingYear = yearLabels[0];
//
//            datatable = new CellularData(numRows, numColumns, startingYear);
//
//            // From the array that stores parsed information,
//            // add one country at a time to an object of type CellularData.
//            for (int countryIndex = 0; countryIndex < countryNames.length; countryIndex++)
//            {
//                double [] countryData = parsedTable[countryIndex];
//                datatable.addCountry(countryNames[countryIndex], countryData);
//            }
//
//            // Display the string representation of the data table.
//            System.out.println(datatable);
//            // Given the cellular_short_oneDecade.csv file, the output is:
//            // Country Name 	2005	2006	2007	2008	2009	2010	2011	2012	2013	2014
//            //   Bangladesh	    6.29	13.21	23.47	30.17	34.35	44.95	55.19	62.82	74.43	80.04
//            // "Bahamas, The"	69.21	75.38	109.34	102.79	101.22	118.83	81.56	80.65	76.05	82.30
//            //       Brazil	    46.31	53.11	63.67	78.55	87.54	100.88	119.00	125.00	135.31	138.95
//            //      Germany	    94.55	102.28	115.14	126.56	126.23	106.48	109.66	111.59	120.92	120.42
//
//            // Tests finding a country and retrieving subscriptions between a requested period
//            //
//            double totalSubscriptions;
//            int countryNum;
//            int requestedStart = 0, requestedEndYear = 0;
//
//            try
//            {
//                countryNum = 1;
//                requestedStart = 2005;
//                requestedEndYear = 2014;
//                System.out.printf("Requesting subscriptions for \"%s\" between %d - %d. \n", countryNames[countryNum], requestedStart, requestedEndYear);
//                totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod(countryNames[countryNum], requestedStart,requestedEndYear);
//                System.out.printf("Total subscriptions = %.2f \n\n", totalSubscriptions);
//            }
//            catch (IllegalArgumentException ex)
//            {
//                System.out.println(ex.getMessage());
//            }
//            // Given the shorter cellular_short_oneDecade.csv file, the output is:
//            // Requesting subscriptions for ""Bahamas, The"" between 2005 - 2014.
//            // Total subscriptions = 897.33
//
//            try
//            {
//                countryNum = 2;
//                requestedStart = 1960;
//                requestedEndYear = 2014;
//                System.out.printf("Requesting subscriptions for \"%s\" between %d - %d. \n", countryNames[countryNum], requestedStart, requestedEndYear);
//                totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod(countryNames[countryNum], requestedStart,requestedEndYear);
//                System.out.printf("Total subscriptions = %.2f \n\n", totalSubscriptions);
//            }
//            catch (IllegalArgumentException ex)
//            {
//                System.out.println(ex.getMessage());
//            }
            // Given the shorter cellular_short_oneDecade.csv file, the output is:
            // Requesting subscriptions for "Brazil" between 1960 - 2014.
            // Illegal Argument Request of start year: 1960.
            // Valid period for Brazil is 2005 to 2014.
            // Total subscriptions = 948.34
//
//		try
//		{
//			countryNum = 0;
//			requestedStart = 1960;
//			requestedEndYear = 2014;
//			System.out.printf("Requesting subscriptions for \"%s\" between %d - %d. \n", countryNames[countryNum], requestedStart, requestedEndYear);
//			totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod(countryNames[countryNum], requestedStart,requestedEndYear);
//			System.out.printf("Total subscriptions = %.2f \n\n", totalSubscriptions);
//		}
//		catch (IllegalArgumentException ex)
//		{
//			System.out.println(ex.getMessage());
//		}
            // Given the full cellular.csv file, the output is:
            // Requesting subscriptions for "Afghanistan" between 1960 - 2014.
            // Total subscriptions = 420.07

            // TODO: Comment this line if your test input has fewer than countryNum countries.
//		try
//		{
//			countryNum = 100;
//			requestedStart = 1950;
//			requestedEndYear = 2014;
//			System.out.printf("Requesting subscriptions for \"%s\" between %d - %d. \n", countryNames[countryNum], requestedStart, requestedEndYear);
//			totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod(countryNames[countryNum], requestedStart,requestedEndYear);
//			System.out.printf("Total subscriptions = %.2f \n\n", totalSubscriptions);
//		}
//		catch (IllegalArgumentException ex)
//		{
//			System.out.println(ex.getMessage());
//		}

            // Given the full cellular.csv file, the output is:
            // Requesting subscriptions for "Hong Kong SAR, China" between 1950 - 2014.
            // Illegal Argument Request of start year: 1950.
            // Valid period for "Hong Kong SAR, China" is 1960 to 2014.
            // Total subscriptions between 1960 - 2014 = 2561.16

            //*******Additional test cases*******

//        //Testing invalid country name
//		try
//		{
//			countryNum = 78;
//			requestedStart = 1950;
//			requestedEndYear = 2014;
//			System.out.printf("Requesting subscriptions for \"%s\" between %d - %d. \n", "Lehon", requestedStart, requestedEndYear);
//			totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod("Lehon", requestedStart,requestedEndYear);
//			System.out.printf("Total subscriptions = %.2f \n\n", totalSubscriptions);
//		}
//		catch (IllegalArgumentException ex)
//		{
//			System.out.println(ex.getMessage());
//		}
//
//		//Testing invalid country number
//		try
//		{
//			countryNum = 198;
//			requestedStart = 1950;
//			requestedEndYear = 2014;
//			System.out.printf("Requesting subscriptions for \"%s\" between %d - %d. \n", countryNames[countryNum], requestedStart, requestedEndYear);
//			totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod(countryNames[countryNum], requestedStart,requestedEndYear);
//			System.out.printf("Total subscriptions = %.2f \n\n", totalSubscriptions);
//		}
//		catch (IllegalArgumentException ex)
//		{
//			System.out.println(ex.getMessage());
//		}
//
//		//Testing invalid requestedEndYear
//		try
//		{
//			countryNum = 30;
//			requestedStart = 1950;
//			requestedEndYear = 1014;
//			System.out.printf("Requesting subscriptions for \"%s\" between %d - %d. \n", countryNames[countryNum], requestedStart, requestedEndYear);
//			totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod(countryNames[countryNum], requestedStart,requestedEndYear);
//			System.out.printf("Total subscriptions = %.2f \n\n", totalSubscriptions);
//		}
//		catch (IllegalArgumentException ex)
//		{
//			System.out.println(ex.getMessage());
//		}
//
//		//Testing invalid requestedStart
//		try
//		{
//			countryNum = 115;
//			requestedStart = 1850;
//			requestedEndYear = 2014;
//			System.out.printf("Requesting subscriptions for \"%s\" between %d - %d. \n", countryNames[countryNum], requestedStart, requestedEndYear);
//			totalSubscriptions = datatable.getNumSubscriptionsInCountryForPeriod(countryNames[countryNum], requestedStart,requestedEndYear);
//			System.out.printf("Total subscriptions = %.2f \n\n", totalSubscriptions);
//		}
//		catch (IllegalArgumentException ex)
//		{
//			System.out.println(ex.getMessage());
//		}
//
//		//
//		// NOTE: For a more user friendly output adjust the invalid requested range to a valid range.
//		//       Then, inform the user of the adjusted date and the total subscriptions.
//
//		// TODO: For full credit, include test cases in addition to those provided.
//		//       Use the full cellular.csv for the input file of your additional test cases.
//		//
//		// TODO: Also, test for additional cases where the requested range of years is invalid.
//

            System.out.println("\nDone with TestCSVReader.\n");
        }
    }
