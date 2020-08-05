package day03_sequences_variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class SalaryCalculator {

    public static void main(String[] args) {


        //   totalTax= salary * tax;
        //   salaryAfterTax = salary - totalTax

        double salary = 100000;
        double tax = 0.28;
        double totalTax = salary * tax;
        double salaryAfterTax = salary - totalTax;
        System.out.println(totalTax);
        System.out.println(salaryAfterTax);





    }


}
