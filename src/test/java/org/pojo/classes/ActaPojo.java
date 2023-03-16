package org.pojo.classes;

import org.bas.classes.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActaPojo extends BaseClass {

	public ActaPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement usename;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement logbutt;
	
	@FindBy(id="location")
	private WebElement locat;
	
	@FindBy(id="hotels")
	private WebElement hot;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(id="datepick_in")
	private WebElement datein;
		
	@FindBy(id="datepick_out")
	private WebElement dateout;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	
	@FindBy(id="continue")
	private WebElement continues;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
		@FindBy(id="address")
	private WebElement addre;
	
		@FindBy(id="cc_num")
		private WebElement ccnum;
		
		@FindBy(id="cc_type")
		private WebElement cctype;
		
		@FindBy(id="cc_exp_month")
		private WebElement ccexpmonth;
		
		@FindBy(id="cc_exp_year")
		private WebElement ccexpyear;
		
		@FindBy(id="cc_cvv")
		private WebElement cccvv;
		
		@FindBy(id="book_now")
		private WebElement booknow;
		
		@FindBy(name="order_no")
		private WebElement orderno;
		
		
	public WebElement getOrderno() {
			return orderno;
		}

	public WebElement getContinues() {
			return continues;
		}

		public void setContinues(WebElement continues) {
			this.continues = continues;
		}

		public WebElement getRadio() {
			return radio;
		}

		public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getAddre() {
			return addre;
		}

		public WebElement getCcnum() {
			return ccnum;
		}

		public WebElement getCctype() {
			return cctype;
		}

		public WebElement getCcexpmonth() {
			return ccexpmonth;
		}

		public WebElement getCcexpyear() {
			return ccexpyear;
		}

		public WebElement getCccvv() {
			return cccvv;
		}

		public WebElement getBooknow() {
			return booknow;
		}

	public WebElement getUsename() {
		return usename;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogbutt() {
		return logbutt;
	}

	public WebElement getLocat() {
		return locat;
	}

	public WebElement getHot() {
		return hot;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
}
