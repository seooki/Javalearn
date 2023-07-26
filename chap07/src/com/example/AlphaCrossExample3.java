package com.example;

import java.util.Timer;
import java.util.TimerTask;

import util.Alpha;
import util.VT100;

public class AlphaCrossExample3 {
	
	enum Direction {
		UP, DOWN, LEFT, RIGHT
	}
	
	static class Cross extends Alpha {
		
		final Direction direction;
		
		public Cross() {
			line = 10;
			column = 20;
			direction = Direction.values()[(int)(Math.random()*4)];
			
			show();
		}
		void left() {
			hide();
			column--;
			show();
		}
		void right() {
			hide();
			column++;
			show();
		}
		void up() {
			hide();
			line--;
			show();
		}
		void down() {
			hide();
			line++;
			show();
		}
		
		void move() {
			switch (direction) {
			case UP:
				up();
				break;
			case DOWN:
				down();
				break;
			case LEFT:
				left();
				break;
			case RIGHT:
				right();
				break;				
			default:
				break;
			}
		}
	}
	
	static class CrossTask extends TimerTask {
		static int count=0;
		
		Cross alpha = new Cross();
		
		public CrossTask() {
			CrossTask.count++;
		}
		
		@Override
		public void run() {
			if (alpha.getLine()==1 || alpha.getLine()==20 ||
			    alpha.getColumn()==1 || alpha.getColumn()==40) {
				alpha.hide();
				super.cancel();
				CrossTask.count--;
				
				if (CrossTask.count==0) {
					VT100.cursorMove(21, 1);
					VT100.reset();
					System.out.println("Program End...");
					timer.cancel();
				}
				return;
			}
			
			alpha.move();
		}
	}

	static Timer timer = new Timer();
	
	public static void main(String[] args) throws InterruptedException {
		VT100.clearScreen();
		
		for (int i=0; i<1000; i++) {
			int speed = (int)(Math.random()*200 + 10);
			timer.schedule(new CrossTask(), 0, speed);
			Thread.sleep(100);
		}
		
		VT100.reset();
	}

}
