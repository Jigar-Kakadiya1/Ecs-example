package ai.prama.ecs.models;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component
@Data
@RequiredArgsConstructor
public class UserEntity {

    String id = "1";
    String name = "Prama AI";
    String userName = "@prama";
    String email = "info@prama.ai";
    String pincode = "380015";

}
