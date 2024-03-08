package implementations;

import java.util.ArrayList;
import exceptions.DuplicateKeyException;
import utilities.DictionaryADT;

public class Dictionary<K,V> implements DictionaryADT<K,V>
{
	// constant
	private static final int DEFAULT_SIZE = 10;
	
	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;

	public Dictionary() {
		keys = new ArrayList<>(DEFAULT_SIZE);
		values = new ArrayList<>(DEFAULT_SIZE);
	}
	
	public ArrayList<K> getKeys() {
		return keys;
	}
	public ArrayList<V> getValues() {
		return values;
	}
	
	public void insert(K key, V value)throws DuplicateKeyException{
		if (keys.contains(key)) {
			throw new DuplicateKeyException("Key already exists in the dictionary");
		}
		keys.add(key);
		values.add(value);
	}
	
	public void remove(K key) {
		int index = keys.indexOf(key);
		keys.remove(index);
		values.remove(index);
	}
	
	public void update(K key, V value) {
		values.set(keys.indexOf(key), value);
	}
	
	public V lookup(K key) {
		return values.get(keys.indexOf(key));
	}
}
