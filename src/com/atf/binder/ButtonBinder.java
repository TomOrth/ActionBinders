package com.atf.binder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.atf.keybinder.interfaces.Executor;
import com.atf.keybinder.interfaces.types.PropertyBinder;

public class ButtonBinder implements PropertyBinder<JButton> {
	
	public ButtonBinder(){}

	@Override
	public void bindAction(JButton prop, Executor action) {
		prop.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				action.execute();
			}
			
		});
	}
	
	
}
