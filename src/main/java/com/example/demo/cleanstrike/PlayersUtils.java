package com.example.demo.cleanstrike;

import java.util.List;

public interface PlayersUtils {
	
	public boolean checkPlayerScore(Players players);
	public void updatePlayerScore(int playerDetails, int score, Players player);
	public List<String> getPlayerHistory(int player, Players playerDetails);
	public void updatePlayerHistory(Players players, String strikeOutcome, int playerDetails);
	public void emptyMoves(Players player, int playerDetails);
	public void playerFoulCount(Players player, int playerDetails);
	public int scoreDiff(Players players);
}