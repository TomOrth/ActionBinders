package com.atf.binder;

import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("FrameDemo");
		JButton btn = new JButton("Test");
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		
		btn.setBounds(100, 100, 100, 100);
		
		
		Main main = new Main();
		KeyBinder binder = new KeyBinder();
		ButtonBinder btnBinder = new ButtonBinder();
		MouseBinder mouseBinder = new MouseBinder();
		
		binder.bindAction(KeyEvent.VK_SPACE, main::key1);
		binder.bindAction(KeyEvent.VK_0, main::key2);
		
		btnBinder.bindAction(btn, main::btnExample);
		
		mouseBinder.addAction(main::mouse1);
		mouseBinder.addAction(main::mouse2);

		frame.addKeyListener(binder);
		frame.addMouseListener(mouseBinder);
		//frame.add(btn);
		frame.setVisible(true);
	}
	
	public void key1() {
		System.out.println("Printed");
	}
	
	public void key2() {
		System.out.println("Printed again");
	}
	
	public void btnExample() {
		System.out.println("Btn pressed");
	}
	
	public void mouse1() {
		System.out.println("Mouse Clicked");
	}
	
	public void mouse2() {
		System.out.println("Mouse Clicked Again");
	}
}
