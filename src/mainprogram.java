public class mainprogram {

    public static void main(String[] args) {

        Employee e1 = new Employee("Nachname", "Vorname", "Datum","Bereich", "Besonderheiten", 0,0.0, 0, 0, 'M');
        System.out.println(e1.getName() + ", " + e1.getFirstname() + ", born at " + e1.getBirthdate() + ", " + e1.getAge() + " years old"+ ", gender="+ e1.getGender() + ", Weight=" + e1.getWeight() + ", Department=" + e1.getDepartment() + ", Particularity=" + e1.getParticularity() + ", Income=" + e1.getIncome() + ", years of service=" + e1.getYearsOfService());

        Employee e2 = new Employee("Nachname", "Vorname", "Datum","Bereich", "Besonderheiten", 0,0.0, 0, 0, 'M');
        System.out.println(e2.getName() + ", " + e2.getFirstname() + ", born at " + e2.getBirthdate() + ", " + e2.getAge() + " years old"+ ", gender="+ e2.getGender() + ", Weight=" + e2.getWeight() + ", Department=" + e2.getDepartment() + ", Particularity=" + e2.getParticularity() + ", Income=" + e2.getIncome() + ", years of service=" + e2.getYearsOfService());

        Employee e3 = new Employee("Nachname", "Vorname", "Datum","Bereich", "Besonderheiten", 0,0.0, 0, 0, 'M');
        System.out.println(e3.getName() + ", " + e3.getFirstname() + ", born at " + e3.getBirthdate() + ", " + e3.getAge() + " years old"+ ", gender="+ e3.getGender() + ", Weight=" + e3.getWeight() + ", Department=" + e3.getDepartment() + ", Particularity=" + e3.getParticularity() + ", Income=" + e3.getIncome() + ", years of service=" + e3.getYearsOfService());

    }

}
