package blog.juanfrancisco.net.services;

import blog.juanfrancisco.net.config.Constants;
import blog.juanfrancisco.net.entities.InvalidCountry;
import blog.juanfrancisco.net.values.Address;

//Domain services
public class ShippingService {
    private  final  double BASE_PRICE_TO_SHIP=0.025;

    public Boolean isAllowedToShip(String country){
        return Constants.BANNED_COUNTRIES.stream().filter(bannedCountry-> bannedCountry.equals(country) ).findAny().isPresent();
    }

    public double computeShippingCost(Address shippingAddress) throws InvalidCountry {
        if (!isAllowedToShip(shippingAddress.getCountry()))
        {
            throw new InvalidCountry();
        }

        double baseSshipi =BASE_PRICE_TO_SHIP;
        if (shippingAddress.outSideUsa())
        {
            return  baseSshipi+10000;
        }
        return  baseSshipi+10;

    }



}
