public enum OrderState {
	/** 已取消 **/
    CANCEL {public String getName(){return "cancel";}},
    /** 待审核 **/
    WAITCONFIRM {public String getName(){return "waitconfirm";}},
    /** 等待付款 **/
    WAITPAYMENT {public String getName(){return "waitpayment";}},
    /** 正在配货 **/
    ADMEASUREPRODUCT {public String getName(){return "admeasureproduct";}},
    /** 等待发货 **/
    WAITDELIVER {public String getName(){return "waitdeliver";}},
    /** 已发货 **/
    DELIVERED {public String getName(){return "delivered";}},
    /** 已收货 **/
    RECEIVED {public String getName(){return "received";}};
    
    public abstract String getName();
}
