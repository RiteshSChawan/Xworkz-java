class Labour {

    String name;
    double salary;
    String[] idProofs;


    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

        System.out.println("ID Proofs:");
        for(String id : idProofs) {
            System.out.println(id);
        }
        System.out.println();
    }
}