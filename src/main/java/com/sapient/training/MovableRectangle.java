package com.sapient.training;

public class MovableRectangle implements Movable{
	private MovablePoint topLeft;
	private MovablePoint rightBottom;
	public MovableRectangle(int x1,int x2,int y1,int y2,int xSpeed,int ySpeed) {
		topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
		rightBottom = new MovablePoint(x2,y2,xSpeed,ySpeed);
	}
	public void moveUp() {
		topLeft.y -= topLeft.ySpeed;
		rightBottom.y -= rightBottom.ySpeed;
	}

	
	public void moveDown() {
		topLeft.y += topLeft.ySpeed;
		rightBottom.y += rightBottom.ySpeed;
	}

	@Override
	public void moveLeft() {
		topLeft.x -= topLeft.xSpeed;
		rightBottom.x -= rightBottom.xSpeed;
	}

	@Override
	public void moveRight() {
		topLeft.x += topLeft.xSpeed;
		rightBottom.x += rightBottom.xSpeed;
	}
	
	public String toString() {
		return ""+this.topLeft.x+this.rightBottom.x+this.topLeft.y+this.rightBottom.y;
	}	
}
