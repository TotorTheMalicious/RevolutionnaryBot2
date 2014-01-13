package revolutionnarybot2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;

public class LaunchWindow extends Frame {

    private Button launchBot;
    private Runnable bot;

    public LaunchWindow() throws HeadlessException {
	try {
	    UIManager.setLookAndFeel(
		    UIManager.getSystemLookAndFeelClassName());
	} catch (Exception e) {}

	setBounds(new Rectangle(0, 0, 150, 150));
	setLocationRelativeTo(null);
	setResizable(false);

	addWindowListener(new java.awt.event.WindowAdapter() {
	    public void windowClosing(java.awt.event.WindowEvent e) {
		System.exit(0);
	    }
	});

	add(this.launchBot = new Button("Launch Bot"));
	this.launchBot.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
		if (LaunchWindow.this.bot != null) {
		    LaunchWindow.this.bot.run();
		}
	    }
	});
	setVisible(true);
    }

    public void setBot(Runnable bot) {
	this.bot = bot;
    }
}
