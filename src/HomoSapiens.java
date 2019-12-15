interface HomoSapiens {
    public String sayOpionion();
}

class Journalist implements HomoSapiens {
    private int age;
    private int salary;
    private String surname;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String sayOpionion() {
        return "bla-bla-bla";
    }
}
