package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean
    public Egg6 egg6(Needle7 needle) {
        return new Egg6(needle);
    }
    @Bean
    public Needle7 needle7(Deth8 deth) {
        return new Needle7(deth);
    }
    @Bean
    public Deth8 deth8() {
        return new Deth8();
    }

}
