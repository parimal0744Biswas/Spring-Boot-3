package com.parimal;

public class AppGamingBasicJava
{

	public static void main(String[] args)
	{
		var mariogame = new MarioGame();
		var gameRunner = new GameRunner(mariogame);
		gameRunner.run();
	}

}
