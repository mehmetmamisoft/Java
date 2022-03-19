package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product,Integer> {

	//crud bu şekilde hazır  interface içiçe yazduk!
	
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_CategoryId(String productName,int categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName,int categoryId);
	
	List<Product> getByCategoryIn(List<Integer> categories);

	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	
	@Query("From Product where productName=:productName "
			+ "and category.categoryId=:categoryId")
	//angular routing :?@
	List<Product> getByNameAndCategory(String productName,int categoryId);
	
	@Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto"
			+" (p.id,p.productName,c.categoryName)"
			+ "From Category c Inner Join c.products p ")
	
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
	
	
	
	//normalde bu category one products many
	//select * from Category c inner join Product p
	//on c.categoryId=p.categoryId;
	
	//select * from products where product_name=abc;
	//select * from products where product_name=abc and category_id=1;
	//select * from products where product_name=abc or category_id=1;
	//select * from products where category_id(1,2,3,4)
	//select * from products where productName like 'a' gibi
	//select * from products where productName %STARTSWITH 'm' gibi
	//select * from products where product_name=bisey and categoryId=bisey
}