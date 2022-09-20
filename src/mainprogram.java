public class mainprogram {

    public static void main(String[] args) {
        Employee e1 = new Employee("Klassen", "Jan Leon", "15.10.2006", "cool",   85, 15, 'M');
        e1.setDepartment("A35");
        System.out.println(e1.getName() + ", " + e1.getFirstname() + ", born at " + e1.getBirthdate() + ", " + e1.getAge() + " years old"+ ", gender="+ e1.getGender() + ", Weight=" + e1.getWeight() + ", Department=" + e1.getDepartment() + ", Particularity=" + e1.getParticularity() + ", Income=" + e1.getIncome() + ", years of service=" + e1.getYearsOfService());

        Employee e2 = new Employee("Giancotti Orozco", "Diego", "09.07.2006", "Sehr Schnell",  90, 16, 'D');
        e2.setDepartment("A47");
        System.out.println(e2.getName() + ", " + e2.getFirstname() + ", born at " + e2.getBirthdate() + ", " + e2.getAge() + " years old"+ ", gender="+ e2.getGender() + ", Weight=" + e2.getWeight() + ", Department=" + e2.getDepartment() + ", Particularity=" + e2.getParticularity() + ", Income=" + e2.getIncome() + ", years of service=" + e2.getYearsOfService());

        Employee e3 = new Employee("Mohammed", "Habib", "01.04.2006", "Untergewichtig",  45, 16, 'M');
        e3.setDepartment("A69");
        System.out.println(e3.getName() + ", " + e3.getFirstname() + ", born at " + e3.getBirthdate() + ", " + e3.getAge() + " years old"+ ", gender="+ e3.getGender() + ", Weight=" + e3.getWeight() + ", Department=" + e3.getDepartment() + ", Particularity=" + e3.getParticularity() + ", Income=" + e3.getIncome() + ", years of service=" + e3.getYearsOfService());

    }
}
