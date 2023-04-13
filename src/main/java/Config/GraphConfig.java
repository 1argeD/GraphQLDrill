//package Config;
//
//import graphql.schema.GraphQLScalarType;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.graphql.execution.RuntimeWiringConfigurer;
//
//
//@Configuration
//public class GraphConfig {
//    @Bean
//    public GraphQLScalarType Date() {
//        return ExtendedScalars.Date;
//    }
//
//    @Bean
//    public RuntimeWiringConfigurer runtimeWiringConfigurer(){
//        return WiringFactory -> WiringFactory.scalar(ExtendedScalars.Date);
//    }
//}
