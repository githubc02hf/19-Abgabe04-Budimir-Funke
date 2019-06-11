package at.fhj.iit;

/**
* Interface of the queue
* @author Ivica Budimir
* @author Henrik Funnke
* @version 11.06.2019
*/
public interface Queue {
	
	/**
	 *  Adds the element obj to the queue. 
	 *  If the addition is successful, the method returns true else false.
	 * @param obj
	 * @return true if the addition is successful else false
	 */
	public abstract boolean offer(String obj);

	/**
	 *  Returns the head (first) element and also deletes it. That is, we cannot get it again. 
	 *  If no element exists (when queue is empty), the method returns null.
	 * @return head element and deletes it, if queue is empty it returns null
	 */
	public abstract String poll();
	
	/**
	 * It also returns and deletes the head element like poll(), but with a small difference. 
	 * This method throws NoSuchElementException if the queue is empty. 
	 * 
	 * @return same as poll() but throws NoSuchElementException if the queue is empty
	 */
	public abstract String remove();
	
	/**
	 *  Returns the head element but it does not delete it. That is, we can get it again. 
	 *  Returns null when the queue is empty. 
	 * @return head element but it does not delete it,if queue is empty it returns null
	 */
	public abstract String peek();
	
	/**
	 *  It works similar to peek() but with a small difference (returns but does not delete the element). 
	 *  It throws NoSuchElementException when the queue is empty.
	 * @return similar to peek but throws NoSuchElementException when the queue is empty
	 */
	public abstract String element();
	
}

