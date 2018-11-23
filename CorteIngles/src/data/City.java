/**
 * @author mrhyd
 * 
 * This class represents a city, which contains a list of hotels and activities.
 * 
 */

package data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 * @author mrhyd
 *
 */
public class City{
	
	/**
	 * City's name
	 */
	private final String name;
	
	/**
	 * List of available activities in this city
	 */
	private List<Activity> listOfActivities;
	
	/**
	 * List of hotels in this city
	 */
	private List<Hotel> listOfHotels;
	
	/**
	 * @param name
	 * @param listOfActivities
	 * @param listOfHotels
	 */
	public City(String name, List<Hotel> listOfHotels, List<Activity> listOfActivities) {
		super();
		this.name = name;
		this.listOfActivities = listOfActivities;
		this.listOfHotels = listOfHotels;
	}
	
	/**
	 * @param name
	 */
	public City(String name) {
		super();
		this.name = name;
		this.listOfActivities = new ArrayList<>();
		this.listOfHotels = new ArrayList<>();
	}

	/**
	 * @return the listOfActivities
	 */
	public List<Activity> getListOfActivities() {
		return listOfActivities;
	}

	/**
	 * @param listOfActivities the listOfActivities to set
	 */
	public void setListOfActivities(List<Activity> listOfActivities) {
		this.listOfActivities = listOfActivities;
	}

	/**
	 * @return the listOfHotels
	 */
	public List<Hotel> getListOfHotels() {
		return listOfHotels;
	}

	/**
	 * @param listOfHotels the listOfHotels to set
	 */
	public void setListOfHotels(List<Hotel> listOfHotels) {
		this.listOfHotels = listOfHotels;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
}
