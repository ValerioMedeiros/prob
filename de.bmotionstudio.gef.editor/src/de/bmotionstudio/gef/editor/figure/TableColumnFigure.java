package de.bmotionstudio.gef.editor.figure;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class TableColumnFigure extends AbstractTableFigure {

	public TableColumnFigure() {
		ToolbarLayout toolbarLayout = new ToolbarLayout();
		setLayoutManager(toolbarLayout);
		setOpaque(true);
	}

	@Override
	protected void paintBorder(Graphics g) {
		Rectangle r = getClientArea();
		Color foregroundColor = getForegroundColor();
		if (foregroundColor != null)
			g.setForegroundColor(foregroundColor);
		g.drawLine(r.x, r.y, r.x + r.width, r.y);
		g.drawLine(r.x, r.y, r.x, r.y + r.height - 1);
		g.drawLine(r.x, r.y + r.height - 1, r.x + r.width, r.y + r.height - 1);
		super.paintBorder(g);
	}

}