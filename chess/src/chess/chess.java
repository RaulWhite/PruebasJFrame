package chess;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class chess {

	public static void main(String[] args) {
		
		JFrame chess = new JFrame();
		chess.setSize(400, 400);
		chess.setLayout(new GridLayout(8, 8));
		JButton spot[][] = new JButton[8][8];
		
		for (int i = 0; i<8; i++){
			for (int j = 0; j<8; j++){
				spot[i][j] = new JButton();
				
				if ((i+j)%2==0){
					spot[i][j].setBackground(Color.WHITE);
				} else {
					spot [i][j].setBackground(Color.BLACK);
				}
				
				chess.add(spot[i][j]);
			}
		}
		
		chess.setSize(400, 400);
		chess.setVisible(true);
		
	}
	
}