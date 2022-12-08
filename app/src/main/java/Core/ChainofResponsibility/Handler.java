package Core.ChainofResponsibility;

import Core.Decorator.Order;
import Core.Decorator.OrderType;

public interface Handler {
    Handler nextHandler = null;

    public void execute(Order product);
    abstract void action(Order product);

    public abstract void CheckType(OrderType type, String name);
}
