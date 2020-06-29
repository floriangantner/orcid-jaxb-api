//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 05:31:42 PM CEST 
//


package org.orcid.jaxb.model.common_v3;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * The client application (Member organization's
 * 				system) or user that created the item. XSD VERSION 1.2 UPDATE: the
 * 				identifier for the source may be either an ORCID iD (representing
 * 				individuals and legacy client applications) or a Client ID
 * 				(representing all newer client applications)
 * 			
 * 
 * <p>Java class for source-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="source-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://www.orcid.org/ns/common}source-orcid"/&gt;
 *           &lt;element name="source-client-id" type="{http://www.orcid.org/ns/common}client-id"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="source-name" type="{http://www.orcid.org/ns/common}source-name" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="assertion-origin-orcid" type="{http://www.orcid.org/ns/common}orcid-id"/&gt;
 *           &lt;element name="assertion-origin-client-id" type="{http://www.orcid.org/ns/common}client-id"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="assertion-origin-name" type="{http://www.orcid.org/ns/common}source-name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "source-type", propOrder = {
    "sourceOrcid",
    "sourceClientId",
    "sourceName",
    "assertionOriginOrcid",
    "assertionOriginClientId",
    "assertionOriginName"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
public class SourceType implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "source-orcid")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected OrcidId sourceOrcid;
    @XmlElement(name = "source-client-id")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected ClientId sourceClientId;
    @XmlElement(name = "source-name")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected SourceName sourceName;
    @XmlElement(name = "assertion-origin-orcid")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected OrcidId assertionOriginOrcid;
    @XmlElement(name = "assertion-origin-client-id")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected ClientId assertionOriginClientId;
    @XmlElement(name = "assertion-origin-name")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected SourceName assertionOriginName;

    /**
     * Default no-arg constructor
     * 
     */
    public SourceType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SourceType(final OrcidId sourceOrcid, final ClientId sourceClientId, final SourceName sourceName, final OrcidId assertionOriginOrcid, final ClientId assertionOriginClientId, final SourceName assertionOriginName) {
        this.sourceOrcid = sourceOrcid;
        this.sourceClientId = sourceClientId;
        this.sourceName = sourceName;
        this.assertionOriginOrcid = assertionOriginOrcid;
        this.assertionOriginClientId = assertionOriginClientId;
        this.assertionOriginName = assertionOriginName;
    }

    /**
     * The ORCID identifier for the individual user (or
     * 							legacy client application) that created the item. For identifiers
     * 							of
     * 							individual users, it may be used to look up ORCID record
     * 							details via
     * 							the API.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link OrcidId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public OrcidId getSourceOrcid() {
        return sourceOrcid;
    }

    /**
     * Sets the value of the sourceOrcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrcidId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setSourceOrcid(OrcidId value) {
        this.sourceOrcid = value;
    }

    /**
     * Gets the value of the sourceClientId property.
     * 
     * @return
     *     possible object is
     *     {@link ClientId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public ClientId getSourceClientId() {
        return sourceClientId;
    }

    /**
     * Sets the value of the sourceClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setSourceClientId(ClientId value) {
        this.sourceClientId = value;
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link SourceName }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public SourceName getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceName }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setSourceName(SourceName value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the assertionOriginOrcid property.
     * 
     * @return
     *     possible object is
     *     {@link OrcidId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public OrcidId getAssertionOriginOrcid() {
        return assertionOriginOrcid;
    }

    /**
     * Sets the value of the assertionOriginOrcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrcidId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setAssertionOriginOrcid(OrcidId value) {
        this.assertionOriginOrcid = value;
    }

    /**
     * Gets the value of the assertionOriginClientId property.
     * 
     * @return
     *     possible object is
     *     {@link ClientId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public ClientId getAssertionOriginClientId() {
        return assertionOriginClientId;
    }

    /**
     * Sets the value of the assertionOriginClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setAssertionOriginClientId(ClientId value) {
        this.assertionOriginClientId = value;
    }

    /**
     * Gets the value of the assertionOriginName property.
     * 
     * @return
     *     possible object is
     *     {@link SourceName }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public SourceName getAssertionOriginName() {
        return assertionOriginName;
    }

    /**
     * Sets the value of the assertionOriginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceName }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setAssertionOriginName(SourceName value) {
        this.assertionOriginName = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            OrcidId theSourceOrcid;
            theSourceOrcid = this.getSourceOrcid();
            strategy.appendField(locator, this, "sourceOrcid", buffer, theSourceOrcid);
        }
        {
            ClientId theSourceClientId;
            theSourceClientId = this.getSourceClientId();
            strategy.appendField(locator, this, "sourceClientId", buffer, theSourceClientId);
        }
        {
            SourceName theSourceName;
            theSourceName = this.getSourceName();
            strategy.appendField(locator, this, "sourceName", buffer, theSourceName);
        }
        {
            OrcidId theAssertionOriginOrcid;
            theAssertionOriginOrcid = this.getAssertionOriginOrcid();
            strategy.appendField(locator, this, "assertionOriginOrcid", buffer, theAssertionOriginOrcid);
        }
        {
            ClientId theAssertionOriginClientId;
            theAssertionOriginClientId = this.getAssertionOriginClientId();
            strategy.appendField(locator, this, "assertionOriginClientId", buffer, theAssertionOriginClientId);
        }
        {
            SourceName theAssertionOriginName;
            theAssertionOriginName = this.getAssertionOriginName();
            strategy.appendField(locator, this, "assertionOriginName", buffer, theAssertionOriginName);
        }
        return buffer;
    }

}