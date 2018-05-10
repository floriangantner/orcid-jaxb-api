//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.24 at 11:17:38 AM CDT 
//


package org.orcid.jaxb.model.record_v2;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for work-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="work-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="artistic-performance"/&gt;
 *     &lt;enumeration value="book-chapter"/&gt;
 *     &lt;enumeration value="book-review"/&gt;
 *     &lt;enumeration value="book"/&gt;
 *     &lt;enumeration value="conference-abstract"/&gt;
 *     &lt;enumeration value="conference-paper"/&gt;
 *     &lt;enumeration value="conference-poster"/&gt;
 *     &lt;enumeration value="data-set"/&gt;
 *     &lt;enumeration value="dictionary-entry"/&gt;
 *     &lt;enumeration value="disclosure"/&gt;
 *     &lt;enumeration value="dissertation"/&gt;
 *     &lt;enumeration value="edited-book"/&gt;
 *     &lt;enumeration value="encyclopedia-entry"/&gt;
 *     &lt;enumeration value="invention"/&gt;
 *     &lt;enumeration value="journal-article"/&gt;
 *     &lt;enumeration value="journal-issue"/&gt;
 *     &lt;enumeration value="lecture-speech"/&gt;
 *     &lt;enumeration value="license"/&gt;
 *     &lt;enumeration value="magazine-article"/&gt;
 *     &lt;enumeration value="manual"/&gt;
 *     &lt;enumeration value="newsletter-article"/&gt;
 *     &lt;enumeration value="newspaper-article"/&gt;
 *     &lt;enumeration value="online-resource"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="patent"/&gt;
 *     &lt;enumeration value="registered-copyright"/&gt;
 *     &lt;enumeration value="report"/&gt;
 *     &lt;enumeration value="research-technique"/&gt;
 *     &lt;enumeration value="research-tool"/&gt;
 *     &lt;enumeration value="spin-off-company"/&gt;
 *     &lt;enumeration value="standards-and-policy"/&gt;
 *     &lt;enumeration value="supervised-student-publication"/&gt;
 *     &lt;enumeration value="technical-standard"/&gt;
 *     &lt;enumeration value="test"/&gt;
 *     &lt;enumeration value="translation"/&gt;
 *     &lt;enumeration value="trademark"/&gt;
 *     &lt;enumeration value="website"/&gt;
 *     &lt;enumeration value="working-paper"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "work-type", namespace = "http://www.orcid.org/ns/work")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-24T11:17:38-05:00", comments = "JAXB RI v2.2.11")
public enum WorkType {

    @XmlEnumValue("artistic-performance")
    ARTISTIC_PERFORMANCE("artistic-performance"),
    @XmlEnumValue("book-chapter")
    BOOK_CHAPTER("book-chapter"),
    @XmlEnumValue("book-review")
    BOOK_REVIEW("book-review"),
    @XmlEnumValue("book")
    BOOK("book"),
    @XmlEnumValue("conference-abstract")
    CONFERENCE_ABSTRACT("conference-abstract"),
    @XmlEnumValue("conference-paper")
    CONFERENCE_PAPER("conference-paper"),
    @XmlEnumValue("conference-poster")
    CONFERENCE_POSTER("conference-poster"),
    @XmlEnumValue("data-set")
    DATA_SET("data-set"),
    @XmlEnumValue("dictionary-entry")
    DICTIONARY_ENTRY("dictionary-entry"),
    @XmlEnumValue("disclosure")
    DISCLOSURE("disclosure"),
    @XmlEnumValue("dissertation")
    DISSERTATION("dissertation"),
    @XmlEnumValue("edited-book")
    EDITED_BOOK("edited-book"),
    @XmlEnumValue("encyclopedia-entry")
    ENCYCLOPEDIA_ENTRY("encyclopedia-entry"),
    @XmlEnumValue("invention")
    INVENTION("invention"),
    @XmlEnumValue("journal-article")
    JOURNAL_ARTICLE("journal-article"),
    @XmlEnumValue("journal-issue")
    JOURNAL_ISSUE("journal-issue"),
    @XmlEnumValue("lecture-speech")
    LECTURE_SPEECH("lecture-speech"),
    @XmlEnumValue("license")
    LICENSE("license"),
    @XmlEnumValue("magazine-article")
    MAGAZINE_ARTICLE("magazine-article"),
    @XmlEnumValue("manual")
    MANUAL("manual"),
    @XmlEnumValue("newsletter-article")
    NEWSLETTER_ARTICLE("newsletter-article"),
    @XmlEnumValue("newspaper-article")
    NEWSPAPER_ARTICLE("newspaper-article"),
    @XmlEnumValue("online-resource")
    ONLINE_RESOURCE("online-resource"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("patent")
    PATENT("patent"),
    @XmlEnumValue("registered-copyright")
    REGISTERED_COPYRIGHT("registered-copyright"),
    @XmlEnumValue("report")
    REPORT("report"),
    @XmlEnumValue("research-technique")
    RESEARCH_TECHNIQUE("research-technique"),
    @XmlEnumValue("research-tool")
    RESEARCH_TOOL("research-tool"),
    @XmlEnumValue("spin-off-company")
    SPIN_OFF_COMPANY("spin-off-company"),
    @XmlEnumValue("standards-and-policy")
    STANDARDS_AND_POLICY("standards-and-policy"),
    @XmlEnumValue("supervised-student-publication")
    SUPERVISED_STUDENT_PUBLICATION("supervised-student-publication"),
    @XmlEnumValue("technical-standard")
    TECHNICAL_STANDARD("technical-standard"),
    @XmlEnumValue("test")
    TEST("test"),
    @XmlEnumValue("translation")
    TRANSLATION("translation"),
    @XmlEnumValue("trademark")
    TRADEMARK("trademark"),
    @XmlEnumValue("website")
    WEBSITE("website"),
    @XmlEnumValue("working-paper")
    WORKING_PAPER("working-paper");
    private final String value;

    WorkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkType fromValue(String v) {
        for (WorkType c: WorkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}