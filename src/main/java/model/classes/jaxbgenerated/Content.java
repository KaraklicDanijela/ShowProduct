//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.19 at 09:53:31 AM CET 
//


package model.classes.jaxbgenerated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{}text"/&gt;
 *         &lt;element ref="{}review"/&gt;
 *         &lt;element ref="{}image"/&gt;
 *         &lt;element ref="{}attributes"/&gt;
 *         &lt;element ref="{}coupon"/&gt;
 *         &lt;element ref="{}menu"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "textOrReviewOrImage"
})
@XmlRootElement(name = "content")
public class Content {

    @XmlElements({
        @XmlElement(name = "text", type = Text.class),
        @XmlElement(name = "review", type = Review.class),
        @XmlElement(name = "image", type = Image.class),
        @XmlElement(name = "attributes", type = Attributes.class),
        @XmlElement(name = "coupon", type = Coupon.class),
        @XmlElement(name = "menu", type = Menu.class)
    })
    protected List<Object> textOrReviewOrImage;

    /**
     * Gets the value of the textOrReviewOrImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textOrReviewOrImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextOrReviewOrImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * {@link Review }
     * {@link Image }
     * {@link Attributes }
     * {@link Coupon }
     * {@link Menu }
     * 
     * 
     */
    public List<Object> getTextOrReviewOrImage() {
        if (textOrReviewOrImage == null) {
            textOrReviewOrImage = new ArrayList<Object>();
        }
        return this.textOrReviewOrImage;
    }

    public void setTextOrReviewOrImage(List<Object> textOrReviewOrImage) {
        this.textOrReviewOrImage = textOrReviewOrImage;
    }
}
