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
* A complex mapping involving three or more entities of two ord more          *
* Ontologies.                                                                 *
*                                                                             *
* @author Daniel Faria                                                        *
******************************************************************************/
package aml.alignment.complex;

import aml.alignment.AbstractMapping;
import aml.alignment.MappingRelation;
import aml.alignment.MappingStatus;

public class EDOALMapping extends AbstractMapping
{

//Constructors

	/**
	 * Creates a mapping between entity1 and entity2 with the given similarity
	 * @param entity1: the EDOAL expression of the source ontology
	 * @param entity2: the EDOAL expression of the target ontology
	 * @param sim: the similarity between the entities
	 */
	public EDOALMapping(EDOALExpression entity1, EDOALExpression entity2, double sim)
	{
		this(entity1,entity2,sim,MappingRelation.EQUIVALENCE,MappingStatus.UNKNOWN);
	}
	
	/**
	 * Creates a mapping between entity1 and entity2 with the given similarity and relation
	 * @param entity1: the uri of the source ontology entity
	 * @param entity2: the uri of the target ontology entity
	 * @param sim: the similarity between the entities
	 * @param r: the mapping relationship between the entities
	 */
	public EDOALMapping(EDOALExpression entity1, EDOALExpression entity2, double sim, MappingRelation r)
	{
		this(entity1,entity2,sim,r,MappingStatus.UNKNOWN);
	}
	
	
	/**
	 * Creates a mapping between entity1 and entity2 with the given similarity, relation and status
	 * @param entity1: the uri of the source ontology entity
	 * @param entity2: the uri of the target ontology entity
	 * @param sim: the similarity between the entities
	 * @param r: the mapping relationship between the entities
	 * @param s: the status of the mapping
	 */
	public EDOALMapping(EDOALExpression entity1, EDOALExpression entity2, double sim, MappingRelation r, MappingStatus s)
	{
		super(entity1, entity2, sim, r, s);
	}
	
	/**
	 * Creates a new mapping that is a copy of m
	 * @param m: the mapping to copy
	 */
	public EDOALMapping(EDOALMapping m)
	{
		this(m.getEntity1(),m.getEntity2(),m.similarity,m.rel,m.status);
	}

//Public Methods

	@Override
	public EDOALExpression getEntity1()
	{
		return (EDOALExpression)entity1;
	}

	@Override
	public EDOALExpression getEntity2()
	{
		return (EDOALExpression)entity2;
	}

	@Override
	public String toRDF()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toTSV()
	{
		// TODO Auto-generated method stub
		return null;
	}
}