package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Player;

public class PlayerDAO {
	public int insertPlayer(Player player) {//선수등록
		int cnt =0;
		
		return cnt;
	}
	
	public List<Player> selectPlayerByName(String name) {//특정선수조회이름
		List<Player> playerList = new ArrayList<>();
		
		return playerList;
	}
	
	public List<Player> selectPlayerByBacknum(Integer backnum) {//특정선수조회등번호
		List<Player> playerList = new ArrayList<>();
		
		return playerList;
	}
	
	public Player selectPlayerByNum(Integer num) {//특정선수조회 번호로 
		Player player = null;
		return player;
	}
	
	public List<Player> selectPlayerByTeam(String teamName){//특정팀 소속 선수목록조회
		List<Player> playerList = new ArrayList<>();
		
		return playerList;
	}

}
