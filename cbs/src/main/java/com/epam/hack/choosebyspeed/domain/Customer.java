package com.epam.hack.choosebyspeed.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson(deepSerialize = true)
public class Customer {

    /**
     */
    @NotNull
    @Size(max = 30)
    private String name;

    /**
     */
    @Size(max = 50)
    private String email;

    /**
     */
    @Size(max = 50)
    private String phoneNumber;

    /**
     */
    @Size(max = 200)
    private String address;
}
