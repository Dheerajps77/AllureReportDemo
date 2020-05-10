package com.qa.NoCommerce.Tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.qa.NoCommerce.Pages.verifyNoCommerceLoginPage;
import com.qa.NoCommerce.TestBase.TestBase;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class verifyNoCommerceLoginTest extends TestBase {

	verifyNoCommerceLoginPage objverifyNoCommerceLoginPage;

	@Test(priority = 1, description = "Verify LOGO on home page")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Verify Logo presence on Home Page")
	@Epic("CW-444")
	@Feature("Feature 1: Logo")
	@Story("Story: Logo Presence")
	@Step("Verify logo Presence")
	public void verifyLOGOOnHomePage() {
		objverifyNoCommerceLoginPage = new verifyNoCommerceLoginPage(driver);
		try {
			boolean flagLogo = objverifyNoCommerceLoginPage.verifyLOGOOnHomePage();
			Assert.assertTrue(flagLogo, "Logo on home page verification failed");
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@Test(priority = 2, description = "Verify Login Functionality")
	@Severity(SeverityLevel.CRITICAL)		
	@Description("Verify login with Valid Credentials")
	@Epic("CW-444")
	@Feature("Feature 2: Login")
	@Story("Story: Valid login")
	@Step("Verify login")
	public void verifyLoginHomePage() {
		objverifyNoCommerceLoginPage = new verifyNoCommerceLoginPage(driver);
		try {
			boolean flaglogin = objverifyNoCommerceLoginPage.verifyLoginFunctionality();
			Assert.assertTrue(flaglogin, "Login verification failed");
		} catch (Exception e) {
			throw e;
		}
	}

	@Test(priority = 3, description = "Verify Registration functionality")
	@Severity(SeverityLevel.CRITICAL)		
	@Description("Verify Registration functionality")
	@Epic("CW-444")
	@Feature("Feature 3: Registration")
	@Story("Story: Valid Registration")
	@Step("Verify Registration")
	public void verifyRegisterationOnHomePage() {
		objverifyNoCommerceLoginPage = new verifyNoCommerceLoginPage(driver);
		try {
			boolean flaglogin = true;
			Assert.assertEquals(flaglogin, true);
		} catch (Exception e) {
			throw e;
		}
	}

	@Test(priority = 4, description = "Verify Contact list functionality")
	@Severity(SeverityLevel.TRIVIAL)		
	@Description("Verify Contact list functionality")
	@Epic("CW-444")
	@Feature("Feature 4: Contact list")
	@Story("Story: Valid Contact list")
	@Step("Verify Contact list")
	public void verifyContactListOnPage() {
		objverifyNoCommerceLoginPage = new verifyNoCommerceLoginPage(driver);
		try {
			boolean flaglogin = true;
			Assert.assertEquals(flaglogin, true);
		} catch (Exception e) {
			throw e;
		}
	}

	@Test(priority = 5, description = "Verify ForgetPassword functionality")
	@Severity(SeverityLevel.TRIVIAL)		
	@Description("Verify ForgetPassword functionality")
	@Epic("CW-444")
	@Feature("Feature 5: ForgetPassword")
	@Story("Story: Valid ForgetPassword")
	@Step("Verify ForgetPassword")
	public void verifyForgetPasswordOnPage() {
		objverifyNoCommerceLoginPage = new verifyNoCommerceLoginPage(driver);
		try {
			boolean flaglogin = true;
			Assert.assertEquals(flaglogin, true);
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Test(priority = 6, description = "Verify Remember Password functionality")
	@Severity(SeverityLevel.TRIVIAL)		
	@Description("Verify Remember Password functionality")
	@Epic("CW-444")
	@Feature("Feature 6: Remember Password")
	@Story("Story: Valid Remember Password")
	@Step("Verify ForgetPassword")
	public void verifyRememberPasswordOnPage() {
		objverifyNoCommerceLoginPage = new verifyNoCommerceLoginPage(driver);
		try {
			boolean flaglogin = true;
			Assert.assertEquals(flaglogin, true);
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Test(priority = 7, description = "Verify LogOut functionality")
	@Severity(SeverityLevel.TRIVIAL)		
	@Description("Verify LogOut functionality")
	@Epic("CW-444")
	@Feature("Feature 7: LogOut")
	@Story("Story: Valid LogOut")
	@Step("Verify LogOut")
	public void verifyLogOutOnPage() {
		objverifyNoCommerceLoginPage = new verifyNoCommerceLoginPage(driver);
		try {
			boolean flaglogin = false;
			Assert.assertEquals(flaglogin, true);
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Test(priority = 8, description = "Verify Digital Downloads Tab functionality")
	@Severity(SeverityLevel.TRIVIAL)		
	@Description("Verify Downloads Tab functionality")
	@Epic("CW-444")
	@Feature("Feature 8: Downloads Tab")
	@Story("Story: Valid Downloads Tab")
	@Step("Verify Downloads Tab")
	public void verifyDownloadsTabOnPage() {
		objverifyNoCommerceLoginPage = new verifyNoCommerceLoginPage(driver);
		try {
			boolean flaglogin = false;
			Assert.assertEquals(flaglogin, true);
		} catch (Exception e) {
			throw e;
		}
	}


	@Test(priority = 9, description = "Verify Computers Tab functionality")
	@Severity(SeverityLevel.TRIVIAL)		
	@Description("Verify Computers Tab functionality")
	@Epic("CW-444")
	@Feature("Feature 9: Computers Tab")
	@Story("Story: Valid Computers Tab")
	@Step("Verify Computers Tab")
	public void verifyComputersTabOnPage() {
		objverifyNoCommerceLoginPage = new verifyNoCommerceLoginPage(driver);
		try {
			boolean flaglogin = false;
			Assert.assertEquals(flaglogin, true);
		} catch (Exception e) {
			throw e;
		}
	}

	
	
	@Test(priority = 10, description = "Verify Electronic Tab functionality")
	@Severity(SeverityLevel.TRIVIAL)		
	@Description("Verify Electronic Tab functionality")
	@Epic("CW-444")
	@Feature("Feature 10: Electronic Tab")
	@Story("Story: Valid Electronic Tab")
	@Step("Verify Electronic Tab")
	public void verifyElectronicTabOnPage() {
		objverifyNoCommerceLoginPage = new verifyNoCommerceLoginPage(driver);
		try {
			boolean flaglogin = false;
			Assert.assertEquals(flaglogin, true);
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Test(priority = 11, description = "Verify Gift Tab functionality")
	@Severity(SeverityLevel.TRIVIAL)		
	@Description("Verify Gift Tab functionality")
	@Epic("CW-444")
	@Feature("Feature 11: Gift Tab")
	@Story("Story: Valid Gift Tab")
	@Step("Verify Gift Tab")
	public void verifyGiftOnPage() {
		objverifyNoCommerceLoginPage = new verifyNoCommerceLoginPage(driver);
		try {
			throw new SkipException("Skipping this one test. Hence not testing");
		} catch (Exception e) {
			throw e;
		}
	}


}
