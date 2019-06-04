package tuto.eclipse.jal.selenium.pageObjects.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class HomePageActions {

	/*
	 * ACTIONS
	 */
	protected void clickSearchButton() {
		MyDriver.driver.findElement(By.id(HomePageIDs.SEARCH_BUTTON_ID)).click();
	}

	public void closeModal() {
		MyDriver.driver.findElement(By.className(HomePageIDs.MODAL_CLOSE_BUTTON_CLASS)).click();

	}

	// Dates de départ//
	public void setDepartureDate(String departureDay, String departureMonth) {
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_1_DAY)));
		s.selectByValue(departureDay);
		s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_1_MONTH)));
		s.selectByValue(departureMonth);

	}

	// Ville de départ//
	public void setDepartureCity(String departurecity) {
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_FROM_CITY_ID)));
		s.selectByValue(departurecity);

	}

	// Ville d'arrivée//
	public void setArrivalCity(String arrivalcity) {
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.ARRIVAL_TO_CITY_ID)));
		s.selectByValue(arrivalcity);

	}

	// Dates d'arrivée //
	public void setGoDate(String goday, String gomonth) {
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_2_DAY)));
		s.selectByValue(goday);
		s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_2_MONTH)));
		s.selectByValue(gomonth);

	}

	public void search() {
		MyDriver.driver.findElement(By.id(HomePageIDs.CONTINUE_BUTTON_ID)).click();

	}
	// search//

}

/*
 * CHECKS
 */
