//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.16 at 06:01:23 PM CEST 
//


package org.orcid.jaxb.model.record_v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;
import org.orcid.jaxb.model.common_v3.AffiliationSummary;

@XmlRootElement(name = "EducationSummary")
public class EducationSummary
    extends JAXBElement<AffiliationSummary>
{

    protected final static QName NAME = new QName("http://www.orcid.org/ns/education", "education-summary");

    public EducationSummary(AffiliationSummary value) {
        super(NAME, ((Class) AffiliationSummary.class), null, value);
    }

    public EducationSummary() {
        super(NAME, ((Class) AffiliationSummary.class), null, null);
    }

}
