public interface IDatabase {
    void save();
}

class Database1 implements  IDatabase{

    @Override
    public void save() {



    }
}

class Database2 implements  IDatabase{

    @Override
    public void save() {
        // Hoa dang go~....
    }
}

class Mail{
    public static void display(IDatabase database) {
        System.out.println("xin chào");
    }

    public static void main(String[] args) {
        IDatabase iDatabase1 = new Database1();
        IDatabase iDatabase2 = new Database2();

        display(iDatabase1);
    }
}
