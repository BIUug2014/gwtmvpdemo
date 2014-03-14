package com.example.gwtmvpdemo.client.view;

import com.example.gwtmvpdemo.client.presenter.PersonDetailsPresenter.Display;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasEnabled;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class PersonDetailsView extends Composite implements Display {
	
	private final Button personDetailsButton;
	private final Button sayHelloButton;
	private final Label HelloLabel;
	
	public PersonDetailsView() {

		VerticalPanel mainPanel = new VerticalPanel();
		initWidget(mainPanel);
		personDetailsButton = new Button("Person details");
		//new
		sayHelloButton = new Button(" Say Hello ");
		HelloLabel = new Label(" Waiting to say Hello ");
		//---
		mainPanel.add(personDetailsButton);
		//new
		mainPanel.add(sayHelloButton);
		mainPanel.add(HelloLabel);
		//---
	}

	@Override
	public HasClickHandlers getPersonDetailsButton() {
		return personDetailsButton;
	}
	
	@Override
	public Widget asWidget(){
		return this;
	}
	//new
	@Override
	public HasClickHandlers getSayHelloButton() {
		return sayHelloButton;
	}

	@Override
	public HasText getHelloLabel() {
		return HelloLabel;
	}

	@Override
	public HasEnabled getPersonDetailsEnabledButton() {
		return sayHelloButton; //personDetailsButton; <-- blocks view changing
	}
	//---
}
