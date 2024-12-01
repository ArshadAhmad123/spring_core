package com.springcore.springcore.reference;

public class B {
   public B() {
		super();
		// TODO Auto-generated constructor stub
	}

private int y;

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public B(int y) {
	super();
	this.y = y;
}

@Override
public String toString() {
	return "B [y=" + y + "]";
}

}
