package com.app.gui;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;

import com.app.gui.bases.FrameBase;

/**
 * This launches a GUI to handle SQL queries and requests given the database connection
 * 
 * @author antho
 *
 */
@SuppressWarnings("serial")
public class MainMenuSQL extends FrameBase {
	
	private static final int FONTSIZE = 25;
	private static final String WELCOME_MSG = "<html> Welcome! <br> "
			+ "<br> Please click one of the options "
			+ "<br> in the top left menu to get started :) </html>";
	
	private FlowLayout layout;
	private JLabel help;
	private Font font = new Font(Font.DIALOG, Font.PLAIN, FONTSIZE);;

	public MainMenuSQL (String connection) {
		super("Embedded SQL GUI for " + connection);
		
		layout = new FlowLayout(FlowLayout.CENTER);
		super.setLayout(layout);
		
		help = new JLabel(WELCOME_MSG);
		help.setFont(font);
		
		super.add(help);
		super.setJMenuBar(new DBMenuBar());
	}
}
