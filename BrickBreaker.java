import javax.swing.JFrame;

class Main{
    public static void main(String[] arguments){
	JFrame jFrame = new JFrame();
	jFrame.setVisible(true);
	jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MapGenerator{
    MapGenerator(int row, int column){
	int[][] map = new int[row][column];
    }
}

class GamePlay{
    MapGenerator map = new MapGenerator(3, 7);

}
