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

class Programmist implements HomoSapiens {
   private String AgE;
   public int salary;

   public void setSurname(String surname) {
       if (surname.length < 4 || surname.length >= 10) {
           throw new TooLiberalSurnameException();
       }
       this.surname = surname;
   }

   public String sayOpionion() {
       throw new DoesNotMatterException();
   }
}
