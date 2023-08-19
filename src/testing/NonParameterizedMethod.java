package testing;

public class NonParameterizedMethod {

	float PiValue()
	{
		return 3.14f;
	}
	
	static float RootTwo()
	{
		return 1.44f;
	}
	
	public static void main(String[] args) {
		
		NonParameterizedMethod P1 = new NonParameterizedMethod();
		float ret = P1.PiValue();
		System.out.println(ret);
		
	//	RootTwo();
		System.out.println(RootTwo());
	}
}
