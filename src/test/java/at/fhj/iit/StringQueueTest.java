package at.fhj.iit;

import java.util.NoSuchElementException;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Testing the methods of the queue
 * 
 * @author Ivica Budimir
 * @author Henrik Funke
 * @version 14.06.2019
 */

public class StringQueueTest {
	public Queue q1;
	public Queue q2;

	@Before
	public void setup() {
		q1 = new StringQueue(5);
		q2 = new StringQueue(1);
	}

	/**
	 * Testing if the method offer() successfully (true) adds String obj. It should
	 * be unsuccessful when there is not enough space (false) in the queue. 
	 * Added some Strings in the q1 to test if it returns true. Added two Strings in the
	 * q2 to test if the last one returns false
	 */

	@Test
	public void testOffer() {
		String s1 = "test1";
		Assert.assertTrue(q1.offer(s1));
		String s2 = "test2";
		String s3 = "test3";
		Assert.assertTrue(q1.offer(s2));
		Assert.assertTrue(q1.offer(s3));

		String s4 = "test4";
		Assert.assertTrue(q2.offer(s4));
		Assert.assertFalse(q2.offer(s4));

	}

	/**
	 * The method poll() should return and delete the first element in the queue. When
	 * queue is empty it should return null.
	 * Tested with s1, s2 if it returns and deletes the first element. Tested with s3 whether it returns null when the queue
	 * is empty
	 */
	@Test
	public void testPoll() {
		String s1 = "test1";
		String s2 = "test2";
		q1.offer(s1);
		q1.offer(s2);
		Assert.assertEquals(s1, q1.poll());
		Assert.assertEquals(s2, q1.poll());
		Assert.assertNotEquals(s2, q1.poll());

		String s3 = "test3";
		q2.offer(s3);
		Assert.assertEquals(s3, q2.poll());
		Assert.assertEquals(null, q2.poll());
	}

	/**
	 * Same as poll() but the only difference is that it throws a
	 * NoSuchElementException if it is empty. 
	 * Tests are similar to testPoll() but there is an extra test for the exception (testRemoveException())
	 */
	@Test
	public void testRemove() {
		String s1 = "test1";
		String s2 = "test2";
		q1.offer(s1);
		q1.offer(s2);
		Assert.assertEquals(s1, q1.remove());
		Assert.assertEquals(s2, q1.remove());

		String s3 = "test3";
		q2.offer(s3);
		Assert.assertEquals(s3, q2.remove());
	}

	/**
	 * Testing if the method remove() throws NoSuchElementException when the queue
	 * is empty
	 */
	@Test(expected = NoSuchElementException.class)
	public void testRemoveException() throws Exception {
		q1.remove();
	}

	/**
	 * peek() returns the head element and does not delete it. Return is null when queue is empty
	 * Added some Strings in the queue and checked if it returns the first element. Furthermore tested if it does not delete the element.
	 */
	@Test
	public void testPeek() {
		String s1 = "test1";
		q1.offer(s1);
		Assert.assertEquals(s1, q1.peek());
		Assert.assertEquals(s1, q1.peek());

		String s2 = "test2";
		String s3 = "test3";
		q1.offer(s2);
		q1.offer(s3);
		Assert.assertEquals(s1, q1.peek());
		q1.remove();
		Assert.assertEquals(s2, q1.peek());

		Assert.assertEquals(null, q2.peek());
	}

	/**
	 * The method element() has the same function as peek(). The difference is, it 
	 * does not return null if queue is empty but it throws a NoSucheElementException.
	 * Same tests as peek() but tested the exception in another test method (testElemenException())
	 */
	@Test
	public void testElement() {
		String s1 = "test1";
		q1.offer(s1);
		Assert.assertEquals(s1, q1.peek());
		Assert.assertEquals(s1, q1.peek());

		String s2 = "test2";
		String s3 = "test3";
		q1.offer(s2);
		q1.offer(s3);
		Assert.assertEquals(s1, q1.peek());
		q1.remove();
		Assert.assertEquals(s2, q1.peek());

	}

	/**
	 * Testing if the method element() throws NoSuchElementException when the queue
	 * is empty
	 */
	@Test(expected = NoSuchElementException.class)
	public void testElementException() {
		q1.element();
	}

}