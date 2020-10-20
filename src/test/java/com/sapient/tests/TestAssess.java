package com.sapient.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sapient.training.Movable;
import com.sapient.training.MovableCircle;
import com.sapient.training.MovablePoint;
import com.sapient.training.MovableRectangle;

public class TestAssess {

	@Test
	void TestMovablePoint() {
		Movable m1 = new MovablePoint(5, 6, 10, 15);
		Assertions.assertEquals("561015", m1.toString());
		m1.moveLeft();
		Assertions.assertEquals("-561015", m1.toString());
		m1.moveRight();
		Assertions.assertEquals("561015", m1.toString());
		m1.moveUp();
		Assertions.assertEquals("5-91015", m1.toString());
		m1.moveDown();
		Assertions.assertEquals("561015", m1.toString());
	}

	@Test
	void TestMovableCircle() {
		Movable m2 = new MovableCircle(1, 2, 3, 4, 20); // upcast
		Assertions.assertEquals("123420", m2.toString());
		m2.moveLeft();
		Assertions.assertEquals("-223420", m2.toString());
		m2.moveRight();
		Assertions.assertEquals("123420", m2.toString());
		m2.moveUp();
		Assertions.assertEquals("1-23420", m2.toString());
		m2.moveDown();
		Assertions.assertEquals("123420", m2.toString());
	}

	@Test
	void TestMovableRectangle() {
		Movable m3 = new MovableRectangle(0, 2, 0, 2, 4, 4);
		Assertions.assertEquals("0202", m3.toString());
		m3.moveLeft();
		Assertions.assertEquals("-4-202", m3.toString());
		m3.moveRight();
		Assertions.assertEquals("0202", m3.toString());
		m3.moveUp();
		Assertions.assertEquals("02-4-2", m3.toString());
		m3.moveDown();
		Assertions.assertEquals("0202", m3.toString());

	}
}
