package com.demo.nicolas.mori.page.object.androidnative;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;
import com.demo.nicolas.mori.util.ConectorConLaDB;

public class HomePage extends ParentPage {

	private List listaDeAvisosAConsultarALaDB = new ArrayList<String>();
	private List listaDeAvisosAClickear = new ArrayList<String>();

	public HomePage(WebDriver driver) {
		super(driver);
	}

	By BUTTON_MUNICH = By.xpath("//android.widget.Button[2]");

	By BUTTON_AVISO = By.xpath("//android.widget.Button[%s]");

	String BUTTON_AVISO_STRING = "//android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[%s]";
	// String BUTTON_CIRCLE_MAIL_STRING =
	// "//android.webkit.WebView[1]/android.view.View[3]/android.view.View[2]/"

	String BUTTON_CIRCLE_STRING = "//android.widget.ListView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]";
	String BUTTON_CIRCLE_MAIL_STRING = "//android.widget.ListView[2]/android.widget.Button[1]";

	/**
	 * this method get the result of the calculator.
	 * 
	 * @return a integer value with the result of the caclulator.
	 */
	public void makeClikInMunichButton() {
		System.out.println("Esperando por el botton de munich");
		waitForAnExplicitElement(BUTTON_MUNICH);
		System.out.println("Pulsando el boton de munich");
		click(BUTTON_MUNICH);
		System.out.println("Boton de munich pulsado");
	}

	/**
	 * this method get the result of the calculator.
	 * 
	 * @return a integer value with the result of the caclulator.
	 */
	public void makeClikInMunichButton3() {
		waitForAnExplicitElement(By.xpath(String.format(BUTTON_AVISO_STRING,1)));
		
		for (int j = 1; j < 10; j++) {
			System.out.println("Numero de titulo "+j);
			waitForAnExplicitElement(By.xpath(String.format(BUTTON_AVISO_STRING,j)));
			
			if(getTextInContentDescriptionByLocator(By.xpath(String.format(BUTTON_AVISO_STRING,j))).contains("viewed")||getTextInContentDescriptionByLocator(By.xpath(String.format(BUTTON_AVISO_STRING,j))).contains("Advertisement")){
				
			}else{
				listaDeAvisosAConsultarALaDB.add(getTextInContentDescriptionByLocator(By.xpath(String.format(BUTTON_AVISO_STRING,j))).replace("", "$x"));
			}
			
		}
		
		listaDeAvisosAClickear = ConectorConLaDB.dbConsultaSiExisteTitulosDeAvisos(listaDeAvisosAConsultarALaDB);
		
		System.out.println("llllllllllllllllllllll");
		for (int i = 0; i < listaDeAvisosAConsultarALaDB.size(); i++) {
			
			System.out.println(listaDeAvisosAClickear.get(i));
			
		}
		System.out.println("llllllllllllllllllllll");
		
		
		try {
			Thread.sleep(333333333);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		System.out.println("entrando al FOR");
//		for (int i = 1; i < 8; i++) {
//			
//			try {
//				Thread.sleep(3000);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			
//			System.out.println("------------------------");
//			System.out.println("mostrando por pantalla todos los titulos disponibles");
//			
//			
//			
//			System.out.println("------------------------");
//			
//			System.out.println("esperando el primer aviso");
//			waitForAnExplicitElement(By.xpath(String.format(BUTTON_AVISO_STRING,i)));
//			System.out.println("iteracion numero "+i);
//			
//			if (getTextInContentDescriptionByLocator(By.xpath(String.format(BUTTON_AVISO_STRING,i))).contains("Advertisement")) {
//				//aca entra en el caso de que sea una publicidad
//			} else {
//				System.out.println("Pulsando en el aviso");
//				click(By.xpath(String.format(BUTTON_AVISO_STRING,i)));
//				
//				System.out.println("Titulo del Aviso: "+getTextInContentDescriptionByLocator(By.xpath(String.format(BUTTON_AVISO_STRING,i))));
//				
//				try {
//					Thread.sleep(2000);
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
//				//aca ya estoy adentro del aviso
//				waitForAnExplicitElement(By.xpath(BUTTON_CIRCLE_STRING));
//				click(By.xpath(BUTTON_CIRCLE_STRING));
//				
//				try {
//					Thread.sleep(2000);
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
//				
//				//ahora le pregunto si sigue existiendo el boton, y si es asi, lo pulso de nuevo, y sino pulso en el boton para volver
//				try {
//					click(By.xpath(BUTTON_CIRCLE_STRING));
//				} catch (Exception e) {
//					buttonBackMobile();
//				}
//				
//				//aca estamos en la pantalla del aviso, asique vuelvo al listado de los avisos.
//				buttonBackMobile();
//				
//				//espero hasta que aparezca el listado de los avisos y continuo.
//				waitForAnExplicitElement(By.xpath(String.format(BUTTON_AVISO_STRING,i)));
//				scrollDownDevice();
//			}
//
//		}

	}

}
