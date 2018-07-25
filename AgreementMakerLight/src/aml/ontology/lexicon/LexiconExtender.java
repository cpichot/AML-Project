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
* An algorithm that extends a Lexicon by adding new synonyms.                 *                                                                 *
*                                                                             *
* @author Daniel Faria                                                        *
******************************************************************************/
package aml.ontology.lexicon;

import aml.ontology.Ontology;

public interface LexiconExtender
{
	/**
	 * Extends the Lexicon of the given Ontology
	 */
	public void extendLexicon(Ontology o);
}
