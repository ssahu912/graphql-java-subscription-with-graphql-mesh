package com.example.sampleSubscription.resolver.query;

import com.example.sampleSubscription.model.RandomNumber;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RootQueryResolver implements GraphQLQueryResolver {
    public RandomNumber randomNumber(){
        return RandomNumber.builder().num1(new Random().nextInt(10)).num2(new Random().nextFloat()).build();
    }
}
