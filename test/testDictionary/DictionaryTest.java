package testDictionary;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import implementations.Dictionary;
import exceptions.DuplicateKeyException;

/**
 * @author David Fok, Suey Kong
 */
public class DictionaryTest
{
	// test objects
	Dictionary<Integer,String> one;
	static Dictionary<Integer,String> zero;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		zero = new Dictionary<Integer,String>( );
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		zero = null;
	}
	
	@Before
	public void setUp() throws Exception
	{
		one = new Dictionary<Integer,String>(  );
	}
	
	@After
	public void tearDown() throws Exception
	{
		one = null;
	}
	
	/**
	 * Test method for {@link implementations.Dictionary#insert(K key, V value)}.
	 * @throws DuplicateKeyException
	 */
	@Test
	public void testNormalInsert () 
	{
		
		try {
		one.insert(1, "TestingValue");
		}
		catch (DuplicateKeyException e)
		{
		 fail( "should not throw InvalidCounterException." );
		}	
	}
	/**
	 * Test method for {@link implementations.Dictionary#insert(K key, V value)}.
	 * @throws DuplicateKeyException
	 */
	@Test
	public void testDuplicateInsert () 
	{
		
		try {
		one.insert(1, "TestingValue");
		one.insert(1, "TestingValue");
		fail( "insert failed to throw DuplicateKeyException." );
		}
		catch (DuplicateKeyException e)
		{
			assertTrue(true);
		}	
	}
	
	/**
	 * Test method for {@link implementations.Dictionary#remove(K key)}.
	 */
    @Test
	public void testRemove() throws DuplicateKeyException {
    	int expected = 0;
    	one.insert(1, "TestingValue");
		one.remove(1);
		int actual = one.getKeys().size();
		assertEquals("remove method did not remove element correctly.", expected, actual);
	}
	
	/**
	 * Test method for {@link implementations.Dictionary#update(K key, V value)}.
	 */
    @Test
	public void testUpdate() throws DuplicateKeyException {
    	String expected = "new";
    	one.insert(1, "TestingValue");
		one.update(1, "new");
		String actual = one.lookup(1);
		assertEquals("update method did not update element correctly.", expected, actual);
	}
    
	/**
	 * Test method for {@link implementations.Dictionary#lookup(K key)}.
	 */
    @Test
	public void testLookup() throws DuplicateKeyException {
    	String expected = "TestingValue";
    	one.insert(1, "TestingValue");
		String actual = one.lookup(1);
		assertEquals("lookup method did not lookup element correctly.", expected, actual);
	}

}
