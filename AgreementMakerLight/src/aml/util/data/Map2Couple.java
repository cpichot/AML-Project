/******************************************************************************
* Copyright 2013-2018 LASIGE                                                  *
*                                                                             *
* Licensed under the Apache License, Version 2.0 (the "License"); you may     *
* not use this file except in compliance with the License. You may obtain a   *
* copy of the License at http://www.apache.org/licenses/LICENSE-2.0           *
*                                                                             *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.                                              *
*                                                                             *
*******************************************************************************
* A table with three columns, where the last two are fixed for the first.     *
*                                                                             *
* @author Daniel Faria                                                        *
******************************************************************************/
package aml.util.data;

import java.util.HashMap;
import java.util.Set;

public class Map2Couple<A,B,C>
{

//Attributes
	
	private HashMap<A,Couple<B,C>> multimap;
	
//Constructors

	/**
	 * Constructs a new empty Table
	 */
	public Map2Couple()
	{
		multimap = new HashMap<A,Couple<B,C>>();
	}
	
	/**
	 * Constructs a new Table that is a copy of
	 * the given Table
	 * @param m: the Table to copy
	 */
	public Map2Couple(Map2Couple<A,B,C> m)
	{
		multimap = new HashMap<A,Couple<B,C>>(m.multimap);
	}

//Public Methods
	
	/**
	 * Adds the value for the given keys to the Table
	 * @param keyA: the key to add to the Table
	 * @param elB: the first element in the Couple
	 * @param elC: the second element in the Couple
	 */
	public void add(A keyA, B elB, C elC)
	{
		Couple<B,C> t = new Couple<B,C>(elB,elC);
		multimap.put(keyA,t);
	}
	
	/**
	 * @param keyA: the first level key to search in the Table
	 * @return whether the Table contains the first level keyA
	 */
	public boolean contains(A keyA)
	{
		return multimap.containsKey(keyA);
	}

	/**
	 * @param keyA: the first level key to search in the Table
	 * @return the Couple corresponding to keyA
	 */
	public Couple<B,C> get(A keyA)
	{
		return multimap.get(keyA);
	}
	
	/**
	 * @param keyA: the first level key to search in the Table
	 * @return the element1 in the Couple corresponding to keyA
	 */
	public B get1(A keyA)
	{
		return multimap.get(keyA).get1();
	}

	/**
	 * @param keyA: the first level key to search in the Table
	 * @return the element2 in the Couple corresponding to keyA
	 */
	public C get2(A keyA)
	{
		return multimap.get(keyA).get2();
	}

	/**
	 * @return the set of first level keys in the Table
	 */
	public Set<A> keySet()
	{
		return multimap.keySet();
	}
	
	/**
	 * @return the total number of entries in the Table
	 */
	public int size()
	{
		return multimap.size();
	}
}