package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

//ioc에 담아준다
@Mapper
public interface NoticeDao {
	

	List<NoticeView> geViewtList(int offset, int size, String field, String query);
	int getCount(String field, String query);
	NoticeView getView(int id);
	
	
	Notice getNext(int id);
	Notice getPrev(int id);
	
	
	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);
	
	
	
	int deleteAll(int[] ids);
	int updatePubAll(int[] pubIds, int[] closeIds);
}
