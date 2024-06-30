package com.sakshamjain24.learn_spring_framework;

import com.sakshamjain24.learn_spring_framework.game.GameRunner;
import com.sakshamjain24.learn_spring_framework.game.MarioGame;
import com.sakshamjain24.learn_spring_framework.game.PacManGame;
import com.sakshamjain24.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
//		creating object
//		var game=new MarioGame();
//		var game = new SupesrContraGame();
		var game = new PacManGame(); 
		
//		Object creation + wiring of dependencies
//		game is a dependency
		var gameRunner=new GameRunner(game); 
		
		
		gameRunner.run();
		
	}

}
