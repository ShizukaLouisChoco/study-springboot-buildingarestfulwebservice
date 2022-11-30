package com.example.buildingarestfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
        private static final String template = "Hello, %s!";
        private final AtomicLong counter = new AtomicLong();

        @GetMapping("/greeting")
        //creates Greeting instance
        public Greeting greeting(@RequestParam(value = "name", defaultValue =  "World") String name){
            return new Greeting(counter.incrementAndGet(),String.format(template, name));
        }
}
//AtomicLongはLong型を持っているWrappingクラス。Thread-safeに実装されて、マルチスレッドでsynchronizedなく使用することができる。また、synchronizedよりも少ないコストで同時実行を保証する事ができる。https://codechacha.com/ja/java-atomic-long/#:~:text=AtomicLong%E3%81%AFLong%E5%9E%8B%E3%82%92,%E3%81%99%E3%82%8B%E3%81%93%E3%81%A8%E3%81%8C%E3%81%A7%E3%81%8D%E3%81%BE%E3%81%99%E3%80%82