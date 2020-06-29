//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.17 at 05:31:42 PM CEST 
//


package org.orcid.jaxb.model.record_v3;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.orcid.jaxb.model.common_v3.LastModifiedDate;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.orcid.org/ns/common}last-modified-date" minOccurs="0"/&gt;
 *         &lt;element name="distinctions" type="{http://www.orcid.org/ns/activities}distinctions" minOccurs="0"/&gt;
 *         &lt;element name="educations" type="{http://www.orcid.org/ns/activities}educations" minOccurs="0"/&gt;
 *         &lt;element name="employments" type="{http://www.orcid.org/ns/activities}employments" minOccurs="0"/&gt;
 *         &lt;element name="fundings" type="{http://www.orcid.org/ns/activities}fundings" minOccurs="0"/&gt;
 *         &lt;element name="invited-positions" type="{http://www.orcid.org/ns/activities}invited-positions" minOccurs="0"/&gt;
 *         &lt;element name="memberships" type="{http://www.orcid.org/ns/activities}memberships" minOccurs="0"/&gt;
 *         &lt;element name="peer-reviews" type="{http://www.orcid.org/ns/activities}peer-reviews" minOccurs="0"/&gt;
 *         &lt;element name="qualifications" type="{http://www.orcid.org/ns/activities}qualifications" minOccurs="0"/&gt;
 *         &lt;element name="research-resources" type="{http://www.orcid.org/ns/activities}research-resources" minOccurs="0"/&gt;
 *         &lt;element name="services" type="{http://www.orcid.org/ns/activities}services" minOccurs="0"/&gt;
 *         &lt;element name="works" type="{http://www.orcid.org/ns/activities}works" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="path" type="{http://www.orcid.org/ns/common}element-path" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lastModifiedDate",
    "distinctions",
    "educations",
    "employments",
    "fundings",
    "invitedPositions",
    "memberships",
    "peerReviews",
    "qualifications",
    "researchResources",
    "services",
    "works"
})
@XmlRootElement(name = "activities-summary")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
public class ActivitiesSummary implements Serializable, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "last-modified-date", namespace = "http://www.orcid.org/ns/common")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected LastModifiedDate lastModifiedDate;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected DistinctionsType distinctions;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected EducationsType educations;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected EmploymentsType employments;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected FundingsType fundings;
    @XmlElement(name = "invited-positions")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected InvitedPositionsType invitedPositions;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected MembershipsType memberships;
    @XmlElement(name = "peer-reviews")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected PeerReviewsType peerReviews;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected QualificationsType qualifications;
    @XmlElement(name = "research-resources")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected ResearchResourcesType researchResources;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected ServicesType services;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected WorksType works;
    @XmlAttribute(name = "path")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    protected String path;

    /**
     * Default no-arg constructor
     * 
     */
    public ActivitiesSummary() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ActivitiesSummary(final LastModifiedDate lastModifiedDate, final DistinctionsType distinctions, final EducationsType educations, final EmploymentsType employments, final FundingsType fundings, final InvitedPositionsType invitedPositions, final MembershipsType memberships, final PeerReviewsType peerReviews, final QualificationsType qualifications, final ResearchResourcesType researchResources, final ServicesType services, final WorksType works, final String path) {
        this.lastModifiedDate = lastModifiedDate;
        this.distinctions = distinctions;
        this.educations = educations;
        this.employments = employments;
        this.fundings = fundings;
        this.invitedPositions = invitedPositions;
        this.memberships = memberships;
        this.peerReviews = peerReviews;
        this.qualifications = qualifications;
        this.researchResources = researchResources;
        this.services = services;
        this.works = works;
        this.path = path;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link LastModifiedDate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastModifiedDate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setLastModifiedDate(LastModifiedDate value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the distinctions property.
     * 
     * @return
     *     possible object is
     *     {@link DistinctionsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public DistinctionsType getDistinctions() {
        return distinctions;
    }

    /**
     * Sets the value of the distinctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinctionsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setDistinctions(DistinctionsType value) {
        this.distinctions = value;
    }

    /**
     * Gets the value of the educations property.
     * 
     * @return
     *     possible object is
     *     {@link EducationsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public EducationsType getEducations() {
        return educations;
    }

    /**
     * Sets the value of the educations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setEducations(EducationsType value) {
        this.educations = value;
    }

    /**
     * Gets the value of the employments property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public EmploymentsType getEmployments() {
        return employments;
    }

    /**
     * Sets the value of the employments property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setEmployments(EmploymentsType value) {
        this.employments = value;
    }

    /**
     * Gets the value of the fundings property.
     * 
     * @return
     *     possible object is
     *     {@link FundingsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public FundingsType getFundings() {
        return fundings;
    }

    /**
     * Sets the value of the fundings property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setFundings(FundingsType value) {
        this.fundings = value;
    }

    /**
     * Gets the value of the invitedPositions property.
     * 
     * @return
     *     possible object is
     *     {@link InvitedPositionsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public InvitedPositionsType getInvitedPositions() {
        return invitedPositions;
    }

    /**
     * Sets the value of the invitedPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvitedPositionsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setInvitedPositions(InvitedPositionsType value) {
        this.invitedPositions = value;
    }

    /**
     * Gets the value of the memberships property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public MembershipsType getMemberships() {
        return memberships;
    }

    /**
     * Sets the value of the memberships property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setMemberships(MembershipsType value) {
        this.memberships = value;
    }

    /**
     * Gets the value of the peerReviews property.
     * 
     * @return
     *     possible object is
     *     {@link PeerReviewsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public PeerReviewsType getPeerReviews() {
        return peerReviews;
    }

    /**
     * Sets the value of the peerReviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeerReviewsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setPeerReviews(PeerReviewsType value) {
        this.peerReviews = value;
    }

    /**
     * Gets the value of the qualifications property.
     * 
     * @return
     *     possible object is
     *     {@link QualificationsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public QualificationsType getQualifications() {
        return qualifications;
    }

    /**
     * Sets the value of the qualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setQualifications(QualificationsType value) {
        this.qualifications = value;
    }

    /**
     * Gets the value of the researchResources property.
     * 
     * @return
     *     possible object is
     *     {@link ResearchResourcesType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public ResearchResourcesType getResearchResources() {
        return researchResources;
    }

    /**
     * Sets the value of the researchResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchResourcesType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setResearchResources(ResearchResourcesType value) {
        this.researchResources = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ServicesType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public ServicesType getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setServices(ServicesType value) {
        this.services = value;
    }

    /**
     * Gets the value of the works property.
     * 
     * @return
     *     possible object is
     *     {@link WorksType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public WorksType getWorks() {
        return works;
    }

    /**
     * Sets the value of the works property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorksType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setWorks(WorksType value) {
        this.works = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-04-17T05:31:42+02:00", comments = "JAXB RI v2.2.11")
    public void setPath(String value) {
        this.path = value;
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
            LastModifiedDate theLastModifiedDate;
            theLastModifiedDate = this.getLastModifiedDate();
            strategy.appendField(locator, this, "lastModifiedDate", buffer, theLastModifiedDate);
        }
        {
            DistinctionsType theDistinctions;
            theDistinctions = this.getDistinctions();
            strategy.appendField(locator, this, "distinctions", buffer, theDistinctions);
        }
        {
            EducationsType theEducations;
            theEducations = this.getEducations();
            strategy.appendField(locator, this, "educations", buffer, theEducations);
        }
        {
            EmploymentsType theEmployments;
            theEmployments = this.getEmployments();
            strategy.appendField(locator, this, "employments", buffer, theEmployments);
        }
        {
            FundingsType theFundings;
            theFundings = this.getFundings();
            strategy.appendField(locator, this, "fundings", buffer, theFundings);
        }
        {
            InvitedPositionsType theInvitedPositions;
            theInvitedPositions = this.getInvitedPositions();
            strategy.appendField(locator, this, "invitedPositions", buffer, theInvitedPositions);
        }
        {
            MembershipsType theMemberships;
            theMemberships = this.getMemberships();
            strategy.appendField(locator, this, "memberships", buffer, theMemberships);
        }
        {
            PeerReviewsType thePeerReviews;
            thePeerReviews = this.getPeerReviews();
            strategy.appendField(locator, this, "peerReviews", buffer, thePeerReviews);
        }
        {
            QualificationsType theQualifications;
            theQualifications = this.getQualifications();
            strategy.appendField(locator, this, "qualifications", buffer, theQualifications);
        }
        {
            ResearchResourcesType theResearchResources;
            theResearchResources = this.getResearchResources();
            strategy.appendField(locator, this, "researchResources", buffer, theResearchResources);
        }
        {
            ServicesType theServices;
            theServices = this.getServices();
            strategy.appendField(locator, this, "services", buffer, theServices);
        }
        {
            WorksType theWorks;
            theWorks = this.getWorks();
            strategy.appendField(locator, this, "works", buffer, theWorks);
        }
        {
            String thePath;
            thePath = this.getPath();
            strategy.appendField(locator, this, "path", buffer, thePath);
        }
        return buffer;
    }

}