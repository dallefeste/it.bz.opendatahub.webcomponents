package it.bz.opendatahub.webcomponents.dataservice.data.dto;

import it.bz.opendatahub.webcomponents.dataservice.data.Dto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SpdxLicenseDto implements Dto {
    private String reference;

    private Boolean isDeprecatedLicenseId;

    private String detailsUrl;

    private String referenceNumber;

    private String name;

    private String licenseId;

    private List<String> seeAlso;

    private Boolean isOsiApproved;
}
