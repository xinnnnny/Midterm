package pkgShape;

public class Rectangle extends Shape implements Comparable<Object>{
	private int iWidth;
	
	private int iLength;
	
	public Rectangle(int x, int y) {
		if(x >0 || y > 0 ) {
			this.iWidth = x;
			this.iLength = y;
		}
		else {
			throw new IllegalArgumentException("invalid");
		}
		
	}
	
	public int getiWidth() {
		return iWidth;
	}
	public void setiWidth(int Width) {
		this.iWidth = Width;
	}
	public int getiLength() {
		return iLength;
	}
	public void setiLength (int Length) {
		if (iLength > 0) 
			this.iLength = Length;
		else 
			throw new IllegalArgumentException("Length must be positive");
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		int a = getiWidth() * getiLength();
		return a;
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(iWidth + iLength);
	}

	@Override
	public int compareTo(Object o) {
		Rectangle r = (Rectangle) o;
		return (int) (this.area() - r.area());
	}
}
