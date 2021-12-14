package com.asia.ProductShipment.board.service;

import java.util.List;

import com.asia.ProductShipment.board.Board;

public interface BoardService {
	public List<Board> boardList(Board board);
	
	public List<Board> boardDetail(Board board);
	
	public String pageNum(Board board);
	
	public int boardInsert(Board board);
	
	public int boardMaxID(Board board);
	
	public int boardUpdate(Board board);
	
	public int boardDelete(Board board);
}
