package EjerciciosClase.Clases.Tarea;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class EjercicioXml {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();


            Document documento = implementation.createDocument(null, "Curriculum", null);
            documento.setXmlVersion("1.0");

            Element empleados  = documento.createElement("empleados");
            Element empleado  = documento.createElement("empleado");

            Element nombre  = documento.createElement("Nombre");
            Text textNombre = documento.createTextNode("Pedro");
            nombre.appendChild(textNombre);
            empleado.appendChild(nombre);


            Element profesion  = documento.createElement("Profesion");
            Text textProfesion = documento.createTextNode("Ingeniero quimico");
            profesion.appendChild(textProfesion);
            empleado.appendChild(profesion);


            Element experiencia  = documento.createElement("experience");
            Text textExperiencia = documento.createTextNode("5 years ");
            experiencia.appendChild(textExperiencia);
            empleado.appendChild(experiencia);


            Element correo = documento.createElement("Correo");
            Text textCorreo = documento.createTextNode("pedro@gmail.com");
            correo.appendChild(textCorreo);
            empleado.appendChild(correo);

            Element telefono = documento.createElement("Telefono");
            Text textTelefono = documento.createTextNode("7121254477");
            telefono.appendChild(textTelefono);
            empleado.appendChild(telefono);




            empleados.appendChild(empleado);




            documento.getDocumentElement().appendChild(empleados);


            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("Curriculum.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);





        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }


    }
}
