package com.bharath.product.dao;

import com.bharath.product.dto.Product;

public interface ProductDao
{
void create( Product aProduct );
void update( Product aProduct );
void delete( Product aProduct );
Product read( int id );
}
