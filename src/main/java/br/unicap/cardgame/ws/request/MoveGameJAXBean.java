package br.unicap.cardgame.ws.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MoveGameJAXBean {
    
    @XmlElement(name="position")
    public int position;
      
}
