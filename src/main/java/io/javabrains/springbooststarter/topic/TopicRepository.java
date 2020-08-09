package io.javabrains.springbooststarter.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

public interface TopicRepository extends CrudRepository<Topic,String> {
}
