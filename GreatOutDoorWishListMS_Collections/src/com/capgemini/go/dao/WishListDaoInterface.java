package com.capgemini.go.dao;

import java.util.Iterator;

import com.capgemini.go.dto.WishListDTO;

public interface WishListDaoInterface {

	int addtolist(int uid, int rid, int pid) throws Exception;

	WishListDTO viewListById(int userid);

	void deletefromList(int userid1, int proid1);

	@SuppressWarnings("rawtypes")
	Iterator productslist();

}
