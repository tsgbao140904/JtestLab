package a_Introductory;

public class Vector2D {
	public Integer x, y;
	
	// Constructor với tọa độ x, y
	public Vector2D(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	// Constructor lấy từ hai điểm
	public Vector2D(Point p1, Point p2) {
		this.x = p2.x - p1.x;
		this.y = p2.y - p1.y;
	}
	// Tính dot product giữa 2 vector
	public int dotProduct(Vector2D v) {
		return (x * v.x) + (y * v.y); // Đúng công thức dot product: x1*x2 + y1*y2
										// Sai: bạn nhân nhầm (y * v.x) thay vì (y * v.y)
	}
	// Kiểm tra trực giao: dot product == 0
	public boolean isOrthogonalTo(Vector2D v) {	
		return dotProduct(v) == 0; // Đúng: 2 vector trực giao khi dot product = 0
									// Sai: kiểm tra == -1 là không đúng cho trực giao
	}
}

/* public class Vector2D {
	public Integer x, y;  // ⚠️ Dùng Integer là không cần thiết (primitive int sẽ tốt hơn)
	
	public Vector2D(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	public Vector2D(Point p1, Point p2) {
		this.x = p2.x - p1.x;
		this.y = p2.y - p1.y;
	}

	public int dotProduct(Vector2D v) {
		return (x * v.x) + (y * v.x); // ⚠️ Sai: y nhân với v.x (phải là y * v.y)
	}

	public boolean isOrthogonalTo(Vector2D v) {
		return dotProduct(v) == -1; // ⚠️ Sai: trực giao khi dotProduct = 0
	}
} */