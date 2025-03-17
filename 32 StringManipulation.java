class StringManipulation {
    public static void main(String[] args) {
        String Firstname  = "bhojraj";
        String Surname =  "sahu";
        //System.out.printf(" hi, %S + %S , nice to see you again ",Firstname+Surname);
        String fullname ="hi "+ Firstname.concat( " ").concat(Surname);
        System.out.println(fullname.toUpperCase());
    }

}
