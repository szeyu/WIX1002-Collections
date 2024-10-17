public class L01Q02 {
    
    public static class PersonalInfo {
        private String name;
        private String matricID;
        private String email;
        private String address;

        public PersonalInfo(String name, String matricID, String email, String address){
            this.name = name;
            this.matricID = matricID;
            this.email = email;
            this.address = address;
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public String getMatricID(){
            return matricID;
        }
        public void setMatricID(String name){
            this.name = name;
        }

        public String getEmail(){
            return email;
        }
        public void setEmail(String name){
            this.name = name;
        }

        public String getAddress(){
            return address;
        }
        public void setAddress(String name){
            this.name = name;
        }
    }

    public static void main(String[] args){
        PersonalInfo person = new PersonalInfo("Sim", "23005023", "abc@gmail.com", "kk10 UM");
        
        System.out.println("Personal Info:");
        System.out.print("Name: ");
        System.out.println(person.name);
        System.out.print("Matric ID: ");
        System.out.println(person.matricID);
        System.out.print("Email: ");
        System.out.println(person.email);
        System.out.print("Address: ");
        System.out.println(person.address);
    }
}
