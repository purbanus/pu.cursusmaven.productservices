package com.bharath.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.bharath.product.dto.Product;

public class ProductDaoImpl implements ProductDao
{

Map<Integer, Product> products = new HashMap<>();
@Override
public void create( Product aProduct )
{
	products.put( aProduct.getId(), aProduct );
}

@Override
public void update( Product aProduct )
{
	// TODO Auto-generated method stub

}

@Override
public void delete( Product aProduct )
{
	// TODO Auto-generated method stub

}

@Override
public Product read( int aId )
{
	return products.get( aId );
}

}
