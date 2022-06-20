package com.bharath.product;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bharath.product.dao.ProductDao;
import com.bharath.product.dao.ProductDaoImpl;
import com.bharath.product.dto.Product;

public class ProductDaoImplTest
{

@Test
public void creatShouldCreateAProduct()
{
	ProductDao dao = new ProductDaoImpl();
	Product product = new Product();
	product.setId( 1 );
	product.setName( "Samsung Phone" );
	product.setDescription( "It's the awesomest" );
	product.setPrice( 800 );
	dao.create( product );
	
	Product result = dao.read( 1 );
	assertNotNull( result );
	assertEquals( "Samsung Phone", result.getName() );
}

}
