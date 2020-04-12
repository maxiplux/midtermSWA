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
    private int productNumber;
    private String name;
    private Money money;
    private Weight weight;
    private Stock stock;
    private  List<Review> reviews = new ArrayList<Review>();
    public void computeAverageReviewPoints(){ }
    public void getNumberOfReviewsWithScore(int score){}





}
