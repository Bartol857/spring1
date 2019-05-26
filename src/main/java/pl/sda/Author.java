package pl.sda;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class Author implements Serializable {

    private String firstName;
    private String lastName;
}
