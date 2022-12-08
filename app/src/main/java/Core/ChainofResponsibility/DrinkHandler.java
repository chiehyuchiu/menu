package Core.ChainofResponsibility;

import Core.Decorator.Order;
import Core.Decorator.OrderType;

public class DrinkHandler  extends BaseHandler {
    public DrinkHandler (Handler nextHandler) {
        super(nextHandler);
    }

    public void action(Order product)
    {
        product.CallChain(this);
    }

    @Override
    public void CheckType(OrderType type, String name) {
        if(type == OrderType.Drink)
        {
            System.out.println("Bartender should make "+ name);
        }
    }
}
