
package echosign.api.clientv20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import echosign.api.clientv20.dto15.DeleteGroupResult;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteGroupResult" type="{http://dto15.api.echosign}DeleteGroupResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deleteGroupResult"
})
@XmlRootElement(name = "deleteGroupResponse")
public class DeleteGroupResponse {

    @XmlElement(required = true, nillable = true)
    protected DeleteGroupResult deleteGroupResult;

    /**
     * Gets the value of the deleteGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteGroupResult }
     *     
     */
    public DeleteGroupResult getDeleteGroupResult() {
        return deleteGroupResult;
    }

    /**
     * Sets the value of the deleteGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteGroupResult }
     *     
     */
    public void setDeleteGroupResult(DeleteGroupResult value) {
        this.deleteGroupResult = value;
    }

}
