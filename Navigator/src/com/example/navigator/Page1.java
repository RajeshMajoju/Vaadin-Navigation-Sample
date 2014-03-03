package com.example.navigator;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

public class Page1 extends VerticalLayout implements View {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Page1(String str){
		addComponent(new Label(str));
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		Notification.show("Showing Page1" );
	}

}
