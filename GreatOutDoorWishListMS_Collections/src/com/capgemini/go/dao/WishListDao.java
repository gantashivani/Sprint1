package com.capgemini.go.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.capgemini.go.dto.AdminDTO;
import com.capgemini.go.dto.ProductsDTO;
import com.capgemini.go.dto.UserDTO;
import com.capgemini.go.dto.WishListDTO;

public class WishListDao implements WishListDaoInterface {
	
	private Map<Integer, WishListDTO> wishlist=new HashMap<Integer, WishListDTO>();
	private HashMap<Integer, ProductsDTO> product=new HashMap<Integer, ProductsDTO>();
	private HashMap<Integer, AdminDTO> admin=new HashMap<Integer, AdminDTO>();
	private HashMap<Integer, UserDTO> user=new HashMap<Integer,UserDTO>();
	WishListDTO wishlistdto=new WishListDTO();
	
	public WishListDao() {
		super();
		
		//Admin Data ---- Retailer Data
		AdminDTO admin1=new AdminDTO("Britania");
		AdminDTO admin2=new AdminDTO("Haldirams");
		AdminDTO admin3=new AdminDTO("Lakme");
		AdminDTO admin4=new AdminDTO("Samsung");
		
		admin.put(1, admin1);
		admin.put(2, admin2);
		admin.put(3, admin3);
		admin.put(4, admin4);
		
		//User Data
		UserDTO user1=new UserDTO("A123","A");
		UserDTO user2=new UserDTO("B123","B");
		UserDTO user3=new UserDTO("C123","C");
		
		user.put(1, user1);
		user.put(2, user2);
		user.put(3, user3);
		
		//Products Data
		ProductsDTO product1=new ProductsDTO(1,101, 50,"white",20, "edible", "Britania",90,1, "MilkBiscuit");
		ProductsDTO product2=new ProductsDTO(1,102, 100,"orage",20, "edible", "Britania",90,1, "Cakes");
		ProductsDTO product3=new ProductsDTO(1,103, 20,"brown",100, "edible", "Britania",70,1, "LittleHearts");
		ProductsDTO product4=new ProductsDTO(2,104, 200,"red",30, "edible", "Haldiram",90,1, "Halwa");
		ProductsDTO product5=new ProductsDTO(2,105, 500,"cream",30, "edible", "Haldiram",160,1, "SoanPapad");
		ProductsDTO product6=new ProductsDTO(2,106, 600,"yellow",100, "edible", "Haldiram",160,1, "KathaMetha");
		
		product.put(100, product1);
		product.put(101, product2);
		product.put(102, product3);
		product.put(103, product4);
		product.put(104, product5);
		product.put(105, product6);
	
	}

	@Override
	public int addtolist(int uid, int rid, int pid) throws Exception {
	
		try {
			validateproduct(pid);
		} catch (InCorrectProduct e) {
			
			e.printStackTrace();
		}
		int wishlistid=uid+pid;
		wishlistdto.setProductId(pid);
		wishlistdto.setRegisterId(rid);
		wishlistdto.setUserId(uid);
		wishlistdto.setWishListId(wishlistid);
		ProductsDTO productsdata = product.get(pid);
		wishlistdto.setProducts(productsdata);
		
		wishlist.put(uid,wishlistdto);
		return wishlistid;
	}

	@Override
	public WishListDTO viewListById(int userid) {

		WishListDTO data=wishlist.get(userid);
		return data;
	}

	@Override
	public void deletefromList(int userid1, int proid1) {
		wishlist.remove(userid1);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Iterator productslist() {
		Iterator list=product.values().iterator();
		return list;
	}

	public void validateproduct(int pid) throws Exception
	{
		if(!product.containsKey(pid))
			throw new InCorrectProduct("Product doesn't exist in products");
	}
	
	public void validateuser(int uid) throws Exception
	{
		if(!user.containsKey(uid))
			throw new InCorrectUser("User doesn't exist");
	}
	
	public void validateretailer(int pid) throws Exception
	{
		if(!admin.containsKey(pid))
			throw new InCorrectRetailerId("Retailer for the product doesn't exist");
	}
	
}
