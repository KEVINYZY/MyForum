package com.ljc.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ljc.dao.CommentDao;
import com.ljc.entity.Comment;
import com.ljc.service.CommentService;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDao commentDao;
	
	@Override
	public int addComment(String content, Integer aid, Integer uid,Timestamp timestamp) {
		return commentDao.addComment(content, aid, uid, timestamp);
	}

	@Override
	public List<Comment> findComment(Integer aid, Integer uid) {
		return commentDao.findComment(aid, uid);
	}

	@Override
	public int getCommentCount(Integer aid) {
		return commentDao.getCommentCount(aid);
	}

}
