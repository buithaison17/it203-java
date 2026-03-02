package petkingdom.interfaces;

import petkingdom.models.ServiceTicket;

public interface ISpaService {
    void takePet(ServiceTicket serviceTicket);

    ServiceTicket handlePet();
}