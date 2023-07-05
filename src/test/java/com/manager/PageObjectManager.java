package com.manager;

import com.base.BaseClass;
import com.pages.AddContactPage;
import com.pages.CompanySignUpPage;
import com.pages.LeadsPage;
import com.pages.PersionalSignUpPage;
import com.pages.SigninPage;
import com.pages.UpdateAndEditPage;

public class PageObjectManager extends BaseClass {
	
	private SigninPage signInPage;
	private PersionalSignUpPage persionalSignUp;
	private CompanySignUpPage companySignUpPage;
	private UpdateAndEditPage updateAndEditPage;
	private AddContactPage addContactPage;
	private LeadsPage leadsPage;
	
	
	
	
	public LeadsPage getLeadsPage() {
		return (leadsPage==null)?leadsPage=new LeadsPage():leadsPage; 
	}

	public UpdateAndEditPage getUpdateAndEditPage() {
		return (updateAndEditPage==null)?updateAndEditPage=new UpdateAndEditPage():updateAndEditPage;
	}

	public AddContactPage getAddContactPage() {
	     return (addContactPage==null)?addContactPage=new AddContactPage():addContactPage;
	
		}

	

	public CompanySignUpPage getCompanySignUpPage() {
		return (companySignUpPage==null)?companySignUpPage=new CompanySignUpPage():companySignUpPage;
	}

	public PersionalSignUpPage getPersionalSignUp() {
		return (persionalSignUp==null)?persionalSignUp=new PersionalSignUpPage():persionalSignUp;
	}

	public SigninPage getSignInPage() {
		return (signInPage==null)?signInPage = new SigninPage():signInPage;
	}
	
	
	
	
}
