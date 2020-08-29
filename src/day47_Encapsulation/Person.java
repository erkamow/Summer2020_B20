package day47_Encapsulation;

public class Person {
    /*
3. Person:
            instance variables
                    name
                    age
                    gender
                    date of birth
                    priavte ssn
                    private ID
                    private address
 */

        public String name;
        public int age;
        public String gender;
        public String dob;

        public Person(String name, int age, String gender, String dob) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.dob = dob;
        }


        private int ssn = 12345678;

        public int getSsn() {
            return ssn;
        }

        public void setSsn(int ssn) {
            this.ssn = ssn;
        }

        private int ID = 9694;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        private String address = "1209 Summerbrook Dr. \n\tAtlanta, GA 30350";

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String toString() {
            return "Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nDate of Birth: " + dob;
        }
    }

