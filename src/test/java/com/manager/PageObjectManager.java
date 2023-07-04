package com.manager;

import com.base.BaseClass;
import com.pages.AddContactPage;
import com.pages.CompanySignUpPage;
import com.pages.PersionalSignUpPage;
import com.pages.SigninPage;
import com.pages.UpdateAndEditPage;

public class PageObjectManager extends BaseClass {
	
	private SigninPage signInPage;
	private PersionalSignUpPage persionalSignUp;
	private CompanySignUpPage companySignUpPage;
	private UpdateAndEditPage yujjCardHomePage;
	private AddContactPage addContactPage;


	
		
	public AddContactPage getAddContactPage() {
	     return (addContactPage==null)?addContactPage=new AddContactPage():addContactPage;
	
		}

	public UpdateAndEditPage getYujjCardHomePage() {
		return (yujjCardHomePage==null)?yujjCardHomePage=new UpdateAndEditPage():yujjCardHomePage;
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
