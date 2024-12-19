package com.app.ecommercev2.function;

import com.app.ecommercev2.model.Customer;
import com.app.ecommercev2.model.Product;
import com.app.ecommercev2.model.Order;
import com.app.ecommercev2.model.OrderItem;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.ecommercev2.repository.OrderRepository;
import com.app.ecommercev2.repository.CustomerRepository;
import com.app.ecommercev2.repository.OrderItemRepository;
import com.app.ecommercev2.repository.ProductRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
