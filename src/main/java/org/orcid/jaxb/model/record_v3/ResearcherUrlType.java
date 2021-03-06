//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 05:31:42 PM CEST 
//


package org.orcid.jaxb.model.record_v3;

import java.io.Serializable;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.orcid.jaxb.model.common_v3.CreatedDate;
import org.orcid.jaxb.model.common_v3.ElementSummary;
import org.orcid.jaxb.model.common_v3.LastModifiedDate;
import org.orcid.jaxb.model.common_v3.SourceType;
import org.orcid.jaxb.model.common_v3.Url;
import org.orcid.jaxb.model.common_v3.Visibility;


/**
 * <p>Java class for researcher-url complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="researcher-url"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orcid.org/ns/common}element-summary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="url-name" type="{http://www.orcid.org/ns/common}string-350" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.orcid.org/ns/common}url"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "researcher-url", namespace = "http://www.orcid.org/ns/researcher-url", propOrder = {
    "urlName",
    "url"
})
@XmlSeeAlso({
    ResearcherUrl.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
public class ResearcherUrlType
    extends ElementSummary
    implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "url-name")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected String urlName;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected Url url;

    /**
     * Default no-arg constructor
     * 
     */
    public ResearcherUrlType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ResearcherUrlType(final CreatedDate createdDate, final LastModifiedDate lastModifiedDate, final SourceType source, final BigInteger putCode, final Visibility visibility, final String displayIndex, final String path, final String urlName, final Url url) {
        super(createdDate, lastModifiedDate, source, putCode, visibility, displayIndex, path);
        this.urlName = urlName;
        this.url = url;
    }

    /**
     * Gets the value of the urlName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public String getUrlName() {
        return urlName;
    }

    /**
     * Sets the value of the urlName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setUrlName(String value) {
        this.urlName = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Url }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public Url getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Url }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setUrl(Url value) {
        this.url = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            String theUrlName;
            theUrlName = this.getUrlName();
            strategy.appendField(locator, this, "urlName", buffer, theUrlName);
        }
        {
            Url theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        return buffer;
    }

}
