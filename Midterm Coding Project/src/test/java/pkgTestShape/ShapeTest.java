package pkgTestShape;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class ShapeTest{
	// Unit Test for Rectangle

	@Test
	public void getterRecTest() {
		Rectangle r = new Rectangle (5, 6);
		assertEquals (6, r.getiLength());
		assertEquals (5, r.getiWidth());
		
	}
	@Test (expected = IllegalArgumentException.class)
	public void RectangleConstrationTest() {
		Rectangle r = new Rectangle(-7, -2);
		Rectangle a = new Rectangle (7, -2);
		Rectangle b = new Rectangle (-2, 7);
	}
		
		
	@Test
	public void setterRecTest() {
		Rectangle r = new Rectangle (30, 40);
		r.setiWidth(30);
		r.setiLength(40);
		
		assertEquals (30, r.getiWidth());
		assertEquals (40, r.getiLength());
	}
	
	@Test
	public void areaRecTest() {
		Rectangle r = new Rectangle (2,4);
		assertEquals (8, (int)r.area());
	}
	@Test
	public void perimeterRecTest() {
		Rectangle r = new Rectangle (6,7);
		assertEquals (26, (int) r.perimeter());
	}
	@Test
	public void CompareToRecTest() {
		ArrayList<Rectangle> r =new ArrayList<Rectangle>();
	
		for(int i = 0; i < 10; i++) {
			int iWidth = ThreadLocalRandom.current().nextInt(1,10+1);
			int iLength = ThreadLocalRandom.current().nextInt(1,10+1);
			
			r.add(new Rectangle(iWidth, iLength));
		}
	}
	
	
	// Unit Test for Cuboid File
	@Test
	public void getterCubTest() {
		Cuboid c = new Cuboid (5, 6, 2);
		assertEquals (6, c.getiLength());
		assertEquals (5, c.getiWidth());
		assertEquals (2, c.getiDepth());
		
	}
	@Test
	public void setterCubTest() {
		Cuboid c = new Cuboid (3, 5, 6);
		c.setiWidth(3);
		c.setiLength(5);
		c.setiDepth(6);
		
		assertEquals (3, c.getiWidth());
		assertEquals (5, c.getiLength());
		assertEquals (6, c.getiDepth());
	}
	
	@Test
	public void areaCubTest() {
		Cuboid c = new Cuboid (2,4,7);
		assertEquals (100, (int)c.area());
	}
	@Test
	public void volumeCubTest() {
		Cuboid c = new Cuboid (4,5,6);
		assertEquals (120, (int)c.volume());
	}
	@Test
	public void perimeterCubTest() {
		String thrown = "";
		Cuboid c = new Cuboid (4,5,6);
		try {
			c.perimeter();
		}
		catch (UnsupportedOperationException e) {
			thrown = "invalid";
		}
	assertEquals ("invalid", thrown);
	}
	
	@Test
	public void CompareToCubTest() {
		ArrayList<Cuboid> c =new ArrayList<Cuboid>();
	
		for(int i = 0; i < 10; i++) {
			int iWidth = ThreadLocalRandom.current().nextInt(1,10+1);
			int iLength = ThreadLocalRandom.current().nextInt(1,10+1);
			int iDepth = ThreadLocalRandom.current().nextInt(1,10+1);
			
			c.add( new Cuboid(iWidth, iLength, iDepth));
		}
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void CuboidConstrationTest() {
		Cuboid r = new Cuboid (7, 2, -1);
		Cuboid a = new Cuboid (7, -2 , 7);
		Cuboid b = new Cuboid (2, 7, 0);
	}
	
}