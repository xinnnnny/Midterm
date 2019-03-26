package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	private int iDepth;
	
	public Cuboid(int x, int y, int z) {
		super(x, y);
		if(z >0)
			this.iDepth = z;
		else 
			throw new IllegalArgumentException("Depth must be positive");
	}
	
	public int getiDepth() {
		return iDepth;
	}
	public void setiDepth (int Depth) {
		this.iDepth = Depth;
	}
	@Override
	public double area() {
		double side1 = super.area();
		double side2 = super.getiLength() * iDepth;
		double side3 = super.getiWidth() * iDepth;
		return (side1 + side2 + side3)*2;
	}
	public double volume() {
		return (super.area() * iDepth);
	}
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("invalid");
		}
	
	@Override
	public int compareTo(Object o) {
		Cuboid r = (Cuboid) o;
		return (int) (this.area() - r.area());
	}


	class SortByArea implements Comparator<Cuboid>{

		SortByArea() {
			
		}

		@Override
		public int compare(Cuboid a, Cuboid b) {
			// TODO Auto-generated method stub
			return  (int) (a.area() - b.area());
		}
		
		
	}
	class SortByVolume implements Comparator<Cuboid>{

		SortByVolume() {
			
		}

		@Override
		public int compare(Cuboid a, Cuboid b) {
			// TODO Auto-generated method stub
			return (int)  (a.volume() - b.volume());
		}
		
	}
}