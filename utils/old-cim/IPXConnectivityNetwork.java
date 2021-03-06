/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class IPXConnectivityNetwork as well as methods comparable
 * to the invokeMethods defined for this class. This Class implements the IPXConnectivityNetworkBean Interface. The CIM class IPXConnectivityNetwork
 * is described as follows:
 * 
 * A network or subnet that uses the IPX protocol.
 */
public class IPXConnectivityNetwork extends ConnectivityCollection implements
		Serializable {

	/**
	 * This constructor creates a IPXConnectivityNetworkBeanImpl Class which implements the IPXConnectivityNetworkBean Interface, and encapsulates the
	 * CIM class IPXConnectivityNetwork in a Java Bean. The CIM class IPXConnectivityNetwork is described as follows:
	 * 
	 * A network or subnet that uses the IPX protocol.
	 */
	public IPXConnectivityNetwork() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property networkNumber.
	 */
	private String	networkNumber;

	/**
	 * This method returns the IPXConnectivityNetwork.networkNumber property value. This property is described as follows:
	 * 
	 * An IPX network number formatted as eight hexadecimal digits (e.g., "00112233").
	 * 
	 * @return String current networkNumber property value
	 * @exception Exception
	 */
	public String getNetworkNumber() {

		return this.networkNumber;
	} // getNetworkNumber

	/**
	 * This method sets the IPXConnectivityNetwork.networkNumber property value. This property is described as follows:
	 * 
	 * An IPX network number formatted as eight hexadecimal digits (e.g., "00112233").
	 * 
	 * @param String
	 *            new networkNumber property value
	 * @exception Exception
	 */
	public void setNetworkNumber(String networkNumber) {

		this.networkNumber = networkNumber;
	} // setNetworkNumber

} // Class IPXConnectivityNetwork
