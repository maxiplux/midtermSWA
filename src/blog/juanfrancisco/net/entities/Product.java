package blog.juanfrancisco.net.entities;

import blog.juanfrancisco.net.config.Constants;
import blog.juanfrancisco.net.values.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//Agregate
public class Product {
    private  final  double BASE_PRICE_TO_SHIP=0.025;
    private int productNumber;
    private String name;


    private Money money;
    private Weight weight;
    private Stock stock;

    private  List<Review> reviews = new ArrayList<Review>();

    public Boolean isAllowedToShip(String country){
        return Constants.BANNED_COUNTRIES.stream().filter(bannedCountry-> bannedCountry.equals(country) ).findAny().isPresent();
    }
    public double computeShippingCost(Address shippingAddress) throws InvalidCountry {
        if (!isAllowedToShip(shippingAddress.getCountry()))
        {
            throw new InvalidCountry();
        }

        double baseSshipi =this.weight.getWeight()*BASE_PRICE_TO_SHIP;
        if (shippingAddress.outSideUsa())
        {
            return  baseSshipi+10000;
        }
        return  baseSshipi+10;

    }

    public void getPriceInCurrency(String currency){

    }
    public void checkStock(){

    }

    public void computeAverageReviewPoints(){
        

    }
    public void getNumberOfReviewsWithScore(int score){}





}
