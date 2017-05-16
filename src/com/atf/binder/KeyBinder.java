package com.atf.binder;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import com.atf.keybinder.interfaces.Executor;
import com.atf.keybinder.interfaces.types.PropertyBinder;

public class KeyBinder implements KeyListener, PropertyBinder<Integer> {
	private HashMap<Integer, Executor> actions;
	
	public KeyBinder() {
		actions = new HashMap<Integer, Executor>();
	}
	
	public void bindAction(Integer prop, Executor action){
		actions.put(prop, action);
	}

	public void keyTyped(KeyEvent e) {
		
	}
	    

	public void keyPressed(KeyEvent e) {
   		if (actions.containsKey(e.getKeyCode())) actions.get(e.getKeyCode()).execute();
    }

	public void keyReleased(KeyEvent e) {
	    
	}
}
