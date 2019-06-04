package tuto.eclipse.jal.selenium.pageObjects.avaiPage;

public class DispoPage {

	public DispoPage() {
		super();
		System.out.println("A new page Dispo has been created");

	}

	public void run() {
		performActions();

	}

	private void performActions() {
		System.out.println("On va faire les actions de la DispoPage");
		DispoPageActions actions = new DispoPageActions();
		actions.clickContinueButton();

	}

}
