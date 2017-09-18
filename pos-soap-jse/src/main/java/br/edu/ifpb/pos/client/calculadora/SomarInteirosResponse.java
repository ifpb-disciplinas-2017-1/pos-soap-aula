
package br.edu.ifpb.pos.client.calculadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de somarInteirosResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="somarInteirosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retorno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somarInteirosResponse", propOrder = {
    "retorno"
})
public class SomarInteirosResponse {

    protected int retorno;

    /**
     * Obtém o valor da propriedade retorno.
     * 
     */
    public int getRetorno() {
        return retorno;
    }

    /**
     * Define o valor da propriedade retorno.
     * 
     */
    public void setRetorno(int value) {
        this.retorno = value;
    }

}
