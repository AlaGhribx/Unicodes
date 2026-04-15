package project6;

public class Student {
    private int no;
    private String password ;
    private boolean loggedin ;
    private static int count = 1 ;
    private String name;
    private static String college = "IT"; //THIS ATTRIBUTS IS FOR ALL OBJECTS 
    private static int minimalpasswordlength = 6 ;
    public Student(String name) {
        this.no = count ;
        this.name = name;
        count++;
    }

    public Student (String name , String password){
        this.no = count ; 
        this.name = name ; 
        this.password = password ; 
        count++;
    }
    public boolean login(int enteredNo , String enteredPassword){
        if (enteredNo == no && enteredPassword.equals(password)) {
            loggedin = true ; 
            return true ;
        }else{
            return false ; 
        }
    }
    public static boolean validatepassword(String password){
        if(password.length() >= minimalpasswordlength){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "Student [no=" + no + ", name=" + name +", college ="+ college + "]";
    }


}
