import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

class Main{
    public static void main(String[] arguments){
	JFrame jFrame = new JFrame();
	GamePlay gamePlay = new GamePlay();

	jFrame.setVisible(true);
	jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jFrame.add(gamePlay);
    }
}

class MapGenerator{
    int map[][];
    int brickWidth = 80;
    int brickHeight = 50;

    public MapGenerator(int row, int column){
	map = new int[row][column];

	/* Arrays.fill(map, 1); */
	for (int i = 0; i < map.length; i++){
	    System.out.println(i);
	    for (int j = 0; j < map[0].length; j++){
		map[i][j] = 1;
		System.out.println(map[i][j]);
	    }
	}
    }

    /* draws bricks into memory buffer */
    void draw(Graphics2D graphics2D){

	for (int i = 0; i < this.map.length; i++){
	    for (int j = 0; j < map[0].length; j++){
		if (map[i][j] > 0){
		    /* brick color */
		    graphics2D.setColor(new Color(0xff8787));
		    /* public abstract void fillRect(int x, int y, int width, int height); */
		    graphics2D.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
		}
	    }
	}

	System.out.println("Draw !");
    }

}

class GamePlay extends JPanel{
    MapGenerator map = new MapGenerator(3, 7);

    /* paint graphics memory buffer into screen */
    public void paint(Graphics graphics){
	map.draw((Graphics2D)graphics);
    }
}
