import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;

public class Hex2RgbTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		int[] colors = new int[]{255, 0, 0};
		Assert.assertArrayEquals(colors, Hex2Rgb.convert("#ff0000"));
	}

	@Test
	public void test2() throws Exception {
		int[] colors = new int[]{86, 225, 180};
		Assert.assertArrayEquals(colors, Hex2Rgb.convert("#56E1B4"));
	}

	@Test
	public void test3() throws Exception {
		Assert.assertArrayEquals(null, Hex2Rgb.convert("ff0000"));
	}
}
