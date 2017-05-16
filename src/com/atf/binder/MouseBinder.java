package com.atf.binder;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;

import com.atf.keybinder.interfaces.Executor;
import com.atf.keybinder.interfaces.types.Binder;

public class MouseBinder implements MouseListener, Binder{

	private LinkedList<Executor> actions;
	
	public MouseBinder() {
		actions = new LinkedList<Executor>();
	}
	
	@Override
	public void addAction(Executor action) {
		actions.add(action);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		for (Executor action : actions) {
			action.execute();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
