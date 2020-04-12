package blog.juanfrancisco.net.values;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//Value
public class Money {
    private double price;
    private String currency;

    private void validate(double value) throws MoneyCannotBeANegativeValueException {
        if (value < 0)
        {
            throw new MoneyCannotBeANegativeValueException();
        }
    }


}
