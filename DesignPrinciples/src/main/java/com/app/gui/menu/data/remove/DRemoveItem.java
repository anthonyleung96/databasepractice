package com.app.gui.menu.data.remove;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import com.app.gui.bases.MenuItemBase;

@SuppressWarnings("serial")
public class DRemoveItem extends MenuItemBase {

	private static final String DISPLAY_NAME = "Remove";
	
	public DRemoveItem() {
		super(DISPLAY_NAME);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
        String name = (String)JOptionPane.showInputDialog(
                getParent(),
                "What's the product you're looking to remove? \n "
                + "(A book, album, or movie)",
                "Removing Entry",
                JOptionPane.PLAIN_MESSAGE);
        // Check what happens if cancel is selected
        // TODO: Find which table it's in via DB helper
        // TODO: Delete the entry from everywhere
	}

}
