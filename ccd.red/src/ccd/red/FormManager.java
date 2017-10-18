package ccd.red;

import java.util.List;

public class FormManager {

	private List<Rectangle2> rectangles;

	public FormManager(List<Rectangle2> rectangles) {
		this.rectangles = rectangles;
	}

	public Double sumUpArea() {
		return this.rectangles.stream().map(r -> r.getArea()).reduce((a,b) -> a + b).get();
	}

	public Double sumUpPerimeter() {
		return this.rectangles.stream().map(r -> r.getPerimeter()).reduce((a,b) -> a + b).get();
	}

	public void doubleAllAreas() {
		
	}


	
}
