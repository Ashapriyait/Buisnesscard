package com.manager;

import com.base.BaseClass;
import com.pages.AddContactPage;
import com.pages.CompanyDirectoryPage;
import com.pages.CompanySignUpPage;
import com.pages.ForgetPasswordPage;
import com.pages.LeadsPage;
import com.pages.PersionalSignUpPage;
import com.pages.LoginPage;
import com.pages.SystemPreferencePage;
import com.pages.UpdateAndEditPage;

public class PageObjectManager extends BaseClass {
	
	private LoginPage signInPage;
	private PersionalSignUpPage persionalSignUp;
	private CompanySignUpPage companySignUpPage;
	private UpdateAndEditPage updateAndEditPage;
	private AddContactPage addContactPage;
	private LeadsPage leadsPage;
	private SystemPreferencePage systemPreferencePage;
	private ForgetPasswordPage forgetPasswordPage;
	private CompanyDirectoryPage companyDirectoryPage;
	
	
	
	
	

	public CompanyDirectoryPage getCompanyDirectoryPage() {
		return (companyDirectoryPage==null)?companyDirectoryPage=new CompanyDirectoryPage():companyDirectoryPage;
	}

	public ForgetPasswordPage getForgetPasswordPag() {
		return (forgetPasswordPage==null)?forgetPasswordPage=new ForgetPasswordPage():forgetPasswordPage;
	}

	public SystemPreferencePage getSystemPreferencePage() {
		return (systemPreferencePage==null)?systemPreferencePage=new SystemPreferencePage():systemPreferencePage;
	}

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

	public LoginPage getLoginInPage() {
		return (signInPage==null)?signInPage = new LoginPage():signInPage;
	}
	
	
	
	
}
