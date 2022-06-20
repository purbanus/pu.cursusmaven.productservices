package com.bharath.product.bo;

import com.bharath.product.dao.ProductDao;
import com.bharath.product.dao.ProductDaoImpl;
import com.bharath.product.dto.Product;

public class ProductBoImpl implements ProductBo
{
private static ProductDao dao = new ProductDaoImpl();

@Override
public void create( Product aProduct )
{
	dao.create( aProduct );
}
@Override
public Product findProduct( int aId )
{
	return dao.read( aId );
}

}
