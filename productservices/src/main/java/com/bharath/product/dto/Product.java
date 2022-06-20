package com.bharath.product.dto;

public class Product
{
private int id;
private String name;
private String description;
private int price;
public int getId()
{
	return id;
}
public void setId( int aId )
{
	id = aId;
}
public String getName()
{
	return name;
}
public void setName( String aName )
{
	name = aName;
}
public String getDescription()
{
	return description;
}
public void setDescription( String aDescription )
{
	description = aDescription;
}
public int getPrice()
{
	return price;
}
public void setPrice( int aPrice )
{
	price = aPrice;
}
@Override
public String toString()
{
	return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
}
}
