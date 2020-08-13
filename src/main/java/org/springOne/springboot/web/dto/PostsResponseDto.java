package org.springOne.springboot.web.dto;

import lombok.Getter;
import org.springOne.springboot.domain.posts.Posts;

@Getter
public class PostsResponseDto {
    public Long id;
    public String title;
    public String content;
    public String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
