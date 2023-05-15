package stmall.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CompleteDeliveryCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String courier;
}
