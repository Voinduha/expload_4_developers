package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/web.properties"
})
public interface WebConfig extends Config {

    @Key("username")
    String webUrl();

    @Key("remoteDriver")
    String webRemoteDriverUser();

    @Key("remotePassword")
    String webRemoteDriverPassword();
}
