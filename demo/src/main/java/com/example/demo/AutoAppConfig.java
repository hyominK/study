package com.example.demo;


import com.example.demo.discount.DiscountPolicy;
import com.example.demo.member.MemberRepository;
import com.example.demo.member.MemoryMemberRepository;
import com.example.demo.order.OrderService;
import com.example.demo.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
      //  basePackages = "hello.core",
      //  basePackageClasses = AutoAppConfig.class,
        excludeFilters =  @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    /*
    @Autowired MemberRepository memberRepository;
    @Autowired
    DiscountPolicy discountPolicy;

    @Bean
    OrderService orderService(MemberRepository memberRepository, DiscountPolicy discountPolicy){
        return new OrderServiceImpl(memberRepository, discountPolicy);
    }

    @Bean
    MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
    */

}
