package blog.juanfrancisco.net.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//value
public class Review {
    private String comment;
    private  Integer points;

}
