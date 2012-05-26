/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Package
///////////////
package com.hp.hpl.jena.ontology.impl;



// Imports
///////////////
import com.hp.hpl.jena.enhanced.*;
import com.hp.hpl.jena.graph.*;
import com.hp.hpl.jena.ontology.*;



/**
 * <p>
 * Implementation of the functional property abstraction
 * </p>
 *
 * @author Ian Dickinson, HP Labs
 *         (<a  href="mailto:ian_dickinson@users.sourceforge.net" >email</a>)
 * @version CVS $Id: InverseFunctionalPropertyImpl.java,v 1.2 2009-10-06 13:04:42 ian_dickinson Exp $
 */
public class InverseFunctionalPropertyImpl
    extends ObjectPropertyImpl
    implements InverseFunctionalProperty
{
    // Constants
    //////////////////////////////////

    // Static variables
    //////////////////////////////////

    /**
     * A factory for generating InverseFunctionalProperty facets from nodes in enhanced graphs.
     * Note: should not be invoked directly by user code: use
     * {@link com.hp.hpl.jena.rdf.model.RDFNode#as as()} instead.
     */
    @SuppressWarnings("hiding")
    public static Implementation factory = new Implementation() {
        @Override
        public EnhNode wrap( Node n, EnhGraph eg ) {
            if (canWrap( n, eg )) {
                return new InverseFunctionalPropertyImpl( n, eg );
            }
            else {
                throw new ConversionException( "Cannot convert node " + n + " to InverseFunctionalProperty - it must have rdf:type owl:InverseFunctionalProperty or equivalent" );
            }
        }

        @Override
        public boolean canWrap( Node node, EnhGraph eg ) {
            // node will support being an InverseFunctionalProperty facet if it has rdf:type owl:InverseFunctionalProperty or equivalent
            Profile profile = (eg instanceof OntModel) ? ((OntModel) eg).getProfile() : null;
            return (profile != null)  &&  profile.isSupported( node, eg, InverseFunctionalProperty.class );
        }
    };


    // Instance variables
    //////////////////////////////////

    // Constructors
    //////////////////////////////////

    /**
     * <p>
     * Construct an inverse functional property node represented by the given node in the given graph.
     * </p>
     *
     * @param n The node that represents the resource
     * @param g The enh graph that contains n
     */
    public InverseFunctionalPropertyImpl( Node n, EnhGraph g ) {
        super( n, g );
    }


    // External signature methods
    //////////////////////////////////

    // Internal implementation methods
    //////////////////////////////////

    //==============================================================================
    // Inner class definitions
    //==============================================================================

}