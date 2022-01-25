package fr.Adrien1106.util.interfaces;

import java.util.List;

public interface IRoom {

	public IBoard getBoard();
	
	public int getId();
	
	public List<IPlayer> getPlayers();
}
