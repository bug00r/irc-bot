package de.bug0r.terminal.controller.event.listener.impl.gui.worker.impl;

import javax.swing.JFrame;

import de.bug0r.terminal.controller.event.listener.worker.Worker;
import de.bug0r.terminal.view.toolkit.ViewComponent;
import de.bug0r.terminal.view.toolkit.ViewToolkit;

public class ShowTerminalFrameWorker implements Worker {

	@Override
	public void doIt(Object data) {
		if ( frame == null ) frame = (JFrame) ViewToolkit.getInstance().getComponent(ViewComponent.MAIN_FRAME);
		new Thread(new Runnable(){

			@Override
			public void run() {
				ShowTerminalFrameWorker.this.frame.setVisible(true);		
			}
			
		}).start();
	}

	private JFrame frame;
	
}
