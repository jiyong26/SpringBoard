package com.kh.jykimc.board.model.service;

import java.util.List;

import com.kh.jykimc.board.model.domain.BoardReply;

public interface BoardReplyService {
	BoardReply selectBoardReply(String comment_id);

	List<BoardReply> selectList(String board_num);

	int insertBoardReply(BoardReply br);

	int updateBoardReply(BoardReply br);

	int deleteBoardReply(BoardReply br);
}
