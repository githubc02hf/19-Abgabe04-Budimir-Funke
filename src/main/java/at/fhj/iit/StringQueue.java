package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

/**
* Using the queue methods
* @author Ivica Budimir
* @author Henrik Funnke
* @version 11.06.2019
*/
public class StringQueue implements Queue {
	
	private List<String> elements = new ArrayList<String>();
	private int maxSize = 5;

	public StringQueue(int maxsize){
		this.maxSize = maxsize;
	}
	
	/**
	 *  Adds the element String obj to the queue. 
	 *  If the addition is successful, the method returns true else false.
	 * @param obj
	 * @return true if the addition is successful else false
	 */
	@Override
	public boolean offer(String obj) {
		if(elements.size()!= maxSize)
			elements.add(obj);
		else
			return false;
		
		return true;
	}

	/**
	 *  Returns the head (first) element and also deletes it. That is, we cannot get it again. 
	 *  If no element exists (when queue is empty), the method returns null.
	 * @return head element and deletes it, if queue is empty it returns null
	 */
	@Override
	public String poll() {
		String element = peek();
		
		if(elements.size() != 0){
			elements.remove(0);
		}
		
		return element;
	}
	
	/**
	 * It also returns and deletes the head element like poll(), but with a small difference. 
	 * This method throws NoSuchElementException if the queue is empty. 
	 * 
	 * @return same as poll() but throws NoSuchElementException if the queue is empty
	 */
	@Override
	public String remove() {
		String element = poll();		
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

	/**
	 *  Returns the head element but it does not delete it. That is, we can get it again. 
	 *  Returns null when the queue is empty. 
	 * @return head element but it does not delete it,if queue is empty it returns null
	 */
	@Override
	public String peek() {
		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;
		
		return element;
	}

	/**
	 *  It works similar to peek() but with a small difference (returns but does not delete the element). 
	 *  It throws NoSuchElementException when the queue is empty.
	 * @return similar to peek but throws NoSuchElementException when the queue is empty
	 */
	@Override
	public String element() {
		String element = peek();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

}
