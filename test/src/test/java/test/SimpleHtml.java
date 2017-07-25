package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Test;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import junit.framework.Assert;

public class SimpleHtml {
	
//	@Test
//	public void Verify() {
//		
//		
//		try {
//			WebClient driver = new WebClient();
//			final HtmlPage page = driver.getPage("http://htmlunit.sourceforge.net");
//			System.out.println(page.getTitleText());
//			//Assert.assertEquals("HtmlUnit – Welcome to HtmlUnit", page.getTitleText());
//		
//		} catch (FailingHttpStatusCodeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
	@Test
	public void testCodesCrud()
	    throws MalformedURLException, IOException {

	    WebClient client = new WebClient();

	    // first entry to view page
	    HtmlPage viewPage = client.getPage("http://www.google.fr");

	    //assertEquals("Codes View Page", viewPage.getTitleText());
	    System.out.println(viewPage.getTitleText());
	
		
	}
	

	

}
