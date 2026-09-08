class PersonCategory {
    public static void main(String[] args) {

        int age = 42;

        if (age < 3)
            System.out.println("Baby");
        else if (age <= 13)
            System.out.println("Child");
        else if (age <= 18)
            System.out.println("Teen");
        else if (age <= 40)
            System.out.println("Major");
        else if (age <= 60)
            System.out.println("Matured");
        else
            System.out.println("Senior Citizen");
    }
}