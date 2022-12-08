//OutOfBusiness Class
package Core.Strategy;
public class OutOfBusiness implements TimeStrategy{
	@Override
	public void execute() {
		System.out.println("已打烊");
	}
}
