package dio.expertostech.tutorialmicrosservicekafka.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestData {
    private String id;
    private String productName;
    private BigDecimal value;

}