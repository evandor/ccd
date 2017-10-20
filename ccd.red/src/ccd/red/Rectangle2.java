package ccd.red;

public class Rectangle2 {

	private double width;
	private double height;

	public Rectangle2(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWidth() {
		return this.width;
	}

	public double getPerimeter() {
		return 2 * width + 2 * height;
	}

	public double getArea() {
		return width * height;
	}

    public Rectangle2 newWithDoubleArea() {
        return new Rectangle2(this.width  * 2, this.height);
    }

}
