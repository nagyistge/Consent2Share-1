/*******************************************************************************
 * Open Behavioral Health Information Technology Architecture (OBHITA.org)
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
package gov.samhsa.consent2share.c32.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="personName" type="{urn:hl7-org:v3}pnm"/>
 *         &lt;element name="organizationName" type="{urn:hl7-org:v3}onm"/>
 *         &lt;element name="relatedPersonName" type="{urn:hl7-org:v3}pnm"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personName",
    "organizationName",
    "relatedPersonName"
})
public class InformationSourceName {

    /** The person name. */
    protected Pnm personName;
    
    /** The organization name. */
    protected Onm organizationName;
    
    /** The related person name. */
    protected Pnm relatedPersonName;

    /**
     * Gets the value of the personName property.
     *
     * @return the person name
     * possible object is
     * {@link Pnm }
     */
    public Pnm getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pnm }
     *     
     */
    public void setPersonName(Pnm value) {
        this.personName = value;
    }

    /**
     * Gets the value of the organizationName property.
     *
     * @return the organization name
     * possible object is
     * {@link Onm }
     */
    public Onm getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Onm }
     *     
     */
    public void setOrganizationName(Onm value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the relatedPersonName property.
     *
     * @return the related person name
     * possible object is
     * {@link Pnm }
     */
    public Pnm getRelatedPersonName() {
        return relatedPersonName;
    }

    /**
     * Sets the value of the relatedPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pnm }
     *     
     */
    public void setRelatedPersonName(Pnm value) {
        this.relatedPersonName = value;
    }

}
