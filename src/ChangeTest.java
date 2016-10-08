import static org.junit.Assert.*;

import org.junit.Test;

public class ChangeTest
{

	@Test
	public void testPath2() //there is no change
	{
		int changeGiven[] = Change.changeCalc(100.00, 100.00);
		int expectedChange[] = new int[changeGiven.length];
		expectedChange[0] = 0;
		expectedChange[1] = 0;
		expectedChange[2] = 0;
		expectedChange[3] = 0;
		expectedChange[4] = 0;
		assertArrayEquals(changeGiven, expectedChange);
	}
	
	@Test
	public void testPath1() //there is change given
	{
		int changeGiven2[] = Change.changeCalc(150.00, 148.69);
		int expectedChange2[] = new int[changeGiven2.length];
		expectedChange2[0] = 1;
		expectedChange2[1] = 1;
		expectedChange2[2] = 0;
		expectedChange2[3] = 1;
		expectedChange2[4] = 1;
		assertArrayEquals(changeGiven2, expectedChange2);
	}

}
