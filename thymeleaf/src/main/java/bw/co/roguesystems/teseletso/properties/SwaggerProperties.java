package bw.co.roguesystems.teseletso.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {
    private final String projectTitle;
    private final String projectDescription;
    private final String projectVersion;

    public SwaggerProperties(String projectTitle, String projectDescription, String projectVersion) {
        this.projectTitle = projectTitle;
        this.projectDescription = projectDescription;
        this.projectVersion = projectVersion;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

}
