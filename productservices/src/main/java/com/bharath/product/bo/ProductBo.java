package com.bharath.product.bo;

import com.bharath.product.dto.Product;

public interface ProductBo
{
void create( Product aProduct );
Product findProduct( int aId );
}
