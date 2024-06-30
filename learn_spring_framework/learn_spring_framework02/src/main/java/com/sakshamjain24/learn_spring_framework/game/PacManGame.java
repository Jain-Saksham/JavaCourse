package com.sakshamjain24.learn_spring_framework.game;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{
	public void up() {
		System.out.println("Up");
	}
	public void down() {
		System.out.println("Down");
	}
	public void left() {
		System.out.println("Left");
	}
	public void right() {
		System.out.println("Right");
	}
}
