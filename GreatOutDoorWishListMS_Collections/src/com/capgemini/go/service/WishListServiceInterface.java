package com.capgemini.go.service;

import java.util.Iterator;

import com.capgemini.go.dto.WishListDTO;

public interface WishListServiceInterface {

	int addtolist(int uid, int rid, int pid);

	WishListDTO viewListById(int userid);

	void deletefromList(int userid1, int proid1);

	@SuppressWarnings("rawtypes")
	Iterator productslist();
}
