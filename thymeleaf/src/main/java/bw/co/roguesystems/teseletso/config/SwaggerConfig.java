package bw.co.roguesystems.teseletso.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @OpenAPIDefinition
// @ConditionalOnProperty(name = "security.config.openid-discovery", havingValue = "true")
@ConditionalOnProperty(name = "security.config.bearer", havingValue = "true")
public class SwaggerConfig {
    
    // private static final String OPEN_ID_SCHEME_NAME = "openId";
    // private static final String OPENID_CONFIG_FORMAT = "%s/realms/%s/.well-known/openid-configuration";

    // @Bean
    // OpenAPI customOpenApi(KeycloakProperties keycloakProperties) {
    //     return new OpenAPI()
    //             .components(new Components()
    //                     .addSecuritySchemes(OPEN_ID_SCHEME_NAME, createOpenIdScheme(keycloakProperties)))
    //             .addSecurityItem(new SecurityRequirement().addList(OPEN_ID_SCHEME_NAME));
    // }
 
    // private SecurityScheme createOpenIdScheme(KeycloakProperties properties) {
    //     String connectUrl = String.format(OPENID_CONFIG_FORMAT, properties.getAuthServerUrl(), properties.getRealm());
 
    //     return new SecurityScheme()
    //             .type(SecurityScheme.Type.OPENIDCONNECT)
    //             .openIdConnectUrl(connectUrl);
    // }

    // private static final String SCHEME_NAME = "bearerAuth";
    // private static final String SCHEME = "bearer";

    // @Bean
    // OpenAPI customOpenApi() {
    //     return new OpenAPI()
    //             .components(new Components()
    //                     .addSecuritySchemes(SCHEME_NAME, createBearerScheme()))
    //             .addSecurityItem(new SecurityRequirement().addList(SCHEME_NAME));
    // }
 
    // private SecurityScheme createBearerScheme() {
    //     return new SecurityScheme()
    //             .type(SecurityScheme.Type.HTTP)
    //             .scheme(SCHEME);
    // }
}
