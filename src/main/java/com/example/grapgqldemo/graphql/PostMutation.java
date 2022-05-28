package com.example.grapgqldemo.graphql;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.grapgqldemo.model.Post;
import com.example.grapgqldemo.service.PostService;

@Component
public class PostMutation implements GraphQLMutationResolver {
	private PostService service;
	
	public Post createPost(String Categories,
						   String gabariti,
						   String ves,
						   String proizvoditel,
						   String material,
						   String color,
						   Integer price) {
		return service.createPost(Categories, gabariti, ves,proizvoditel,material, color, price);
	}
}
