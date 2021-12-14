package com.asia.ProductShipment.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.asia.ProductShipment.board.Board;


@Mapper
public interface BoardDao {
	public List<Board> boardList(Board board);
	
	public List<Board> boardDetail(Board board);
	
	public String pageNum(Board board);
	
	public int boardInsert(Board board);
	
	public int boardMaxID(Board board);
	
	public int boardUpdate(Board board);
	
	public int boardDelete(Board board);
}
