package com.gana.backend.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gana.backend.model.Customer;
import com.gana.backend.model.Insurance;
//import com.gana.backend.model.Customer;
//import com.gana.backend.model.Insurance;
import com.gana.backend.service.CustomerService;

@SpringBootTest
class CustomerServiceImplTest {

	@Autowired
	private CustomerService customerService;

	@Test
	void testAddCustomer() {
		Insurance insurance = new Insurance(0, 67, 38, 23, 4, 3, 43);
		Customer customer = new Customer(0, "Guru", "Twenty", "up", "male", insurance);
		assertEquals("Success", customerService.addCustomer(customer));
	}

//	@BeforeEach
//	void init() {
//		webDriver = new ChromeDriver();
//	}
//	
//	@Test
//	void testAddCustomer() {
//		webDriver.get("http://localhost:3000/add");
//		webDriver.findElement(By.name("customername")).sendKeys("ganapathy");
//		webDriver.findElement(By.name("customerage")).sendKeys("two");
//		webDriver.findElement(By.name("customeraddress")).sendKeys("dgl");
//		webDriver.findElement(By.name("customergender")).sendKeys("male");
//		webDriver.findElement(By.name("insuranceid")).sendKeys("27");
//		webDriver.findElement(By.name("submit")).submit();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("customer added Successfully",webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//		
//	}
//	
//	@Test
//	void testAddCustomer1() {
//		webDriver.get("http://localhost:3000/add");
//		webDriver.findElement(By.name("customername")).sendKeys("");
//		webDriver.findElement(By.name("customerage")).sendKeys("two");
//		webDriver.findElement(By.name("customeraddress")).sendKeys("dgl");
//		webDriver.findElement(By.name("customergender")).sendKeys("male");
//		webDriver.findElement(By.name("insuranceid")).sendKeys("27");
//		webDriver.findElement(By.name("submit")).submit();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("Please enter  customername !!!",webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//		
//	}

	@Test
	void testAddCustomer1() {
		Customer customer = null;
		assertEquals("Failed to add", customerService.addCustomer(customer));
	}

	@Test
	void testGetCustomer() {
		assertNotNull(customerService.getCustomer(49));
	}

	@Test
	void testGetCustomer1() {
		assertNull(customerService.getCustomer(1));
	}

	@Test
	void testGetAllCustomers() {
		assertNotNull(customerService.getAllCustomers());
	}

	@Test
	void testUpdateCustomer() {
		Insurance insurance = new Insurance(10, 25, 3, 23, 4, 3, 43);
		Customer customer = new Customer(8, "George prabha", "thirty", "dgl", "male", insurance);
		assertEquals("Success", customerService.updateCustomer(customer));
	}

	@Test
	void testUpdateCustomer1() {
		Customer customer = null;
		assertEquals("Failed to update", customerService.updateCustomer(customer));
	}

//	@Test
//	void testUpdateCustomer() {
//		webDriver.get("http://localhost:3000/updateCustomer/12");
//		webDriver.findElement(By.name("customername")).sendKeys("y");
//		webDriver.findElement(By.name("customerage")).sendKeys(" two");
//		webDriver.findElement(By.name("customeraddress")).sendKeys("dgl");
//		webDriver.findElement(By.name("customergender")).sendKeys("e");
//		webDriver.findElement(By.name("submit")).submit();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("customer Updated Successfully",webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//		
//	}

	@Test
	void testDeleteCustomer() {
		assertEquals("Success", customerService.deleteCustomer(49));
	}

	@Test
	void testDeleteCustomer1() {
		assertEquals("Failed to delete", customerService.deleteCustomer(8));
	}

//	@Test
//	void testDeleteCustomer() {
//		webDriver.get("http://localhost:3000/viewCustomer");
//		webDriver.findElement(By.name("delete")).click();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("Do you want to delete",webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//		WebDriverWait wait1 = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("Customer record has been deleted",webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//	}

}
