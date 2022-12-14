package com.africa.semicolon.dtos.requests;

import lombok.*;


@Data
public class CreateCommentRequest {

    private  String postId;

    private String commenterName;


    private  String comment;
}
