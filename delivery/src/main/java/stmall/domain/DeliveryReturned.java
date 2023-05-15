package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private String userId;
    private Long id;
    private Long orderId;
    private String productName;
    private Integer qty;
    private Long productId;
    private String sts;
    private String courier;

    public DeliveryReturned(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryReturned() {
        super();
    }
}
