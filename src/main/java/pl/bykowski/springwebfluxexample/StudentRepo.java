package pl.bykowski.springwebfluxexample;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StudentRepo extends ReactiveMongoRepository<Student, String> {
}
