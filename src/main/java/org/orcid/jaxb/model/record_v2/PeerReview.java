//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.24 at 11:17:38 AM CDT 
//


package org.orcid.jaxb.model.record_v2;

import java.io.Serializable;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.orcid.jaxb.model.common_v2.CreatedDate;
import org.orcid.jaxb.model.common_v2.ElementSummary;
import org.orcid.jaxb.model.common_v2.ExternalId;
import org.orcid.jaxb.model.common_v2.ExternalIds;
import org.orcid.jaxb.model.common_v2.FuzzyDate;
import org.orcid.jaxb.model.common_v2.LastModifiedDate;
import org.orcid.jaxb.model.common_v2.Organization;
import org.orcid.jaxb.model.common_v2.SourceType;
import org.orcid.jaxb.model.common_v2.Url;
import org.orcid.jaxb.model.common_v2.Visibility;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.orcid.org/ns/common}element-summary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reviewer-role" type="{http://www.orcid.org/ns/peer-review}role"/&gt;
 *         &lt;element name="review-identifiers" type="{http://www.orcid.org/ns/common}external-ids"/&gt;
 *         &lt;element name="review-url" type="{http://www.orcid.org/ns/common}url" minOccurs="0"/&gt;
 *         &lt;element name="review-type" type="{http://www.orcid.org/ns/peer-review}type"/&gt;
 *         &lt;element name="review-completion-date" type="{http://www.orcid.org/ns/common}fuzzy-date"/&gt;
 *         &lt;element name="review-group-id" type="{http://www.orcid.org/ns/common}group-id"/&gt;
 *         &lt;element name="subject-external-identifier" type="{http://www.orcid.org/ns/common}external-id" minOccurs="0"/&gt;
 *         &lt;element name="subject-container-name" type="{http://www.orcid.org/ns/work}journal-title" minOccurs="0"/&gt;
 *         &lt;element name="subject-type" type="{http://www.orcid.org/ns/work}work-type" minOccurs="0"/&gt;
 *         &lt;element name="subject-name" type="{http://www.orcid.org/ns/work}work-title" minOccurs="0"/&gt;
 *         &lt;element name="subject-url" type="{http://www.orcid.org/ns/common}url" minOccurs="0"/&gt;
 *         &lt;element name="convening-organization" type="{http://www.orcid.org/ns/common}organization"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reviewerRole",
    "reviewIdentifiers",
    "reviewUrl",
    "reviewType",
    "reviewCompletionDate",
    "reviewGroupId",
    "subjectExternalIdentifier",
    "subjectContainerName",
    "subjectType",
    "subjectName",
    "subjectUrl",
    "conveningOrganization"
})
@XmlRootElement(name = "peer-review", namespace = "http://www.orcid.org/ns/peer-review")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
public class PeerReview
    extends ElementSummary
    implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "reviewer-role", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected Role reviewerRole;
    @XmlElement(name = "review-identifiers", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected ExternalIds reviewIdentifiers;
    @XmlElement(name = "review-url", namespace = "http://www.orcid.org/ns/peer-review")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected Url reviewUrl;
    @XmlElement(name = "review-type", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected Type reviewType;
    @XmlElement(name = "review-completion-date", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected FuzzyDate reviewCompletionDate;
    @XmlElement(name = "review-group-id", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected String reviewGroupId;
    @XmlElement(name = "subject-external-identifier", namespace = "http://www.orcid.org/ns/peer-review")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected ExternalId subjectExternalIdentifier;
    @XmlElement(name = "subject-container-name", namespace = "http://www.orcid.org/ns/peer-review")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected String subjectContainerName;
    @XmlElement(name = "subject-type", namespace = "http://www.orcid.org/ns/peer-review")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected WorkType subjectType;
    @XmlElement(name = "subject-name", namespace = "http://www.orcid.org/ns/peer-review")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected WorkTitle subjectName;
    @XmlElement(name = "subject-url", namespace = "http://www.orcid.org/ns/peer-review")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected Url subjectUrl;
    @XmlElement(name = "convening-organization", namespace = "http://www.orcid.org/ns/peer-review", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    protected Organization conveningOrganization;

    /**
     * Default no-arg constructor
     * 
     */
    public PeerReview() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PeerReview(final CreatedDate createdDate, final LastModifiedDate lastModifiedDate, final SourceType source, final BigInteger putCode, final Visibility visibility, final String displayIndex, final String path, final Role reviewerRole, final ExternalIds reviewIdentifiers, final Url reviewUrl, final Type reviewType, final FuzzyDate reviewCompletionDate, final String reviewGroupId, final ExternalId subjectExternalIdentifier, final String subjectContainerName, final WorkType subjectType, final WorkTitle subjectName, final Url subjectUrl, final Organization conveningOrganization) {
        super(createdDate, lastModifiedDate, source, putCode, visibility, displayIndex, path);
        this.reviewerRole = reviewerRole;
        this.reviewIdentifiers = reviewIdentifiers;
        this.reviewUrl = reviewUrl;
        this.reviewType = reviewType;
        this.reviewCompletionDate = reviewCompletionDate;
        this.reviewGroupId = reviewGroupId;
        this.subjectExternalIdentifier = subjectExternalIdentifier;
        this.subjectContainerName = subjectContainerName;
        this.subjectType = subjectType;
        this.subjectName = subjectName;
        this.subjectUrl = subjectUrl;
        this.conveningOrganization = conveningOrganization;
    }

    /**
     * Gets the value of the reviewerRole property.
     * 
     * @return
     *     possible object is
     *     {@link Role }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public Role getReviewerRole() {
        return reviewerRole;
    }

    /**
     * Sets the value of the reviewerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Role }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setReviewerRole(Role value) {
        this.reviewerRole = value;
    }

    /**
     * Gets the value of the reviewIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIds }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public ExternalIds getReviewIdentifiers() {
        return reviewIdentifiers;
    }

    /**
     * Sets the value of the reviewIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIds }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setReviewIdentifiers(ExternalIds value) {
        this.reviewIdentifiers = value;
    }

    /**
     * Gets the value of the reviewUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Url }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public Url getReviewUrl() {
        return reviewUrl;
    }

    /**
     * Sets the value of the reviewUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Url }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setReviewUrl(Url value) {
        this.reviewUrl = value;
    }

    /**
     * Gets the value of the reviewType property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public Type getReviewType() {
        return reviewType;
    }

    /**
     * Sets the value of the reviewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setReviewType(Type value) {
        this.reviewType = value;
    }

    /**
     * Gets the value of the reviewCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link FuzzyDate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public FuzzyDate getReviewCompletionDate() {
        return reviewCompletionDate;
    }

    /**
     * Sets the value of the reviewCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzyDate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setReviewCompletionDate(FuzzyDate value) {
        this.reviewCompletionDate = value;
    }

    /**
     * Gets the value of the reviewGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public String getReviewGroupId() {
        return reviewGroupId;
    }

    /**
     * Sets the value of the reviewGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setReviewGroupId(String value) {
        this.reviewGroupId = value;
    }

    /**
     * Gets the value of the subjectExternalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public ExternalId getSubjectExternalIdentifier() {
        return subjectExternalIdentifier;
    }

    /**
     * Sets the value of the subjectExternalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setSubjectExternalIdentifier(ExternalId value) {
        this.subjectExternalIdentifier = value;
    }

    /**
     * Gets the value of the subjectContainerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public String getSubjectContainerName() {
        return subjectContainerName;
    }

    /**
     * Sets the value of the subjectContainerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setSubjectContainerName(String value) {
        this.subjectContainerName = value;
    }

    /**
     * Gets the value of the subjectType property.
     * 
     * @return
     *     possible object is
     *     {@link WorkType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public WorkType getSubjectType() {
        return subjectType;
    }

    /**
     * Sets the value of the subjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setSubjectType(WorkType value) {
        this.subjectType = value;
    }

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link WorkTitle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public WorkTitle getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkTitle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setSubjectName(WorkTitle value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the subjectUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Url }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public Url getSubjectUrl() {
        return subjectUrl;
    }

    /**
     * Sets the value of the subjectUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Url }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setSubjectUrl(Url value) {
        this.subjectUrl = value;
    }

    /**
     * Gets the value of the conveningOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public Organization getConveningOrganization() {
        return conveningOrganization;
    }

    /**
     * Sets the value of the conveningOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public void setConveningOrganization(Organization value) {
        this.conveningOrganization = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            Role theReviewerRole;
            theReviewerRole = this.getReviewerRole();
            strategy.appendField(locator, this, "reviewerRole", buffer, theReviewerRole);
        }
        {
            ExternalIds theReviewIdentifiers;
            theReviewIdentifiers = this.getReviewIdentifiers();
            strategy.appendField(locator, this, "reviewIdentifiers", buffer, theReviewIdentifiers);
        }
        {
            Url theReviewUrl;
            theReviewUrl = this.getReviewUrl();
            strategy.appendField(locator, this, "reviewUrl", buffer, theReviewUrl);
        }
        {
            Type theReviewType;
            theReviewType = this.getReviewType();
            strategy.appendField(locator, this, "reviewType", buffer, theReviewType);
        }
        {
            FuzzyDate theReviewCompletionDate;
            theReviewCompletionDate = this.getReviewCompletionDate();
            strategy.appendField(locator, this, "reviewCompletionDate", buffer, theReviewCompletionDate);
        }
        {
            String theReviewGroupId;
            theReviewGroupId = this.getReviewGroupId();
            strategy.appendField(locator, this, "reviewGroupId", buffer, theReviewGroupId);
        }
        {
            ExternalId theSubjectExternalIdentifier;
            theSubjectExternalIdentifier = this.getSubjectExternalIdentifier();
            strategy.appendField(locator, this, "subjectExternalIdentifier", buffer, theSubjectExternalIdentifier);
        }
        {
            String theSubjectContainerName;
            theSubjectContainerName = this.getSubjectContainerName();
            strategy.appendField(locator, this, "subjectContainerName", buffer, theSubjectContainerName);
        }
        {
            WorkType theSubjectType;
            theSubjectType = this.getSubjectType();
            strategy.appendField(locator, this, "subjectType", buffer, theSubjectType);
        }
        {
            WorkTitle theSubjectName;
            theSubjectName = this.getSubjectName();
            strategy.appendField(locator, this, "subjectName", buffer, theSubjectName);
        }
        {
            Url theSubjectUrl;
            theSubjectUrl = this.getSubjectUrl();
            strategy.appendField(locator, this, "subjectUrl", buffer, theSubjectUrl);
        }
        {
            Organization theConveningOrganization;
            theConveningOrganization = this.getConveningOrganization();
            strategy.appendField(locator, this, "conveningOrganization", buffer, theConveningOrganization);
        }
        return buffer;
    }

}
