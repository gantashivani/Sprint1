package com.capgemini.go.dao;


@SuppressWarnings("serial")
public class InCorrectProduct extends Exception{
	public InCorrectProduct (final String msg){
        super(msg);
    }
}

