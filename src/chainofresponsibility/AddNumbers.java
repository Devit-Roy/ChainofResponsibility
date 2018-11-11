package chainofresponsibility;

public class AddNumbers implements Chain {
	private Chain nextlnChain;
	@Override
	public void setNextChain(Chain nextChain)
	{
		this.nextlnChain = nextChain;
	}
	@Override
	public void calculate (Numbers requests)
	{
		if(requests.getCalculationWanted() == "add")
		{
			System.out.println(requests.getNumber1() + " + " + requests.getNumber2() + " = " + (requests.getNumber1() + requests.getNumber2()));
		}
		else
		{
			nextlnChain.calculate(requests);
		}
	}
}
	