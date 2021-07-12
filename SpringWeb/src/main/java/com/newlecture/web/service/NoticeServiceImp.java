package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;


//ioc 컨테이너에 넣어준다
@Service
public class NoticeServiceImp implements NoticeService{

	@Autowired
	private NoticeDao noticeDao;
	
	
	
	//이름 같고 인수 같으면 제일 큰범위꺼만 만든다  
	@Override
	public List<NoticeView> getViewList() {
		// TODO Auto-generated method stub
		return getViewList(1,"title","");
	}

	@Override
	public List<NoticeView> getViewList(String field, String query) {
		// TODO Auto-generated method stub
		return getViewList(1,field,query);
	}
	
	
	
	@Override
	public List<NoticeView> getViewList(int page, String field, String query) {
		
		int size=10;
		int offset=0+(page-1)*size;
		
		List<NoticeView> list=noticeDao.geViewtList(offset,size,field,query);
		
		return list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return getCount("title","");
	}

	@Override
	public int getCount(String field, String query) {
		// TODO Auto-generated method stub
		return noticeDao.getCount(field,query);
	}

	@Override 
	public NoticeView  getView (int id) {
		
		
		NoticeView notice=noticeDao.getView(id);
		
		
		return notice;
	}

	@Override
	public Notice getNext(int id) {
		// TODO Auto-generated method stub
		return noticeDao.getNext(id);
	}

	@Override
	public Notice getPrev(int id) {
		// TODO Auto-generated method stub
		return noticeDao.getPrev(id);
	}

	@Override
	public int updatePubAll(int[] pubIds, int[] closeIds) {
		
		return noticeDao.updatePubAll(pubIds,closeIds);
	}

	@Override
	public int deleteAll(int[] ids) {
		// TODO Auto-generated method stub
		return noticeDao.deleteAll(ids);
	}

	@Override
	public int update(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.update(notice);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return noticeDao.delete(id);
	}

	@Override
	public int insert(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.insert(notice);
	}
	
		
}
