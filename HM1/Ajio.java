package week3.HM1;

import java.util.Iterator;
//import java.util.LinkedHashSet;
//import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		WebElement bag=driver.findElement(By.xpath("//input[@aria-label='Search Ajio']"));
				bag.sendKeys("bags");
          driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
        		
          	WebElement bagspge= driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"));  
           bagspge.click();
   			Thread.sleep(2000);

           WebElement fashion=driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags' and @for='Men - Fashion Bags']"));
           
          fashion.click();
          
          //Total items found
          Thread.sleep(2000);
          WebElement totfound=driver.findElement(By.xpath("//div[@class=\"length\"]"));
      
          System.out.println("\n\n\t\t\t\t\t Total Found Items  =====>"+totfound.getText());
  		
          Thread.sleep(2000); 
        //Finding the brand numbers and displaying the brand names   
         List<WebElement> printBrand=driver.findElements(By.xpath("//div[@class=\"brand\"]"));
         List<WebElement>bagNames=driver.findElements(By.xpath("//div[@class=\"nameCls\"]"));
    		int size=printBrand.size();
    	//adding and removing duplicates in brand and bag names	using sets
    		
			Set<String> brands=new TreeSet<String>();
            Set<String> bags=new TreeSet<String>();
    		for(int i =0;i<size;i++) {
    			
    			WebElement priceWe=printBrand.get(i);
    			brands.add(priceWe.getText());
    			WebElement bagsWe=bagNames.get(i);
    			bags.add(bagsWe.getText());
    			}
    		System.out.println("\t\t\t\t\t Brand Numbers    ===> "+brands.size());
    		System.out.println("\t\t\t\t\t \tBrand Names  \n\n\n  ");

    		Iterator<String> itr = brands.iterator(); // itr is the cursor to the HashSet here.
    		while(itr.hasNext()){ //it will give true until there are no elements to iterate.

    			System.out.println(itr.next());

    			}
    		System.out.println("\t\t\t\t\t \tBag Names   \n\n\n ");

    		Iterator<String> itr1 = bags.iterator(); // itr is the cursor to the HashSet here.
    		while(itr1.hasNext()){ //it will give true until there are no elements to iterate.

    			System.out.println(itr1.next());

    			}



    		

    		  
          
        		   
	
           
	
	}

}
