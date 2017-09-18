
package br.edu.ifpb.pos.client.calculadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de somarInteiros complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="somarInteiros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primeiro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="segundo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somarInteiros", propOrder = {
    "primeiro",
    "segundo"
})
public class SomarInteiros {

    protected int primeiro;
    protected int segundo;

    /**
     * Obtém o valor da propriedade primeiro.
     * 
     */
    public int getPrimeiro() {
        return primeiro;
    }

    /**
     * Define o valor da propriedade primeiro.
     * 
     */
    public void setPrimeiro(int value) {
        this.primeiro = value;
    }

    /**
     * Obtém o valor da propriedade segundo.
     * 
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * Define o valor da propriedade segundo.
     * 
     */
    public void setSegundo(int value) {
        this.segundo = value;
    }

}
