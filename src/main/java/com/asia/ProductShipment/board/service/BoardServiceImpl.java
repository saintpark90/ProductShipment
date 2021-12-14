package com.asia.ProductShipment.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asia.ProductShipment.board.Board;
import com.asia.ProductShipment.board.dao.BoardDao;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao boardDao;
	
	@Override
	public List<Board> boardList(Board board) {
		// TODO Auto-generated method stub
		return boardDao.boardList(board);
	}

	
	@Override
	public String pageNum(Board board) {
		// TODO Auto-generated method stub
		return boardDao.pageNum(board);
	}


	@Override
	public List<Board> boardDetail(Board board) {
		// TODO Auto-generated method stub
		return boardDao.boardDetail(board);
	}


	@Override
	public int boardInsert(Board board) {
		// TODO Auto-generated method stub
		return boardDao.boardInsert(board);
	}


	@Override
	public int boardMaxID(Board board) {
		// TODO Auto-generated method stub
		return boardDao.boardMaxID(board);
	}


	@Override
	public int boardDelete(Board board) {
		// TODO Auto-generated method stub
		return boardDao.boardDelete(board);
	}


	@Override
	public int boardUpdate(Board board) {
		// TODO Auto-generated method stub
		return boardDao.boardUpdate(board);
	}
}
