package petkingdom.interfaces;

import petkingdom.models.Customer;

public interface IUserService {
    Customer findByPhone(String phone);
}
