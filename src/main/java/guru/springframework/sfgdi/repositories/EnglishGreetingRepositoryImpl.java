package guru.springframework.sfgdi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    public EnglishGreetingRepositoryImpl() {

    }

    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
