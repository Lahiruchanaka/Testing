package lk.ijse.pos.bo;

import lk.ijse.pos.bo.impl.CustomerBOImpl;
import lk.ijse.pos.bo.impl.ItemBOImpl;
import lk.ijse.pos.bo.impl.PurchaseOrderBOImpl;



public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getBoFactory() {
        return boFactory == null ? new BOFactory() : boFactory;
    }

    public SuperBO getBO(BOTypes types) {
        switch (types) {
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case ORDER:
                return new PurchaseOrderBOImpl();
            default:
                return null;
        }
    }

    public enum BOTypes {
        CUSTOMER, ITEM, ORDER
    }

}
