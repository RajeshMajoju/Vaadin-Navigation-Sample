package com.example.navigator;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("navigator")
public class NavigatorUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = NavigatorUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		Navigator navigator=new Navigator(this,this);
		navigator.addView("",new Welcome("This is rajesh"));
		navigator.addView("page1",new Page1("This is page 1"));
		navigator.addView("page2",new Page2("This is page 2"));
		
		
	}

}