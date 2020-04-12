package blog.juanfrancisco.net.values;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//Value
public class Stock {
    private String locationInWarehouseCode;
    private int quantityOnStock;

    public void checkStock(){

    }




}
