package utilities;

import exceptions.DuplicateKeyException;

/**
* DictionaryADT.java
*
* @author David Fok, Suey Kong
* @version 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab. 
*/

public interface DictionaryADT<K,V>
{
	/**
	 * Method to insert a (key, value) pair into the dictionary.
	 * 
	 * Precondition: A valid dictionary exists.
	 * 
	 * Postcondition: The (key, value) pair is inserted into the dictionary.
	 * 
	 * @param key The key to insert into the dictionary.
	 * @param value The value associate with the key to insert into the dictionary.
	 * @exception DuplicateKeyException is thrown if the key
	 * is passed that is already exists in the dictionary.
	 */
	public void insert(K key, V value)throws DuplicateKeyException;
	/**
	 * Method to remove a (key, value) pair in the dictionary.
	 * 
	 * Precondition: The key already exists in the dictionary.
	 * 
	 * Postcondition: Based on the key, the (key, value) pair is removed 
	 * from the dictionary.
	 * 
	 * @param key The key of the (key, value) pair to remove 
	 * from the dictionary.
	 */
	public void remove(K key);
	/**
	 * Method to update the value of the key in the dictionary.
	 * 
	 * Precondition: The key already exists in the dictionary.
	 * 
	 * Postcondition: Based on the key, updated the new value  
	 * in the dictionary.
	 * 
	 * @param key The key to update.
	 * @param value The new value.
	 */
	public void update(K key, V value);
	/**
	 * Method to return the value of the key in the dictionary.
	 * 
	 * Precondition: The key already exists in the dictionary.
	 * 
	 * Postcondition: A type V value representing the value of the key, 
	 * in the dictionary.
	 * 
	 * @param key The key of the (key, value) pair to remove 
	 * from the dictionary.
	 * @return the value of the key as a type V value
	 */
	public V lookup(K key);
	
}
