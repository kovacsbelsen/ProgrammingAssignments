public class Student {
    private String name;
    private int age;

    public Student(String name, int age)
    {
        setAge(age);
        this.name = name;
    }

        public String getName() {
            return name;
        }


        public int getAge() {
            return age;
        }

        public String toString() {
            String text = ("The name of the student is " + name +". The student is " + age + " years old.");
            return text;
        }

        public void setName(String newname) {
            this.name = newname;
        }

        public void setAge(int newage) {

            if (newage < 16)
            System.out.println("The university does not accept students below 16");

            else if (newage > 99)
            System.out.println("The university does not accept students that are older than 99");

            else
                age = newage;
        }
    
}
