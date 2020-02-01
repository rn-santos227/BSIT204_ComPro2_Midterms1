public class Employee {
    private String first_name;
    private String last_name;

    public Employee(String first_name, String last_name) {
        this.first_name = ucfirst(first_name);
        this.last_name = ucfirst(last_name);
    }

    public String getFullName() {
        return this.last_name + ", " + this.first_name;
    }

    private String ucfirst(String str) {
        return String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1, str.length());
    }
}
