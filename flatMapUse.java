import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Customer {
    private String name;
    private List<String> phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "customer [name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }

    public Customer(String name, List<String> phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

public class flatMapUse {

    public static void main(String[] args) {
        List<Customer> li = new ArrayList<>();

        li.add(new Customer("Rmanti", Arrays.asList("91234658", "1245478")));
        li.add(new Customer("Sunny", Arrays.asList("124667895", "875165956")));

        List<String> newli = li.stream()
                               .flatMap(c -> c.getPhoneNumber().stream())
                               .collect(Collectors.toList());

        System.out.println(newli);
    }
}