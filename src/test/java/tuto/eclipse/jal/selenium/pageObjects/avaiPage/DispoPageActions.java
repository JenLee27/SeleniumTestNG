package tuto.eclipse.jal.selenium.pageObjects.avaiPage;

import org.openqa.selenium.By;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class DispoPageActions {

	public void clickContinueButton() {
	}

	public void search() {
		MyDriver.driver.findElement(By.className(DispoPageIDs.CONTINU_BUTTON_CLASS)).click();

	}

}
