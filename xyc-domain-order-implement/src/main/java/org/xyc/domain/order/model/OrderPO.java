package org.xyc.domain.order.model;

import lombok.Data;

/**
 * @author xuyachang
 * @date 2023/12/29
 */
@Data
public class OrderPO {
    private String orderCode;
    private Integer orderStatus;
    private String buyerName;
    private String buyerMobile;
}
