package notification.Desirializers;


import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import notification.Dto.TestDto;


@Slf4j
public class KafkaValueDeserializer implements Deserializer<TestDto>{
	
	 private ObjectMapper objectMapper = new ObjectMapper();

	    @Override
	    public void configure(Map<String, ?> configs, boolean isKey) {
	    }

	    @Override
	    public TestDto deserialize(String topic, byte[] data) {
	        try {
	            return objectMapper.readValue(new String(data, "UTF-8"), TestDto.class);
	        } catch (Exception e) {
	            log.error("Unable to deserialize message {}", data, e);
	            return null;
	        }
	    }

	    @Override
	    public void close() {
	    }

}
