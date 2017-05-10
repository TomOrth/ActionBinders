package com.atf.keybinder;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		//1. Create the frame.
		JFrame frame = new JFrame("FrameDemo");
		KeyBinder binder = new KeyBinder();
		Main main = new Main();
		binder.bindAction(KeyEvent.VK_SPACE, main::example1);
		binder.bindAction(KeyEvent.VK_0, main::example2);

		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//4. Size the frame.
		frame.setSize(500, 500);
		
		frame.addKeyListener(binder.createListener());

		//5. Show it.
		frame.setVisible(true);
	}
	
	public void example1() {
		System.out.println("Printed");
	}
	
	public void example2() {
		System.out.println("Printed again");
	}
}
