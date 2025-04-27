package a_Introductory;

import org.junit.Before;
import org.junit.Test; // Thêm import này
import static org.junit.Assert.*; // Đảm bảo import đủ bộ JUnit

public class PointTest {
	Point p1, p2, p3;

	@Before
	public void setUp() throws Exception {
		p1 = new Point(7, 9);
		p2 = new Point(-3, -30);
		p3 = new Point(-10, 3);
	}

	@Test
	public void testAdd() {
		Point res1 = p1.add(p2); // (7 + -3, 9 + -30) = (4, -21)
		Point res2 = p1.add(p3); // (7 + -10, 9 + 3) = (-3, 12)

		assertEquals(4, (int) res1.x);
		assertEquals(-21, (int) res1.y);
		assertEquals(-3, (int) res2.x);
		assertEquals(12, (int) res2.y);  //  sửa chỗ này từ x -> y
	}

	@Test
	public void testSub() {
		Point res1 = p1.sub(p2); // (7 - -3, 9 - -30) = (10, 39)
		Point res2 = p1.sub(p3); // (7 - -10, 9 - 3) = (17, 6)

		assertEquals(10, (int) res1.x); // 7 - (-3)
		assertEquals(39, (int) res1.y); // 9 - (-30)
		assertEquals(17, (int) res2.x); // 7 - (-10)
		assertEquals(6, (int) res2.y); // 9 - 3
	}
}
