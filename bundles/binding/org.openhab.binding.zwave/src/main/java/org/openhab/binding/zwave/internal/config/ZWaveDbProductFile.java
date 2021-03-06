/**
 * Copyright (c) 2010-2014, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.zwave.internal.config;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * Implements the top level class for the product file
 * @author Chris Jackson
 * @since 1.4.0
 *
 */
public class ZWaveDbProductFile {
	public String Model;
	public Integer Endpoints;
	@XStreamImplicit
	public List<ZWaveDbLabel> Label;

	public ZWaveDbCommandClassList CommandClasses;

	public ZWaveDbConfiguration Configuration;
	public ZWaveDbAssociation Associations;

	List<ZWaveDbConfigurationParameter> getConfiguration() {
		if(Configuration == null) {
			return null;
		}
		return Configuration.Parameter;
	}
	
	List<ZWaveDbAssociationGroup> getAssociations() {
		if(Associations == null) {
			return null;
		}
		return Associations.Group;
	}

	class ZWaveDbCommandClassList {
		@XStreamImplicit
		public List<ZWaveDbCommandClass> Class;		
	}
	
	class ZWaveDbConfiguration {
		@XStreamImplicit
		public List<ZWaveDbConfigurationParameter> Parameter;		
	}

	class ZWaveDbAssociation {
		@XStreamImplicit
		List<ZWaveDbAssociationGroup> Group;
	}
}
	
