package com.example.navigator;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

public class Welcome extends VerticalLayout implements View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Navigator navigator;
	Label name=new Label();
	public Welcome(String str){
		Button gotoPage1= new Button("page1");
		Button gotoPage2= new Button("page2");
		Button gotoPage3= new Button("window");
		
		gotoPage1.addClickListener(new ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				navigator.navigateTo("page1");
			}
		});
		
		gotoPage2.addClickListener(new ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				navigator.navigateTo("page2");
			}
		});
		
		gotoPage3.addClickListener(new ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				navigator.navigateTo("window");
			}
		});
		
		addComponent(new Label("Welcome"));
		name.setValue(str);
		addComponent(name);
		addComponent(gotoPage1);
		addComponent(gotoPage2);
		addComponent(gotoPage3);
		
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		Notification.show("Showing welcome Page");
		navigator=event.getNavigator();
	}

}
