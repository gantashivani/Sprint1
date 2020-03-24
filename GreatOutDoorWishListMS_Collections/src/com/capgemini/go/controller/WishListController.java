package com.capgemini.go.controller;


import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import com.capgemini.go.dto.WishListDTO;
import com.capgemini.go.service.WishListService;
import com.capgemini.go.service.WishListServiceInterface;

public class WishListController {

	static WishListServiceInterface wishlistService=new WishListService();
	
	@SuppressWarnings({ "resource", "rawtypes" })
	public static void main(String[] args) {
		
		while(true)
		{
		 try{
			System.out.println("WishList Of Great Outdoor \n 1-->Add to WishList \n 2-->View WishList \n 3-->Exit wishlist");
			System.out.println("Choose ur Option");
			
			Scanner sc=new Scanner(System.in);
			int option=sc.nextInt();
			
			switch(option)
			{
			case 1:
				try{
				System.out.println("*******ADD PRODUCTS*****");
				System.out.println("List Of Products \n================");
				Iterator productsList=wishlistService.productslist();
				System.out.println("RetailerId ProductId   Prize	 Color	  Dimensions	 Specifications	  Manufacturer quantity productCatogery productName ");
				while(productsList.hasNext())
						System.out.println(productsList.next());
				System.out.println("Enter userid");
				int uid=sc.nextInt();
				System.out.println("Enter RetailerId");
				int rid=sc.nextInt();
				System.out.println("Enter productId");
				int pid=sc.nextInt();
				
				int wishid=	wishlistService.addtolist(uid,rid,pid);
				
				System.out.println("Added to WishList Sucessfully With Wishlist Id :"+wishid);
				break;
				}catch(InputMismatchException e)
				 {
					 e.printStackTrace();
				 }
			case 2:
				try{
				System.out.println("***********VIEW PRODUCT************");
				System.out.println("Enter UserId to View WishList");
				int userid=sc.nextInt();
				WishListDTO data=wishlistService.viewListById(userid);
				System.out.println(data);
				break;
				}catch(InputMismatchException e)
				 {
					 e.printStackTrace();
				 }
			case 3:
				System.out.println("Thank U Logged Out");
				System.exit(option);
				break;
			default:
				System.out.println("Enter the choice Amongst 1 2 3 only ");
				break;
			}
		 }catch(InputMismatchException e)
		 {
			 e.printStackTrace();
		 }
		}
	}

}
