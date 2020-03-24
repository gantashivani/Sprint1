package com.capgemini.go.dao;


@SuppressWarnings("serial")
public class InCorrectRetailerId extends Exception{
	public InCorrectRetailerId (final String msg){
        super(msg);
    }
}
