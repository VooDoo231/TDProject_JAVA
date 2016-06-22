package game.grafik;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Map.Entry;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import game.basic.gameObject.stationary.FireTower;
import game.logic.pathFinding.Box;
import game.logic.pathFinding.BoxMap;
import game.logic.position.Position;

public class GUItdgame extends JFrame {
	
	private JPanel myPanel;	
	
	public GUItdgame(BoxMap map) {
		this.setLayout(null);
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setMinimumSize(new Dimension(950, 950));
		myPanel = new JPanel();
		myPanel.setLayout(null);
		myPanel.setSize(950, 950);
		
		
		for (Entry<String, Box> element : map.entrySet()) {
			System.out.println( element.getValue().toString());
			element.getValue().setVisible(true);
			myPanel.add(element.getValue());
		}
		map.getBoxAt("0 0").setTower(new FireTower(new Position(0, 0)));
		
		myPanel.setBackground(Color.BLUE);
		myPanel.setVisible(true);
		this.add(myPanel);
		this.setVisible(true);
	}
	
	public void run() {
		while(this.isVisible()) {
			this.resize();
			this.repaint();
		}
	}
	
	private void resize() {
		this.myPanel.setSize(this.getWidth(), this.getHeight());
	}
	
}
