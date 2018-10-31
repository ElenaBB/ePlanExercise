package Pages;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class PageREsourcesFactory {
        static HashMap pageResourcesHashMap = new HashMap();

        public static POM getPageResources(WebDriver driver) {
            if (pageResourcesHashMap.containsKey(driver)) { //If there is already a PageResources.PageResources with this driver...
                return (POM) pageResourcesHashMap.get(driver); //return that resource
            } else {
                pageResourcesHashMap.put(driver, new POM(driver)); //Otherwise, we make a new one...
                return (POM) pageResourcesHashMap.get(driver); //and return it!
            }
        }
    }
