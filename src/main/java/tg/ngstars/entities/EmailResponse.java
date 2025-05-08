package tg.ngstars.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailResponse {

    private String status;
    private String message;
}
