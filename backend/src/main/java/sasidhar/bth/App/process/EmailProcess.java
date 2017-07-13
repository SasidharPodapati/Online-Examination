package sasidhar.bth.App.process;

import sasidhar.bth.App.db.entity.Email;

import javax.ws.rs.core.Response;

public interface EmailProcess {

    Integer send(Email email);
}
