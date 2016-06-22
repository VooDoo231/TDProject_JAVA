package game.grafik;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import game.basic.gameObject.stationary.FireTower;
import game.basic.gameObject.stationary.Tower;
import game.logic.pathFinding.Box;
import game.logic.pathFinding.BoxMap;
import game.logic.position.Position;
import game.logic.position.interfaces.Positionable;

public class GUItdgame extends JFrame {
	
	private JPanel myPanel;	
	
	public GUItdgame(BoxMap map) {
		this.setLayout(null);
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setMinimumSize(new Dimension(1000, 1000));
		myPanel = new JPanel();
		myPanel.setLayout(null);	
		
		for (Entry<String, Box> key : map.entrySet()) {
			Box tempBox = map.getBoxAt(key.getKey());
			if (tempBox != null) {				
				tempBox.setLocation(tempBox.getPos().getX(), tempBox.getPos().getY());
				myPanel.add(tempBox);
			}
		}
		
		myPanel.setVisible(true);
		this.add(myPanel);
		this.setVisible(true);
	}
	
	public void run() {
		while(this.isVisible()) {
			this.resize();
		}
	}
	
	private void resize() {
		this.myPanel.setSize(this.getWidth(), this.getHeight());
	}
	
}
