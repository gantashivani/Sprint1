package com.capgemini.go.service;

import java.util.Iterator;

import com.capgemini.go.dao.WishListDao;
import com.capgemini.go.dao.WishListDaoInterface;
import com.capgemini.go.dto.WishListDTO;

public class WishListService implements WishListServiceInterface {

	 WishListDaoInterface dao=new WishListDao();//has-a
	 WishListDTO wishlistdto=new WishListDTO();
	
	 @Override
	 public int  addtolist(int uid, int rid, int pid) {
		try {
			return dao.addtolist(uid,rid, pid);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	 }
	 
	 @Override
	 public WishListDTO viewListById(int userid) {
		return dao.viewListById(userid);
	 }

	@Override
	public void deletefromList(int userid1, int proid1) {
		dao.deletefromList(userid1, proid1);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Iterator productslist() {
		return dao.productslist();
	}
}
