package pl.sda;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter
public class Address implements Serializable {

    private String postalCode;
    private String city;
    private String street;


}
