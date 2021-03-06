/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.Serializable;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class BGPProtocolEndpoint as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the BGPProtocolEndpointBean Interface. The CIM class BGPProtocolEndpoint is
 * described as follows:
 * 
 * A ProtocolEndpoint that is dedicated to running BGP.
 */
public class BGPProtocolEndpoint extends ProtocolEndpoint implements
		Serializable {

	/**
	 * This constructor creates a BGPProtocolEndpointBeanImpl Class which implements the BGPProtocolEndpointBean Interface, and encapsulates the CIM
	 * class BGPProtocolEndpoint in a Java Bean. The CIM class BGPProtocolEndpoint is described as follows:
	 * 
	 * A ProtocolEndpoint that is dedicated to running BGP.
	 */
	public BGPProtocolEndpoint() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property isEBGP.
	 */
	private boolean	isEBGP;

	/**
	 * This method returns the BGPProtocolEndpoint.isEBGP property value. This property is described as follows:
	 * 
	 * A boolean that, when TRUE, signifies that this is an instance of the external version of BGP (FALSE is the internal version).
	 * 
	 * @return boolean current isEBGP property value
	 * @exception Exception
	 */
	public boolean isIsEBGP() {

		return this.isEBGP;
	} // getIsEBGP

	/**
	 * This method sets the BGPProtocolEndpoint.isEBGP property value. This property is described as follows:
	 * 
	 * A boolean that, when TRUE, signifies that this is an instance of the external version of BGP (FALSE is the internal version).
	 * 
	 * @param boolean new isEBGP property value
	 * @exception Exception
	 */
	public void setIsEBGP(boolean isEBGP) {

		this.isEBGP = isEBGP;
	} // setIsEBGP

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property isEBGPMultihop.
	 */
	private boolean	isEBGPMultihop;

	/**
	 * This method returns the BGPProtocolEndpoint.isEBGPMultihop property value. This property is described as follows:
	 * 
	 * Normally, two routers running EBGP must be physically connected. This boolean, when TRUE, denotes a LOGICAL connection between two routers that
	 * are running EBGP (e.g., there is an intermediate router or interface between them).
	 * 
	 * @return boolean current isEBGPMultihop property value
	 * @exception Exception
	 */
	public boolean isIsEBGPMultihop() {

		return this.isEBGPMultihop;
	} // getIsEBGPMultihop

	/**
	 * This method sets the BGPProtocolEndpoint.isEBGPMultihop property value. This property is described as follows:
	 * 
	 * Normally, two routers running EBGP must be physically connected. This boolean, when TRUE, denotes a LOGICAL connection between two routers that
	 * are running EBGP (e.g., there is an intermediate router or interface between them).
	 * 
	 * @param boolean new isEBGPMultihop property value
	 * @exception Exception
	 */
	public void setIsEBGPMultihop(boolean isEBGPMultihop) {

		this.isEBGPMultihop = isEBGPMultihop;
	} // setIsEBGPMultihop

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property localIdentifier.
	 */
	private String	localIdentifier;

	/**
	 * This method returns the BGPProtocolEndpoint.localIdentifier property value. This property is described as follows:
	 * 
	 * This is the unique identifier of the local BGP router. This is often the router ID (e.g., an IP address).
	 * 
	 * @return String current localIdentifier property value
	 * @exception Exception
	 */
	public String getLocalIdentifier() {

		return this.localIdentifier;
	} // getLocalIdentifier

	/**
	 * This method sets the BGPProtocolEndpoint.localIdentifier property value. This property is described as follows:
	 * 
	 * This is the unique identifier of the local BGP router. This is often the router ID (e.g., an IP address).
	 * 
	 * @param String
	 *            new localIdentifier property value
	 * @exception Exception
	 */
	public void setLocalIdentifier(String localIdentifier) {

		this.localIdentifier = localIdentifier;
	} // setLocalIdentifier

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property peerIdentifier.
	 */
	private String	peerIdentifier;

	/**
	 * This method returns the BGPProtocolEndpoint.peerIdentifier property value. This property is described as follows:
	 * 
	 * This is the unique identifier of the peer BGP router. This is often the router ID (e.g., an IP address).
	 * 
	 * @return String current peerIdentifier property value
	 * @exception Exception
	 */
	public String getPeerIdentifier() {

		return this.peerIdentifier;
	} // getPeerIdentifier

	/**
	 * This method sets the BGPProtocolEndpoint.peerIdentifier property value. This property is described as follows:
	 * 
	 * This is the unique identifier of the peer BGP router. This is often the router ID (e.g., an IP address).
	 * 
	 * @param String
	 *            new peerIdentifier property value
	 * @exception Exception
	 */
	public void setPeerIdentifier(String peerIdentifier) {

		this.peerIdentifier = peerIdentifier;
	} // setPeerIdentifier

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property State.
	 */

	public enum State {
		IDLE,
		CONNECT,
		ACTIVE,
		OPENSET,
		OPENCONFIRM,
		ESTABLISHED
	}

	private State	state;

	/**
	 * This method returns the BGPProtocolEndpoint.state property value. This property is described as follows:
	 * 
	 * This defines the current connection state of the BGP Peer.
	 * 
	 * @return int current state property value
	 * @exception Exception
	 */
	public State getState() {

		return this.state;
	} // getState

	/**
	 * This method sets the BGPProtocolEndpoint.state property value. This property is described as follows:
	 * 
	 * This defines the current connection state of the BGP Peer.
	 * 
	 * @param int new state property value
	 * @exception Exception
	 */
	public void setState(State state) {

		this.state = state;
	} // setState

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property AdminStatus.
	 */
	@Deprecated
	public enum AdminStatus {
		STOP,
		START
	}

	@Deprecated
	private AdminStatus	adminStatus;

	/**
	 * This method returns the BGPProtocolEndpoint.adminStatus property value. This property is described as follows:
	 * 
	 * This defines the desired state of the BGP connection. It is equivalent to the RequestedState property (i.e., enabled/disabled status) that is
	 * inherited from EnabledLogicalElement. AdminStatus is deprecated in lieu of this inherited property.
	 * 
	 * @return int current adminStatus property value
	 * @exception Exception
	 */
	@Deprecated
	public AdminStatus getAdminStatus() {

		return this.adminStatus;
	} // getAdminStatus

	/**
	 * This method sets the BGPProtocolEndpoint.adminStatus property value. This property is described as follows:
	 * 
	 * This defines the desired state of the BGP connection. It is equivalent to the RequestedState property (i.e., enabled/disabled status) that is
	 * inherited from EnabledLogicalElement. AdminStatus is deprecated in lieu of this inherited property.
	 * 
	 * @param int new adminStatus property value
	 * @exception Exception
	 */
	@Deprecated
	public void setAdminStatus(AdminStatus adminStatus) {

		this.adminStatus = adminStatus;
	} // setAdminStatus

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property negotiatedVersion.
	 */
	private String	negotiatedVersion;

	/**
	 * This method returns the BGPProtocolEndpoint.negotiatedVersion property value. This property is described as follows:
	 * 
	 * This defines the negotiated version of BGP that is running between the two peers.
	 * 
	 * @return String current negotiatedVersion property value
	 * @exception Exception
	 */
	public String getNegotiatedVersion() {

		return this.negotiatedVersion;
	} // getNegotiatedVersion

	/**
	 * This method sets the BGPProtocolEndpoint.negotiatedVersion property value. This property is described as follows:
	 * 
	 * This defines the negotiated version of BGP that is running between the two peers.
	 * 
	 * @param String
	 *            new negotiatedVersion property value
	 * @exception Exception
	 */
	public void setNegotiatedVersion(String negotiatedVersion) {

		this.negotiatedVersion = negotiatedVersion;
	} // setNegotiatedVersion

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property localAddress.
	 */
	@Deprecated
	private String	localAddress;

	/**
	 * This method returns the BGPProtocolEndpoint.localAddress property value. This property is described as follows:
	 * 
	 * This is the local IP address of this router's BGP connection. It is deprecated since a binding should be defined using the CIM_BindsTo
	 * association. Ideally the binding is to a TCPProtocolEndpoint which then handles the association to its IPEndpoint.
	 * 
	 * @return String current localAddress property value
	 * @exception Exception
	 */
	@Deprecated
	public String getLocalAddress() {

		return this.localAddress;
	} // getLocalAddress

	/**
	 * This method sets the BGPProtocolEndpoint.localAddress property value. This property is described as follows:
	 * 
	 * This is the local IP address of this router's BGP connection. It is deprecated since a binding should be defined using the CIM_BindsTo
	 * association. Ideally the binding is to a TCPProtocolEndpoint which then handles the association to its IPEndpoint.
	 * 
	 * @param String
	 *            new localAddress property value
	 * @exception Exception
	 */
	@Deprecated
	public void setLocalAddress(String localAddress) {

		this.localAddress = localAddress;
	} // setLocalAddress

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property localPort.
	 */
	@Deprecated
	private int	localPort;

	/**
	 * This method returns the BGPProtocolEndpoint.localPort property value. This property is described as follows:
	 * 
	 * This is the local port number for the TCP connection of this router's BGP connection. It is deprecated since a binding should be defined (to a
	 * TCPProtocolEndpoint) using the CIM_BindsTo association.
	 * 
	 * @return int current localPort property value
	 * @exception Exception
	 */
	@Deprecated
	public int getLocalPort() {

		return this.localPort;
	} // getLocalPort

	/**
	 * This method sets the BGPProtocolEndpoint.localPort property value. This property is described as follows:
	 * 
	 * This is the local port number for the TCP connection of this router's BGP connection. It is deprecated since a binding should be defined (to a
	 * TCPProtocolEndpoint) using the CIM_BindsTo association.
	 * 
	 * @param int new localPort property value
	 * @exception Exception
	 */
	@Deprecated
	public void setLocalPort(int localPort) {

		this.localPort = localPort;
	} // setLocalPort

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property remoteAddress.
	 */
	@Deprecated
	private String	remoteAddress;

	/**
	 * This method returns the BGPProtocolEndpoint.remoteAddress property value. This property is described as follows:
	 * 
	 * This is the remote IP address of this router's BGP connection. It is deprecated since a binding to a Remote ServiceAccessPoint should be
	 * instantiated, using CIM_BindsTo.
	 * 
	 * @return String current remoteAddress property value
	 * @exception Exception
	 */
	@Deprecated
	public String getRemoteAddress() {

		return this.remoteAddress;
	} // getRemoteAddress

	/**
	 * This method sets the BGPProtocolEndpoint.remoteAddress property value. This property is described as follows:
	 * 
	 * This is the remote IP address of this router's BGP connection. It is deprecated since a binding to a Remote ServiceAccessPoint should be
	 * instantiated, using CIM_BindsTo.
	 * 
	 * @param String
	 *            new remoteAddress property value
	 * @exception Exception
	 */
	@Deprecated
	public void setRemoteAddress(String remoteAddress) {

		this.remoteAddress = remoteAddress;
	} // setRemoteAddress

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property remotePort.
	 */
	@Deprecated
	private int	remotePort;

	/**
	 * This method returns the BGPProtocolEndpoint.remotePort property value. This property is described as follows:
	 * 
	 * This is the remote port number for the TCP connection of this router's BGP connection. It is deprecated since a binding to a RemotePort should
	 * be instantiated, using CIM_BindsTo.
	 * 
	 * @return int current remotePort property value
	 * @exception Exception
	 */
	@Deprecated
	public int getRemotePort() {

		return this.remotePort;
	} // getRemotePort

	/**
	 * This method sets the BGPProtocolEndpoint.remotePort property value. This property is described as follows:
	 * 
	 * This is the remote port number for the TCP connection of this router's BGP connection. It is deprecated since a binding to a RemotePort should
	 * be instantiated, using CIM_BindsTo.
	 * 
	 * @param int new remotePort property value
	 * @exception Exception
	 */
	@Deprecated
	public void setRemotePort(int remotePort) {

		this.remotePort = remotePort;
	} // setRemotePort

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property remoteAS.
	 */
	private int	remoteAS;

	/**
	 * This method returns the BGPProtocolEndpoint.remoteAS property value. This property is described as follows:
	 * 
	 * This is the remote AS number for this router's BGP connection.
	 * 
	 * @return int current remoteAS property value
	 * @exception Exception
	 */
	public int getRemoteAS() {

		return this.remoteAS;
	} // getRemoteAS

	/**
	 * This method sets the BGPProtocolEndpoint.remoteAS property value. This property is described as follows:
	 * 
	 * This is the remote AS number for this router's BGP connection.
	 * 
	 * @param int new remoteAS property value
	 * @exception Exception
	 */
	public void setRemoteAS(int remoteAS) {

		this.remoteAS = remoteAS;
	} // setRemoteAS

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property connectRetryInterval.
	 */
	private long	connectRetryInterval;

	/**
	 * This method returns the BGPProtocolEndpoint.connectRetryInterval property value. This property is described as follows:
	 * 
	 * This defines the time interval, in seconds, for the ConnectRetry timer. The suggested value is 120 seconds.
	 * 
	 * @return long current connectRetryInterval property value
	 * @exception Exception
	 */
	public long getConnectRetryInterval() {

		return this.connectRetryInterval;
	} // getConnectRetryInterval

	/**
	 * This method sets the BGPProtocolEndpoint.connectRetryInterval property value. This property is described as follows:
	 * 
	 * This defines the time interval, in seconds, for the ConnectRetry timer. The suggested value is 120 seconds.
	 * 
	 * @param long new connectRetryInterval property value
	 * @exception Exception
	 */
	public void setConnectRetryInterval(long connectRetryInterval) {

		this.connectRetryInterval = connectRetryInterval;
	} // setConnectRetryInterval

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property holdTimeConfigured.
	 */
	private int	holdTimeConfigured;

	/**
	 * This method returns the BGPProtocolEndpoint.holdTimeConfigured property value. This property is described as follows:
	 * 
	 * This defines the time interval in seconds for the Hold Time configured for this BGP speaker with a peer. This value is placed in an OPEN
	 * message sent to a peer by this BGP speaker, and is compared with the Hold Time field in the OPEN message received from the peer. It enables
	 * this speaker to establish a mutually agreeable Hold Time with the peer. This value must not be less than three seconds. If it is zero, then the
	 * Hold Time is NOT to be established with the peer. The suggested value for this timer is 90 seconds.
	 * 
	 * @return int current holdTimeConfigured property value
	 * @exception Exception
	 */
	public int getHoldTimeConfigured() {

		return this.holdTimeConfigured;
	} // getHoldTimeConfigured

	/**
	 * This method sets the BGPProtocolEndpoint.holdTimeConfigured property value. This property is described as follows:
	 * 
	 * This defines the time interval in seconds for the Hold Time configured for this BGP speaker with a peer. This value is placed in an OPEN
	 * message sent to a peer by this BGP speaker, and is compared with the Hold Time field in the OPEN message received from the peer. It enables
	 * this speaker to establish a mutually agreeable Hold Time with the peer. This value must not be less than three seconds. If it is zero, then the
	 * Hold Time is NOT to be established with the peer. The suggested value for this timer is 90 seconds.
	 * 
	 * @param int new holdTimeConfigured property value
	 * @exception Exception
	 */
	public void setHoldTimeConfigured(int holdTimeConfigured) {

		this.holdTimeConfigured = holdTimeConfigured;
	} // setHoldTimeConfigured

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property keepAliveConfigured.
	 */
	private int	keepAliveConfigured;

	/**
	 * This method returns the BGPProtocolEndpoint.keepAliveConfigured property value. This property is described as follows:
	 * 
	 * This defines the time interval in seconds for the KeepAlive timer configured for this BGP speaker with a peer. This value will determine the
	 * frequency of the KEEPALIVE messages relative to the value of the HoldTimeConfigured property; the actual frequency is specified by the value of
	 * the KeepAlive property. A reasonable value is one third of that of the value of the HoldTimeConfigured property. If it is zero, then NO
	 * periodic KEEPALIVE messages are sent to the peer. The suggested value for this property is 30 seconds. The maximum value of this property is
	 * 21845 seconds.
	 * 
	 * @return int current keepAliveConfigured property value
	 * @exception Exception
	 */
	public int getKeepAliveConfigured() {

		return this.keepAliveConfigured;
	} // getKeepAliveConfigured

	/**
	 * This method sets the BGPProtocolEndpoint.keepAliveConfigured property value. This property is described as follows:
	 * 
	 * This defines the time interval in seconds for the KeepAlive timer configured for this BGP speaker with a peer. This value will determine the
	 * frequency of the KEEPALIVE messages relative to the value of the HoldTimeConfigured property; the actual frequency is specified by the value of
	 * the KeepAlive property. A reasonable value is one third of that of the value of the HoldTimeConfigured property. If it is zero, then NO
	 * periodic KEEPALIVE messages are sent to the peer. The suggested value for this property is 30 seconds. The maximum value of this property is
	 * 21845 seconds.
	 * 
	 * @param int new keepAliveConfigured property value
	 * @exception Exception
	 */
	public void setKeepAliveConfigured(int keepAliveConfigured) {

		this.keepAliveConfigured = keepAliveConfigured;
	} // setKeepAliveConfigured

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property minASOriginationInterval.
	 */
	private int	minASOriginationInterval;

	/**
	 * This method returns the BGPProtocolEndpoint.minASOriginationInterval property value. This property is described as follows:
	 * 
	 * This defines the time interval in seconds for the MinASOriginationInterval timer. The suggested value for this property is 15 seconds.
	 * 
	 * @return int current minASOriginationInterval property value
	 * @exception Exception
	 */
	public int getMinASOriginationInterval() {

		return this.minASOriginationInterval;
	} // getMinASOriginationInterval

	/**
	 * This method sets the BGPProtocolEndpoint.minASOriginationInterval property value. This property is described as follows:
	 * 
	 * This defines the time interval in seconds for the MinASOriginationInterval timer. The suggested value for this property is 15 seconds.
	 * 
	 * @param int new minASOriginationInterval property value
	 * @exception Exception
	 */
	public void setMinASOriginationInterval(int minASOriginationInterval) {

		this.minASOriginationInterval = minASOriginationInterval;
	} // setMinASOriginationInterval

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property minRouteAdvertisementInterval.
	 */
	private int	minRouteAdvertisementInterval;

	/**
	 * This method returns the BGPProtocolEndpoint.minRouteAdvertisementInterval property value. This property is described as follows:
	 * 
	 * This defines the time interval in seconds for the MinRouteAdvertisementInterval timer. The suggested value for this property is 30 seconds.
	 * 
	 * @return int current minRouteAdvertisementInterval property value
	 * @exception Exception
	 */
	public int getMinRouteAdvertisementInterval() {

		return this.minRouteAdvertisementInterval;
	} // getMinRouteAdvertisementInterval

	/**
	 * This method sets the BGPProtocolEndpoint.minRouteAdvertisementInterval property value. This property is described as follows:
	 * 
	 * This defines the time interval in seconds for the MinRouteAdvertisementInterval timer. The suggested value for this property is 30 seconds.
	 * 
	 * @param int new minRouteAdvertisementInterval property value
	 * @exception Exception
	 */
	public void setMinRouteAdvertisementInterval(int
			minRouteAdvertisementInterval) {

		this.minRouteAdvertisementInterval = minRouteAdvertisementInterval;
	} // setMinRouteAdvertisementInterval

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property holdTime.
	 */
	private int	holdTime;

	/**
	 * This method returns the BGPProtocolEndpoint.holdTime property value. This property is described as follows:
	 * 
	 * This defines the maximum amount of time in seconds that may elapse between the receipt of successive KEEPALIVE or UPDATE messages. This is
	 * instrumented as a counter that increments from zero to the value specified in this property. The value of this property is calculated by the
	 * BGP speaker by using the smaller of the values of bgpPeerHoldTimeConfigured and the Hold Time received in the OPEN message. This value, if not
	 * zero seconds, must be at least three seconds, up to a maximum of 65535 seconds. Receipt of either a KEEPALIVE or an UPDATE message resets this
	 * value.
	 * 
	 * @return int current holdTime property value
	 * @exception Exception
	 */
	public int getHoldTime() {

		return this.holdTime;
	} // getHoldTime

	/**
	 * This method sets the BGPProtocolEndpoint.holdTime property value. This property is described as follows:
	 * 
	 * This defines the maximum amount of time in seconds that may elapse between the receipt of successive KEEPALIVE or UPDATE messages. This is
	 * instrumented as a counter that increments from zero to the value specified in this property. The value of this property is calculated by the
	 * BGP speaker by using the smaller of the values of bgpPeerHoldTimeConfigured and the Hold Time received in the OPEN message. This value, if not
	 * zero seconds, must be at least three seconds, up to a maximum of 65535 seconds. Receipt of either a KEEPALIVE or an UPDATE message resets this
	 * value.
	 * 
	 * @param int new holdTime property value
	 * @exception Exception
	 */
	public void setHoldTime(int holdTime) {

		this.holdTime = holdTime;
	} // setHoldTime

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property keepAlive.
	 */
	private int	keepAlive;

	/**
	 * This method returns the BGPProtocolEndpoint.keepAlive property value. This property is described as follows:
	 * 
	 * This defines the time interval in seconds for the KeepAlive timer established with the peer. The value of this property is calculated by the
	 * speaker such that, when compared with the HoldTime property, it has the same proportion as the KeepAliveConfigured property has with the
	 * HoldTimeConfigured property. A value of 0 indicates that the KeepAlive timer has not yet been established. The maximum value of this property
	 * is 21845 seconds.
	 * 
	 * @return int current keepAlive property value
	 * @exception Exception
	 */
	public int getKeepAlive() {

		return this.keepAlive;
	} // getKeepAlive

	/**
	 * This method sets the BGPProtocolEndpoint.keepAlive property value. This property is described as follows:
	 * 
	 * This defines the time interval in seconds for the KeepAlive timer established with the peer. The value of this property is calculated by the
	 * speaker such that, when compared with the HoldTime property, it has the same proportion as the KeepAliveConfigured property has with the
	 * HoldTimeConfigured property. A value of 0 indicates that the KeepAlive timer has not yet been established. The maximum value of this property
	 * is 21845 seconds.
	 * 
	 * @param int new keepAlive property value
	 * @exception Exception
	 */
	public void setKeepAlive(int keepAlive) {

		this.keepAlive = keepAlive;
	} // setKeepAlive

} // Class BGPProtocolEndpoint
