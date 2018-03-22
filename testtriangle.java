package cn.tju.scs;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Before;
import org.junit.Test;

public class testtriangle {
	public triangle tr = new triangle();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTrangle() {
		assertEquals("equilateral", tr.triangles(3, 3, 3));
		assertEquals("isosceles", tr.triangles(3, 2, 2));
		assertEquals("scalene", tr.triangles(3, 4, 2));
		assertEquals("Non-triangular", tr.triangles(2, 2, 4));
	}


}
