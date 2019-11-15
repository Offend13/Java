import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.security.spec.RSAOtherPrimeInfo;

public class Dog {
    String Dog;
    int sise;

    public void bark(int times) {
        if (sise > 60) {
            bark(times, "HAUUU!");
        } else if (sise > 14) {
            bark(times,"Ruff!");
        } else {
            bark(times,"Yip!");
        }
    }

    private void bark(int times, String sound) {
        for (int i = 0; i < times; i++) {
            System.out.println(sound);
        }
    }
}
