package com.app.ecommercev2.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.ecommercev2.model.Customer;
import com.app.ecommercev2.model.Product;
import com.app.ecommercev2.model.Order;
import com.app.ecommercev2.model.OrderItem;

@Entity(name = "OrderorderItems")
@Table(schema = "\"ecommercev2_822\"", name = "\"OrderorderItems\"")
@Data
public class OrderorderItems{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"OrderId\"")
	private String orderId;

    
    @Column(name = "\"OrderItemId\"")
    private String orderItemId;
 
}