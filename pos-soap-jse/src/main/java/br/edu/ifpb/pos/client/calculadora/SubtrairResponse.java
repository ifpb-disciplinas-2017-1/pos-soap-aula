
package br.edu.ifpb.pos.client.calculadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de subtrairResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="subtrairResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valorDeRetorno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subtrairResponse", propOrder = {
    "valorDeRetorno"
})
public class SubtrairResponse {

    protected int valorDeRetorno;

    /**
     * Obtém o valor da propriedade valorDeRetorno.
     * 
     */
    public int getValorDeRetorno() {
        return valorDeRetorno;
    }

    /**
     * Define o valor da propriedade valorDeRetorno.
     * 
     */
    public void setValorDeRetorno(int value) {
        this.valorDeRetorno = value;
    }

}
