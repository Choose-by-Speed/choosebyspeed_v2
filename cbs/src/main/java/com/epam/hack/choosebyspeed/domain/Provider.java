package com.epam.hack.choosebyspeed.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ManyToOne;
import javax.persistence.Lob;
import org.springframework.roo.classpath.operations.jsr303.RooUploadedFile;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson(deepSerialize = true)
public class Provider {

    /**
     */
    @NotNull
    @Size(max = 30)
    private String name;

    /**
     */
    @ManyToOne
    private Category category;

    /**
     */
    private Float locationLat;

    /**
     */
    private Float locationLong;

    /**
     */
    @NotNull
    @Size(max = 300)
    private String imageUrl;

    /**
     */
    @RooUploadedFile(contentType = "image/jpeg")
    @Lob
    private byte[] image;

    /**
     */
    @NotNull
    @Size(max = 500)
    private String description;

    /**
     */
    @NotNull
    @Size(max = 500)
    private String phoneNumber;

    /**
     */
    @NotNull
    @Size(max = 500)
    private String menuHtml;
}
