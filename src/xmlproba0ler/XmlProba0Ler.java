package xmlproba0ler;

import java.io.FileReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
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
               
                //Compara un enteiro que devolve o getEventType() coa constante definida por XMLStreamReader
                if(read.getEventType() == XMLStreamConstants.START_ELEMENT){  
                    if(read.getLocalName().equals("autor")){
                        System.out.println("Código: " + read.getAttributeValue(0)); 
                    }
                    if(read.getLocalName().equals("nome")){
                        System.out.println("Autor: "+ read.getElementText());
                    }
                    if(read.getLocalName().equals("titulo")){
                        System.out.println("Título: " + read.getElementText());
                    }
                }
               read.next(); //Lee o seguinte elemento  
            }
        
        }catch(Exception e){}
    }
    
}
