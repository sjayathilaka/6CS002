package sj1432284;

public class GuessDomino {
	
	Main main=new Main();
	
	 void collateGuessGrid() {
		    for (int r = 0; r < 7; r++) {
		      for (int c = 0; c < 8; c++) {
		        main.gg[r][c] = 9;
		      }
		    }
		    for (Domino d : main._g) {
		      if (d.placed) {
		        main.gg[d.hy][d.hx] = d.high;
		        main.gg[d.ly][d.lx] = d.low;
		      }
		    }
		  }


}
