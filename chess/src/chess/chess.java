package chess;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class chess {

	public static void main(String[] args) {
		
		JFrame chess = new JFrame();
		chess.setSize(600, 600);
		chess.setLayout(new GridLayout(8, 8));
		JButton spot[][] = new JButton[8][8];
		
		for (int i = 0; i<8; i++){
			for (int j = 0; j<8; j++){
				spot[i][j] = new JButton();
				
				if ((i+j)%2==0){
					spot[i][j].setBackground(Color.WHITE);
				} else {
					spot [i][j].setBackground(Color.GRAY);
				}
				
				spot[i][j].setOpaque(true);
				spot[i][j].setBorderPainted(false);
				chess.add(spot[i][j]);
			}
		}
		
		ImageIcon peonBlanco = new ImageIcon("Chess_plt60.png");
		ImageIcon peonNegro = new ImageIcon("Chess_pdt60.png");
		
		ImageIcon caballoBlanco = new ImageIcon("Chess_nlt60.png");
		ImageIcon caballoNegro = new ImageIcon("Chess_ndt60.png");
		
		ImageIcon torreBlanco = new ImageIcon("Chess_rlt60.png");
		ImageIcon torreNegro = new ImageIcon("Chess_rdt60.png");
		
		ImageIcon alfilBlanco = new ImageIcon("Chess_blt60.png");
		ImageIcon alfilNegro = new ImageIcon("Chess_bdt60.png");
		
		ImageIcon reyBlanco = new ImageIcon("Chess_klt60.png");
		ImageIcon reyNegro = new ImageIcon("Chess_kdt60.png");
		
		ImageIcon reinaBlanco = new ImageIcon("Chess_qlt60.png");
		ImageIcon reinaNegro = new ImageIcon("Chess_qdt60.png");
		
		for (int i = 0; i<8; i++){
			spot[6][i].setIcon(peonBlanco);
			spot[1][i].setIcon(peonNegro);
		}
		
		spot[7][1].setIcon(caballoBlanco);
		spot[7][6].setIcon(caballoBlanco);
		spot[0][1].setIcon(caballoNegro);
		spot[0][6].setIcon(caballoNegro);
		
		spot[7][0].setIcon(torreBlanco);
		spot[7][7].setIcon(torreBlanco);
		spot[0][0].setIcon(torreNegro);
		spot[0][7].setIcon(torreNegro);
		
		spot[7][2].setIcon(alfilBlanco);
		spot[7][5].setIcon(alfilBlanco);
		spot[0][2].setIcon(alfilNegro);
		spot[0][5].setIcon(alfilNegro);
		
		spot[7][3].setIcon(reinaBlanco);
		spot[0][3].setIcon(reinaNegro);
		
		spot[7][4].setIcon(reyBlanco);
		spot[0][4].setIcon(reyNegro);
		
		chess.setSize(600, 600);
		chess.setVisible(true);
		
	}
	
}
