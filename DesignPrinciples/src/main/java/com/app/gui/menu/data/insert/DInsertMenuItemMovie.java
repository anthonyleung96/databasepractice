package com.app.gui.menu.data.insert;

import java.awt.event.ActionEvent;

import com.app.bases.MenuItemBase;
import com.app.gui.menu.frames.VerticalFieldsFrame;
import com.app.product.MovieCol;

@SuppressWarnings("serial")
public class DInsertMenuItemMovie extends MenuItemBase {

	private static final String DISPLAY_NAME = "Movie";
	
	public DInsertMenuItemMovie() {
		super(DISPLAY_NAME);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VerticalFieldsFrame frame = new VerticalFieldsFrame(DISPLAY_NAME + " Fields", MovieCol.class.getEnumConstants());
		frame.start();
	}
}