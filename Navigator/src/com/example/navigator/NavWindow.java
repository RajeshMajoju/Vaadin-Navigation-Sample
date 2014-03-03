package com.example.navigator;


import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class NavWindow extends Window {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NavWindow() {
	 VerticalLayout l=new VerticalLayout();
	 l.addComponent(new Label("window"));
	 
	

	}
}
