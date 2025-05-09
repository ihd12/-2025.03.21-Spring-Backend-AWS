package 자바프로그래밍활용;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ColorPoint extends Point{
	String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	void setPoint(int x, int y) {
		super.move(x,y);
	}
	void setColor(String color) {
		this.color = color;
	}
	void show() {
		System.out.println(color+"색으로 ("+super.getX()+", 20)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
	    cp.setPoint(10, 20);
	    cp.setColor("GREEN");
	    cp.show();
	}
	
	

	

}








