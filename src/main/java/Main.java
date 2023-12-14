public class Main {

    public static void main(String[] args) {
        CustomerRepo customerRepo = new CustomerRepo();
        customerRepo.creatCustomer(1,"Sviat","Schneider","123@test.de","017612783732","123 Street","Chicago","Ilinois","87878","United States");
        customerRepo.creatCustomer(2,"Jakob","Peter","897@mail.de","134614981","546 Street","Leipzig","Sachsen","30786","Deutschland");
        customerRepo.creatCustomer(3,"Peter","Lisa","675@mail.de","05126939231","789 Street","Berlin","Berlin","10156","Deutschland");
        customerRepo.creatCustomer(4,"Lisa","Schmidt","55448@mail.de","446846416","155 Street","Berlin","Berlin","10156","Deutschland");
        System.out.println(customerRepo.getAllCustomers());


    }
}
