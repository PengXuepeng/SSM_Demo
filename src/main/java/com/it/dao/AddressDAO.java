package com.it.dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.it.entities.Address;

@Service
public class AddressDAO {

	public List<Address> getAdress(){
		List<Address> list = new LinkedList<Address>();
		list.add(new Address(1,"JS","XZ"));
		list.add(new Address(2,"ZJ","HZ"));
		list.add(new Address(2,"GX","GL"));
		list.add(new Address(4,"FJ","PT"));

		return list;
	}

}
