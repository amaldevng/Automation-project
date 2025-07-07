package testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitPgm 
{

	
	@Before
	public void setup()
	{
		System.out.println("load url");
	}
	@Test
	public void test()
	{
		System.out.println("test activity");
	}
	@After
	public void after()
	{
        System.out.println("before close");
	}
	
}
