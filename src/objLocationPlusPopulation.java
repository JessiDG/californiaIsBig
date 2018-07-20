/**
 *  This class produces an object type objLocationPlusPopulation with variables for its name, population, and area in sq miles.
 * @author Jessica Dickinson Goodman
 */
public class objLocationPlusPopulation {
    private int population = 0;
    private double areaSqMiles = 0;
    private String name;
//    private int numberOfYears;
//    private LinkedList<SubscriptionYear> subscriptions;
//    private int firstYear = 1960;
//    private int lastYear = 2014;
//    private int minYear = 0;
//    private int maxYear = 9999;


    /**
     * This is the constructor method that only takes a country name string
     * @param name      The name of the country
     */
    public objLocationPlusPopulation(String name) {
        this.name = name;
//        this.minYear = 0;
//        this.maxYear = 9999;
//        subscriptions = new LinkedList<SubscriptionYear>();
//        this.numberOfYears = subscriptions.size();

//        out.println("This is the error in the constructor:: " + subscriptions.toString());
    }

    /**
     * This is a copy constructor for the Country method
     * @param aCountry      An object of type Country
//     */
//    public Country(Country aCountry){
//        System.out.println("The Country copy constructor is running");
//        countOfSubscriptions = aCountry.countOfSubscriptions;
//        name = aCountry.name;
//        numberOfYears = aCountry.numberOfYears;
//        countOfSubscriptions = aCountry.countOfSubscriptions;
//        subscriptions = new SubscriptionYear[aCountry.numberOfYears];
//        for(int i = 0; i < subscriptions.length; i++){
//            SubscriptionYear subscriptionsTemp = new SubscriptionYear(aCountry.subscriptions[i]);
//            subscriptions[i] = subscriptionsTemp;
//
//        }
//    }
    /**
     * This is the constructor method that takes the name of a country, the population, an the sq mils
     * @param name              The name of the country
     * @param areaSqMiles     The size of the location, if relevant
     * @param population      The number of people living in that location / in that group, if relevant
     */
    public objLocationPlusPopulation(String name, double areaSqMiles, int population) {
        this.name = name;
        this.areaSqMiles = areaSqMiles;
        this.population = population;
//        this.numberOfYears = numberOfYears;
//        subscriptions = new SubscriptionYear[numberOfYears];
//        out.println("This is the error in the constructor:: " + subscriptions.toString());
    }

    /**
     * This method lets us add an object type SubscriptionYear to the Country object
     * @param year              This is the year of the data being added, e.g. 1979
     * @param countryDatum       This is the piece of data for the relevant year, e.g. .1001
     * @return                  A boolean indicating if the subscription was able to be added or not
     */
//    public boolean addSubscriptionYear(int year, double countryDatum){
//        if (year < minYear || year > maxYear || countryDatum < 0)        //TODO: Better test
//            return false;
//        SubscriptionYear subscription = new SubscriptionYear(year, countryDatum);
//        subscriptions.add(subscription);
////        countOfSubscriptions ++;
//        return true;
//    }

    /**
     * This gives a sum of the number of subscriptions for the given period,
     * or if the user-provided date range is invalid, any valid data within the
     * user's range with a note that they put in bad info.
     * @param requestedStart        This is the start date the user provides
     * @param requestedEnd          This is the end date the user provides
     * @return                      This is the sum of all of the subscriptions for that period
     */
//    public double getNumSubscriptionsForPeriod(int requestedStart, int requestedEnd){
//        double numSubscriptionsForPeriod = 0;
//
//        if((requestedEnd - requestedStart) < 0 ||
//                requestedStart < firstYear ||
//                requestedEnd > lastYear ||
//                requestedStart < minYear ||
//                requestedEnd > maxYear) {
//
//
//            Iterator<SubscriptionYear> itr0 = subscriptions.iterator();
//
//            for(int i = 0; i < subscriptions.size(); i++) {
//                numSubscriptionsForPeriod += itr0.next().getSubscriptions();
//            }
//
//            String printStatement = String.format("Total subscriptions = %.2f", numSubscriptionsForPeriod);
//            throw new IllegalArgumentException("Illegal Argument Request of " +
//                    "year range " + requestedStart + "-" + requestedEnd + ". " +
//                    "Valid period for " + getName() + " is " + minYear + " to " +
//                    maxYear + "." + "\n" + "Total subscriptions = " +
//                    printStatement + "\n");
//        }
//        else {
//            int start = requestedStart - firstYear;
//            int end = subscriptions.size() - (lastYear - requestedEnd);
//
//            Iterator<SubscriptionYear> itr = subscriptions.iterator();
//
//            for(int i = 0; i < start; i++){
//                itr.next();
//            }
//
//            for(int i = start; i < end; i++) {
//                numSubscriptionsForPeriod += itr.next().getSubscriptions();
//            }
//        }
//        return numSubscriptionsForPeriod;
//    }

    /**
     * This is the accessor method for area
     * @return      the area in sq miles of the given location
     */
    public double getArea() {
        return areaSqMiles;
    }

    /**
     * This is the mutator method for the area
     * @param areaSqMiles       This is the number of sq miles of the given location
     */
    public void setArea(double areaSqMiles) {
        if (areaSqMiles >= 0)
            this.areaSqMiles = areaSqMiles;
        else throw new IllegalArgumentException("The area must be great than or equal to 0");
    }

    /**
     * This is the accessor method for population
     * @return  the population of a given area or demographic group
     */
    public int getPopulation() { return population; }

    /**
     * This is the mutator method for the population
     * @param population    The number of people who live in a given area or are members of a given demographic group
     */
    public void setPopulation(int population) {
        if(population > 0)
            this.population = population;
        else throw new IllegalArgumentException("The population must be great than or equal to 0");
    }

    /**
     * This is the access for for numberOfYears
     * @return      this returns numberOfYears
     */
//    public int getNumberOfYears() {
//        return numberOfYears;
//    }

//    /**
//     * This is the mutator for numberOfYears
//     * @param numberOfYears     This is the user-provided number of years
//     */
//    public void setNumberOfYears(int numberOfYears) {
//        this.numberOfYears = numberOfYears;
//    }

    /**
     * DONE: Issue: How to compare countries
     * @param other     The object this is comparing to
     * @return  A boolean if this is an instanceOf Node
     */
    public boolean equals(Object other)
    {
        if (other instanceof objLocationPlusPopulation) {
            objLocationPlusPopulation current = (objLocationPlusPopulation)other;
            if (this.name.equals(current.name) && this.population == current.population && this.areaSqMiles == current.areaSqMiles)
                return true;
        }
        return false;
    }

//    /**
//     * This lets us set the subscriptions
//     * @param someIndex   This indext at which the change will be made
//     * @param someFloat   The new data
//     */
//    public void setSubscriptionsAtIndex(int someIndex, float someFloat){
//        if (someIndex >= 0 && someIndex < subscriptions.size()) {
//            subscriptions.getIndex(someIndex).setSubscriptions(someFloat);
//        }
//        else {
//            throw new IndexOutOfBoundsException();
//        }
//    }


    /**
     * This is the toString method, which returns a formatted String of the country's name and subscription information
     * @return          A formatted String
     */
    public String toString() {
        return "name" + ", " + population + ", " + areaSqMiles + "sq miles";
    }
}
