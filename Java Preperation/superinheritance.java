        class Parentclass
        {
            void display ()
            {
            System.out.println("Parent class method");
            }
        }

        class Subclass extends Parentclass
        {
            void display()
        {
        System.out.println("Child class method");
        }

            void printmsg()
            {
                display();
                super.display();
            }
    public static void main(String args []){
    Subclass obj= new Subclass ();
    obj.printmsg();
    }
}