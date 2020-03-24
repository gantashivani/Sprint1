package com.capgemini.go.dao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WishListDaoTest {

	WishListDao dao=new WishListDao(); 

	/*	INVAlID 
	@Test
	public void addlist() throws Exception {
		int  result = dao.addtolist(1, 1,1001);//(1,10,11) //(10,11,1)
		if (result==1) {
			assertTrue(true);
		}
	}*/
	
	//valid
	@Test
	public void addlist() throws Exception {
		int  result = dao.addtolist(1, 1,101);
		if (result==0) {
			assertFalse(true);
		}
	}
	//valid
	/*@Test
	public void viewlist() throws Exception {
		if (dao.viewListById(1)!=null) {
			assertTrue(true);
		}
	}*/
	
	
	//invalid
		@Test
		public void viewlist() throws Exception {
			if (dao.viewListById(10)!=null) {
				assertTrue(false);
			}
		}
	
}
