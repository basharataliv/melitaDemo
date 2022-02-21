package com.melita.demo.dto.req;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = OrderSubmitReq.class)
public class OrderSubmitReq {
    @NotNull(message = "personal details can not be null")
    private PersonalDetails personDetails;
    @NotNull(message = "installation address can not be null")
    private String installationAddress;
    private String preferredDateTime;
    @NotNull(message = "product can not be null")
    private String product;
    private String productPackage;
}
