# keycloak-admin-extension

This project is a keycloak extension to the enahance "/admin" API with custom rest resources and entities.

### Implementation
The interfaces listed below required to implemented in order to extend custom REST resource with **/admin** endpoint.
+ AdminRealmResourceProvider
+ AdminRealmResourceProviderFactory

The following Keycloak extension includes in the project.
- Custom entity - [UserAddressEntity](src/main/java/com/zyntaxmind/keycloak/admin/extension/entity/UserAddressEntity.java) to extend users address with the keycloak.
- Custom REST resources - [AdminRealmExtensionResource](src/main/java/com/zyntaxmind/keycloak/admin/extension/resource/AdminRealmExtensionResource.java) to extend resource path.
- Coustom SPI - [UserAddressSpi](src/main/java/com/zyntaxmind/keycloak/admin/extension/spi/UserAddressSpi.java) to provide custom SPI.

### Build
`./gradlew clean build`

### RUN
- Copy keycloak-admin-extension-0.0.1.jar inside build/libs folder into /opt/keycloak/providers in Keycloak server.
- Restart the keycloak server.

### TEST
Run below curl command to test the extended APIs.

`curl --location '${keycloak_host}/admin/realms/${realm}/ext/users/${user_id}/addresses' --header 'Content-Type: application/json' --header 'Authorization: Bearer ${access_token_with_admin_access}'`


