package com.can.jdfa.gui;

public class EmptyTarget implements Target{
	private int x;
	private int y;
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x=x;
	}
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y=y;
	}
	public EmptyTarget(int x,int y){
		this.x=x;
		this.y=y;
	}
}
