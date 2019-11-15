import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.security.spec.RSAOtherPrimeInfo;

public class Dog {
    String Dog;
    int sise;

    public void bark() {
        if (sise > 60) {
            System.out.println("HAUUU! HAUUU!");
        } else if (sise > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yep! Yep");
        }
    }
}
