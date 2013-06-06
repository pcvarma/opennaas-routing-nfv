/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ForwardingService as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the ForwardingServiceBean Interface. The CIM class ForwardingService is described as
 * follows:
 * 
 * This class represents the functions used in forwarding network traffic. Its instances act on packets received from one or more ProtocolEndpoints or
 * Services, and drop (discard), or send those packets to one or more other ProtocolEndpoints or Services. The explicit Endpoints being forwarded
 * between, are described using the ForwardsAmong association (or one of its subclasses). Generally, the Endpoints are at the same protocol layer and
 * are usually of similar types, or of the same type. ForwardingService is different than RouteCalculation Service in that it represents the function
 * of forwarding traffic independent of calculating routing information. Examining the ForwardingService class definition, note that its superclass
 * NetworkService is deprecated. Therefore, NetworkService's properties need not be implemented in an instance of ForwardingService. Unfortunately,
 * NetworkService cannot be removed from the object hierarchy without a major Schema release. When/if this occurs, the NetworkService superclass will
 * be removed, and ForwardingService will subclass from CIM_Service directly. Also note that there are a large number of additional protocols that are
 * not currently modeled. These will be added over time.
 */
public class ForwardingService extends NetworkService implements Serializable
{

	/**
	 * This constructor creates a ForwardingServiceBeanImpl Class which implements the ForwardingServiceBean Interface, and encapsulates the CIM class
	 * ForwardingService in a Java Bean. The CIM class ForwardingService is described as follows:
	 * 
	 * This class represents the functions used in forwarding network traffic. Its instances act on packets received from one or more
	 * ProtocolEndpoints or Services, and drop (discard), or send those packets to one or more other ProtocolEndpoints or Services. The explicit
	 * Endpoints being forwarded between, are described using the ForwardsAmong association (or one of its subclasses). Generally, the Endpoints are
	 * at the same protocol layer and are usually of similar types, or of the same type. ForwardingService is different than RouteCalculation Service
	 * in that it represents the function of forwarding traffic independent of calculating routing information. Examining the ForwardingService class
	 * definition, note that its superclass NetworkService is deprecated. Therefore, NetworkService's properties need not be implemented in an
	 * instance of ForwardingService. Unfortunately, NetworkService cannot be removed from the object hierarchy without a major Schema release.
	 * When/if this occurs, the NetworkService superclass will be removed, and ForwardingService will subclass from CIM_Service directly. Also note
	 * that there are a large number of additional protocols that are not currently modeled. These will be added over time.
	 */
	public ForwardingService() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property ProtocolType.
	 */

	public enum ProtocolType {
		UNKNOWN,
		OTHER,
		IPV4,
		IPV6,
		IPV4_IPV6,
		IPX,
		APPLETALK,
		DECNET,
		SNA,
		CONP,
		CLNP,
		VINES,
		XNS,
		ATM,
		FRAME_RELAY,
		ETHERNET,
		TOKENRING,
		FDDI,
		INFINIBAND,
		FIBRE_CHANNEL
	}

	private ProtocolType	protocolType;

	/**
	 * This method returns the ForwardingService.protocolType property value. This property is described as follows:
	 * 
	 * This defines the type of protocol that is being forwarded.
	 * 
	 * @return int current protocolType property value
	 * @exception Exception
	 */
	public ProtocolType getProtocolType() {

		return this.protocolType;
	} // getProtocolType

	/**
	 * This method sets the ForwardingService.protocolType property value. This property is described as follows:
	 * 
	 * This defines the type of protocol that is being forwarded.
	 * 
	 * @param int new protocolType property value
	 * @exception Exception
	 */
	public void setProtocolType(ProtocolType protocolType) {

		this.protocolType = protocolType;
	} // setProtocolType

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherProtocolType.
	 */
	private String	otherProtocolType;

	/**
	 * This method returns the ForwardingService.otherProtocolType property value. This property is described as follows:
	 * 
	 * This defines the type of protocol that is being forwarded when the value of the ProtocolType attribute is 1 (i.e., "Other"). This provides for
	 * future extensibility.
	 * 
	 * @return String current otherProtocolType property value
	 * @exception Exception
	 */
	public String getOtherProtocolType() {

		return this.otherProtocolType;
	} // getOtherProtocolType

	/**
	 * This method sets the ForwardingService.otherProtocolType property value. This property is described as follows:
	 * 
	 * This defines the type of protocol that is being forwarded when the value of the ProtocolType attribute is 1 (i.e., "Other"). This provides for
	 * future extensibility.
	 * 
	 * @param String
	 *            new otherProtocolType property value
	 * @exception Exception
	 */
	public void setOtherProtocolType(String otherProtocolType) {

		this.otherProtocolType = otherProtocolType;
	} // setOtherProtocolType

} // Class ForwardingService