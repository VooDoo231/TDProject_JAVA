package game.grafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

public class GUItdgame extends JFrame{
	
	
	
	private JPanel panel;
	
	public GUItdgame(BoxMap map) {
		this.setLayout(null);
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setMinimumSize(new Dimension(950, 1000));
		panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(950, 1000);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("TEST: X: " + e.getX() + " Y: " +  e.getY());
				System.out.println("FoundBox:" + map.findBox(e.getX(), e.getY()));
				super.mouseClicked(e);
			}
		});
		
		for (Entry<String, Box> element : map.entrySet()) {
			System.out.println( element.getValue().toString());
			element.getValue().setVisible(true);
			panel.add(element.getValue());
		}
		map.getBoxAt("0 0").setTower(new FireTower(new Position(0, 0)));
		
		panel.setBackground(Color.BLUE);
		panel.setVisible(true);
		this.add(panel);
		this.setVisible(true);
	}
	
	public void run() {
		while(this.isVisible()) {
			this.resize();
			this.repaint();
		}
	}
	
	private void resize() {
		this.panel.setSize(this.getWidth(), this.getHeight());
	}	
}
