public class Employee {
    private String name ,firstName, birthDate, department, particularity;
    private double weight, income;
    private int age, yearsOfService;
    private char gender;

    public Employee(String name, String firstName, String birthDate, String particularity, double weight, int age, char gender) {
        this.name = name;
        this.firstName = firstName;
        this.birthDate= birthDate;
        this.department= "A38";
        this.particularity= particularity;
        this.weight= weight;
        this.income= 1500;
        this.age= age;
        this.yearsOfService= 0;
        this.gender= gender;
    }

        public String getName(){
            return name;
        }
        public String getFirstname(){
            return firstName;
        }
        public String getBirthdate(){
                return birthDate;
            }
        public int getAge(){
        return age;
    }
        public char getGender(){
        return gender;
    }
        public double getWeight()
            {return weight;}

        public String getDepartment()
            {return department;}

        public String getParticularity()
            {return particularity;}

        public double getIncome()
            {return income;}

        public int getYearsOfService()
            {return yearsOfService; }


    public void setDepartment(String department) {
            this.department = department;


            }
}






