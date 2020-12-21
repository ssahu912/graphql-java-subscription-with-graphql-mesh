package com.example.sampleSubscription.resolver.subscription;

import com.example.sampleSubscription.model.RandomNumber;
import graphql.kickstart.tools.GraphQLSubscriptionResolver;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;

@Component
public class RootSubscriptionResolver implements GraphQLSubscriptionResolver {
    public Publisher<RandomNumber> randomNumberStream(){
        Flux<RandomNumber> flux = Flux.interval(Duration.ofSeconds(3)).map(num ->{
            return RandomNumber.builder()
                    .num1(new Random().nextInt(10))
                    .num2(new Random().nextFloat())
                    .build();
        });
        return flux;
    }
}
