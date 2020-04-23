package BahitJava;

import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Repl36_Ternary {
    public static void main(String[] args) {
        int numberOfBedrooms = 0;
        String result = " ";
        if (numberOfBedrooms > 0 && numberOfBedrooms < 4) {
            result = (numberOfBedrooms == 1 || numberOfBedrooms < 2) ? "1 Bedroom and staring price 1100" :
                    (numberOfBedrooms < 3 || numberOfBedrooms == 2) ? "2 Bedroom and start price 2200" :
                            "3 Bedroom and start 3300";
            System.out.println(result);
        }else {
            System.out.println("invalid number");
        }

    }

}
