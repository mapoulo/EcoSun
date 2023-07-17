package order.Configurations;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

//@Configuration
public class KafkaConfig {
//	  @Value("${spring.kafka.bootstrap-servers}")
//	    private String bootstrapServers = "localhost:9092";
//
//	    @Bean
//	    public Map<String, Object> producerConfig() {
//	        Map<String, Object> configs = new HashMap<>();
//	        configs.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
//	        configs.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//	        configs.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//
//	        return configs;
//	    }
//	    
//	    
//	    @Bean
//	    public ProducerFactory<String, String> producerFactory(){
//	    	return new DefaultKafkaProducerFactory<>(producerConfig());
//	    }
//
//	    @Bean
//	    public KafkaTemplate<String, String> kafkaTemplate(ProducerFactory<String, String> producerFactory) {
//	        return new KafkaTemplate<>(producerFactory);
//	    }

}
