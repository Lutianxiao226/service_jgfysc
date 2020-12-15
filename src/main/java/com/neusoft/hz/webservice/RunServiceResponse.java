
package com.neusoft.hz.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RunServiceResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="outMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "runServiceResult",
    "outMsg"
})
@XmlRootElement(name = "RunServiceResponse")
public class RunServiceResponse {

    @XmlElement(name = "RunServiceResult")
    protected Integer runServiceResult;
    @XmlElementRef(name = "outMsg", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outMsg;

    /**
     * 获取runServiceResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRunServiceResult() {
        return runServiceResult;
    }

    /**
     * 设置runServiceResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRunServiceResult(Integer value) {
        this.runServiceResult = value;
    }

    /**
     * 获取outMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutMsg() {
        return outMsg;
    }

    /**
     * 设置outMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutMsg(JAXBElement<String> value) {
        this.outMsg = value;
    }

}
