package org.Stepdefinition;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BistoPojo extends BaseClass{
	
	public BistoPojo() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="(//li[@class='lte-nav-profile '])[2]")
	private WebElement AccountBtn;
	@FindBy(xpath="(//a[@href='https://bistrobitesdc.com/login'])[2]")
	private WebElement Account;
	@FindBy(id="menu-item-14249")
	private WebElement Home;
	@FindBy(xpath="//button[@class='js-cookie-consent-agree cookie-consent__agree']")
	private WebElement Cookies;
	@FindBy(id="lte-top-search-ico")
	private WebElement Searchicon;
	@FindBy(xpath=("(//input[@type='text'])[2]"))
	private WebElement SearchBox;
	@FindBy(id="menu-item-3557")
	private WebElement OurStory;
	@FindBy(xpath="//a[@href='https://bistrobitesdc.com/itemlist?cat=10']")
	private WebElement Dosa;
	@FindBy(xpath="//ul[@class='woocommerce-error']")
	private WebElement alert1;
	@FindBy(xpath="(//p[@class='form-row'])[2]")
	private WebElement alert2;
	@FindBy(xpath="(//h2[@class='woocommerce-loop-product__title'])[1]")
	private WebElement MasalaDosa;
	@FindBy(xpath="//span[@style='padding: 5px 10px;border: 1px solid #e7e7e7;font-size: 12px;']")
	private WebElement Time;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement Username;
	@FindBy(id="password")
	private WebElement Password;
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement Login;
	@FindBy(id="name")
	private WebElement Name;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="password_reg")
	private WebElement RegPswd;
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement PhoneNo;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Register;
	@FindBy(xpath="(//span[@class='woocommerce-Price-amount amount'])[1]")
	private WebElement CanPrice;
	@FindBy(xpath="//span[@class='woocommerce-Price-amount amount']")
	private WebElement SpanishOmeletPrice;
	@FindBy(xpath="(//h3[@class='lte-header'])[1]")
	private WebElement Scrolldown;
	public WebElement getAccountBtn() {
		return AccountBtn;
	}
	public WebElement getAccount() {
		return Account;
	}
	public WebElement getHome() {
		return Home;
	}
	public WebElement getCookies() {
		return Cookies;
	}
	public WebElement getSearchicon() {
		return Searchicon;
	}
	public WebElement getSearchBox() {
		return SearchBox;
	}
	public WebElement getOurStory() {
		return OurStory;
	}
	public WebElement getDosa() {
		return Dosa;
	}
	public WebElement getalert1() {
		return alert1;
	}
	public WebElement getalert2() {
		return alert2;
	}
	public WebElement getMasalaDosa() {
		return MasalaDosa;
	}
	public WebElement getTime() {
		return Time;
	}
	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLogin() {
		return Login;
	}
	public WebElement getName() {
		return Name;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getRegPswd() {
		return RegPswd;
	}
	public WebElement getPhoneNo() {
		return PhoneNo;
	}
	public WebElement getRegister() {
		return Register;
	}
	public WebElement getCanPrice() {
		return CanPrice;
	}
	public WebElement getSpanishOmeletPrice() {
		return SpanishOmeletPrice;
	}
	public WebElement getScrolldown() {
		return Scrolldown;
	}
}
