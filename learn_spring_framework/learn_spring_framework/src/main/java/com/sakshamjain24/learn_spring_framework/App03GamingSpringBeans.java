package com.sakshamjain24.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sakshamjain24.learn_spring_framework.game.GameRunner;
import com.sakshamjain24.learn_spring_framework.game.GamingConsole;
import com.sakshamjain24.learn_spring_framework.game.MarioGame;
import com.sakshamjain24.learn_spring_framework.game.PacManGame;
import com.sakshamjain24.learn_spring_framework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context=new AnnotationConfigApplicationContext(GamingConfiguration.class)){
//			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
	}

}
