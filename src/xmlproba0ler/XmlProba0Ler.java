package xmlproba0ler;

import java.io.FileReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

/**
 *
 * @author oracle
 */
public class XmlProba0Ler {

    public static void main(String[] args) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        
        try{
            XMLStreamReader read = factory.createXMLStreamReader(new FileReader("autores.xml"));
            
            while(read.hasNext()){ //Pregunta se existen elementos sen ler
               read.next(); //Lee o seguinte elemento
               
                //Compara un enteiro que devolve o getEventType() coa constante definida por XMLStreamReader
                if(read.getEventType() == XMLStreamReader.START_ELEMENT){ 
              
                        System.out.println("<" + read.getLocalName() + ">");
                    
                }
            }
        
        }catch(Exception e){}
    }
    
}
