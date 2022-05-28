package com.example.grapgqldemo.service;

import java.util.List;

import com.example.grapgqldemo.model.Post;

public interface PostService {
	public List<Post> getAllPosts();
	public Post getPost(long id);
	public Post createPost(String Categories,
						   String gabariti,
						   String ves,
						   String proizvoditel,
						   String material,
						   String color,
						   Integer price);
}
