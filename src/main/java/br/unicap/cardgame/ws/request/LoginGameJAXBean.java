package br.unicap.cardgame.ws.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoginGameJAXBean {
    
    @XmlElement(name="username")
    public String username;
    
    @XmlElement(name = "password")
    public String password;
}
