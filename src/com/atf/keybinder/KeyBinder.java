package com.atf.keybinder;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import com.atf.keybinder.interfaces.Executor;

public class KeyBinder {
	private HashMap<Integer, Executor> actions;
	
	public KeyBinder() {
		actions = new HashMap<Integer, Executor>();
	}
	
	public void bindAction(Integer e, Executor exe){
		actions.put(e, exe);
	}
	
	public KeyListener createListener(){
		return new KeyListener(){
		    public void keyTyped(KeyEvent e) {
		    
		    }

		    public void keyPressed(KeyEvent e) {
		    	if(actions.containsKey(e.getKeyCode())) actions.get(e.getKeyCode()).execute();
		    }

		    public void keyReleased(KeyEvent e) {
		    
		    }
		};
	}
}
