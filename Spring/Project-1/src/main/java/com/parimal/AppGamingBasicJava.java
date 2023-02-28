package com.parimal;

public class AppGamingBasicJava
{

	public static void main(String[] args)
	{
//		var game = new SuperContractGame();
		var game = new MarioGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
