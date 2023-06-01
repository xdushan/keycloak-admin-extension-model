/**
 * 
 */
package com.zyntaxmind.keycloak.admin.extension.model.representation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author dush
 *
 */
@JsonInclude(Include.ALWAYS)
public record UserAddressRepresentation(
    String id,
    String userId,
    String address1,
    String address2,
    String cityId,
    String postalCode,
    String state,
    String countryId,
    Double longitude,
    Double latitude
    ) {
}
