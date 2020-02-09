package com.efi.mount;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Control {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public Control() {
		EventQueue.invokeLater(() -> {
			try {
				initialize();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
