package com.example.samaras;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;/*
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;*/
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.samaras.Models.Book;
import com.example.samaras.Repos.BookRepository;

//import jakarta.servlet.http.HttpServletResponse;

//import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
//@EnableWebSecurity
public class config {
	/*
	@Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/").permitAll();
                    auth.requestMatchers("/favicon.ico").permitAll();
                    auth.anyRequest().authenticated();
                })
                .oauth2Login(oauth2 -> oauth2.defaultSuccessUrl("/secured", true))
                //.oauth2Login(withDefaults())
                //.formLogin(withDefaults())
                .build();
    }*/
	/*
	@Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
        		.csrf(csrf -> csrf
                        .ignoringRequestMatchers("/books/addToFav")
                    )            
            .authorizeHttpRequests(auth -> {
                auth.requestMatchers("/").permitAll();    
                auth.requestMatchers("/books/myBooks").permitAll();                
                auth.requestMatchers("/books/**").permitAll(); 
                auth.anyRequest().authenticated();        
            }) 
            .oauth2Login(oauth2 -> oauth2
                .defaultSuccessUrl("http://localhost:5173/layout/home", true)
            )
            .exceptionHandling(ex -> ex
                    .authenticationEntryPoint(
                        (request, response, authException) ->
                        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED)

                    )
                )
            .build();
    }*/
	
	/*
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    return http
	        .csrf(csrf -> csrf.ignoringRequestMatchers("/books/**")) 
	        .authorizeHttpRequests(auth -> {
	            auth.requestMatchers("/").permitAll();
	            auth.requestMatchers(HttpMethod.POST, "/books/**").permitAll(); 
	            //auth.requestMatchers(HttpMethod.PATCH, "/books/**").permitAll();
	            auth.anyRequest().authenticated();
	        })
	        .oauth2Login(oauth2 -> oauth2
	                .defaultSuccessUrl("http://localhost:5173/layout/home", true) 
	            )
	        .exceptionHandling(ex -> ex
                    .authenticationEntryPoint(
                        (request, response, authException) ->
                        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED)
 
                    )
                )
	        .build();
	}

*/
    
	@Bean
	CommandLineRunner commandLineRunner(BookRepository bookRepository)
	{
		return args -> {
			Book b1 = new Book(
	                "Atomic Habits",
	                "James Clear",
	                "A practical guide on building good habits and breaking bad ones.",
	                "https://www.politeianet.gr/components/com_virtuemart/shop_image/product/ABF6067F15D3F7AD90AB9317FDCD9F91.jpg"	                
	            );

	            Book b2 = new Book(
	                "Essentialism",
	                "Greg McKeown",
	                "The disciplined pursuit of less — how to focus on what truly matters.",
	                "https://libris.to/media/jacket/33240985o.jpg"
	            	);

	            Book b3 = new Book(
	                "Getting Things Done",
	                "David Allen",
	                "The classic productivity system for managing tasks and achieving goals.",
	                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQ_SMhulCxZKETQtH0d7GkbvXbirw0HMbGow&s"
	            );

	            Book b4 = new Book(
	                "Think and Grow Rich",
	                "Napoleon Hill",
	                "A timeless self-help book about mindset, success and wealth creation.",
	                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEK3J1KpiVe0vCDQkrvxRx-PZ4AM2Rz94GPw&s"
	            );
	            
	            Book b5 = new Book(
	            	    "The Richest Man in Babylon",
	            	    "George S. Clason",
	            	    "Ancient financial wisdom and timeless principles for wealth-building.",
	            	    "https://cdn.kobo.com/book-images/9b641bf6-ae44-4c1e-aa2b-e57ca746eb82/1200/1200/False/the-richest-man-in-babylon-31.jpg"
	            	);

	            	Book b6 = new Book(
	            	    "The Intelligent Investor",
	            	    "Benjamin Graham",
	            	    "A classic on value investing and financial discipline.",
	            	    "https://cdn.kobo.com/book-images/4684126b-8238-46f1-86d4-f5d860450e22/1200/1200/False/the-intelligent-investor-rev-ed.jpg"
	            	);

	            	Book b7 = new Book(
	            	    "The Little Book That Beats the Market",
	            	    "Joel Greenblatt",
	            	    "Explains a simple formula for investing in undervalued companies.",
	            	    "https://www.evripidis.gr/datafiles/040100045414.jpg?width=433&height=650"
	            	);

	            	Book b8 = new Book(
	            	    "The Little Book of Common Sense Investing",
	            	    "John C. Bogle",
	            	    "A guide to investing in index funds for long-term success.",
	            	    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnWP7DXg6jfSBnR-3RfzCg0eLkOe31qiTdRg&s"	            	    
	            	);

	            	Book b9 = new Book(
	            	    "So Good They Can't Ignore You",
	            	    "Cal Newport",
	            	    "Why skills trump passion in the quest for work you love.",
	            	    "https://m.media-amazon.com/images/I/71KLTWMGdrL.jpg"
	            	);

	            	Book b10 = new Book(
	            	    "The Psychology of Money",
	            	    "Morgan Housel",
	            	    "Timeless lessons on wealth, greed, and happiness.",
	            	    "https://m.media-amazon.com/images/I/71g2ednj0JL._AC_UF1000,1000_QL80_.jpg"
	            	);

	            	Book b11 = new Book(
	            	    "Deep Work",
	            	    "Cal Newport",
	            	    "Rules for focused success in a distracted world.",
	            	    "https://cdn.kobo.com/book-images/ab39cb3a-7057-41e7-89a7-0d7901bdd7fe/1200/1200/False/deep-work-2.jpg"
	            	);

	            	Book b12 = new Book(
	            	    "Effortless",
	            	    "Greg McKeown",
	            	    "Make the essential things in life easier to do.",
	            	    "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1611550995i/54895700.jpg"
	            	);


	            bookRepository.save(b1);
	            bookRepository.save(b2);
	            bookRepository.save(b3);
	            bookRepository.save(b4);
	            bookRepository.save(b5);
	            bookRepository.save(b6);
	            bookRepository.save(b7);
	            bookRepository.save(b8);
	            bookRepository.save(b9);
	            bookRepository.save(b10);
	            bookRepository.save(b11);
	            bookRepository.save(b12);
	            
        };
	}
	
	
	
	
	
	
	
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                    .allowedOrigins("http://localhost:5173")
                    .allowedMethods("*")
                    .allowedHeaders("*")
                    .allowCredentials(true);
            }
        };
    }

	
	

}
