package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCar {

    public void checkout(String status){
        //Logging

        //Authentication and authorizations
        //Sanitize the data
        System.out.println("Checkout method form shopping car called");
    }

    public int quantity(){
        return 7;
    }
}
