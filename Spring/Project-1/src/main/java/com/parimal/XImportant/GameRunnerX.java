package com.parimal.XImportant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunnerX
{
	@Autowired
	@Qualifier("SuperContractGameX_Qualifier")
	private GamingConsoleX_I game;

	public void run()
	{
		System.out.println("Running game : " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
