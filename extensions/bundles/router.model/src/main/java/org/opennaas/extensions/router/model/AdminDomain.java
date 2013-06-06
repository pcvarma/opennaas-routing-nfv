/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class AdminDomain as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the AdminDomainBean Interface. The CIM class AdminDomain is described as follows:
 * 
 * This is a special grouping of ManagedSystemElements. The grouping is viewed as a single entity, reflecting that all of its components are
 * administered similarly, either by the same user, group of users, or policy. It serves as an aggregation point to associate one or more of the
 * following elements: network devices, such as routers and switches, servers, and other resources that can be accessed by end systems. This grouping
 * of devices plays an essential role in ensuring that the same administrative policy and actions are applied to all of the devices in the grouping.
 * The specific behavior and/or semantics of the AdminDomain can be identified through its aggregated and associated entities.
 */
public class AdminDomain extends System implements Serializable {

	private static final long	serialVersionUID	= 6527668458787487083L;

	/**
	 * This constructor creates a AdminDomainBeanImpl Class which implements the AdminDomainBean Interface, and encapsulates the CIM class AdminDomain
	 * in a Java Bean. The CIM class AdminDomain is described as follows:
	 * 
	 * This is a special grouping of ManagedSystemElements. The grouping is viewed as a single entity, reflecting that all of its components are
	 * administered similarly, either by the same user, group of users, or policy. It serves as an aggregation point to associate one or more of the
	 * following elements: network devices, such as routers and switches, servers, and other resources that can be accessed by end systems. This
	 * grouping of devices plays an essential role in ensuring that the same administrative policy and actions are applied to all of the devices in
	 * the grouping. The specific behavior and/or semantics of the AdminDomain can be identified through its aggregated and associated entities.
	 */
	public AdminDomain() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property NameFormat.
	 */
	@XmlType(name = "AdminDomainNameFormatEnum")
	public enum NameFormat {
		OTHER,
		AUTONOMOUS_SYSTEM,
		NETWORK_ACCESS_PROVIDER,
		NETWORK_OPERATIONS_CENTER,
		POINT_OF_PRESENCE,
		REGIONAL_NETWORK_PROVIDER,
		IP,
		IPX,
		SNA,
		DIAL,
		WAN,
		LAN,
		ISDN,
		FRAME_RELAY,
		ATM,
		E_164,
		INFINIBAND,
		FIBRE_CHANNEL,
		POLICY_REPOSITORY,
		FIBRE_CHANNEL_WORLDWIDE_NAME
	}

	private NameFormat	nameFormat;

	/**
	 * This method returns the AdminDomain.nameFormat property value. This property is described as follows:
	 * 
	 * The NameFormat property identifies how the Name of the AdminDomain is generated, using the heuristic specified in the CIM V2 System Model
	 * specification. The property assumes that to determine and assign a Name the documented rules are traversed in order. The NameFormat Values list
	 * defines the precedence order for assigning the Name of the AdminDomain. "FC" has been deprecated and replaced by "WWN" to be consistent with
	 * the other ValueMaps.
	 * 
	 * @return String current nameFormat property value
	 * @exception Exception
	 */
	public NameFormat getNameFormat() {

		return this.nameFormat;
	} // getNameFormat

	/**
	 * This method sets the AdminDomain.nameFormat property value. This property is described as follows:
	 * 
	 * The NameFormat property identifies how the Name of the AdminDomain is generated, using the heuristic specified in the CIM V2 System Model
	 * specification. The property assumes that to determine and assign a Name the documented rules are traversed in order. The NameFormat Values list
	 * defines the precedence order for assigning the Name of the AdminDomain. "FC" has been deprecated and replaced by "WWN" to be consistent with
	 * the other ValueMaps.
	 * 
	 * @param String
	 *            new nameFormat property value
	 * @exception Exception
	 */
	public void setNameFormat(NameFormat nameFormat) {

		this.nameFormat = nameFormat;
	} // setNameFormat

} // Class AdminDomain