package com.springboot3.ch2.Services;

import com.springboot3.ch2.utils.Video;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {
    private List<Video> videos = List.of(new Video("Need help with your spring boot 3?"), new Video("Don't do this in your code."), new Video("Secrets to fix broken code!!"));

    public List<Video> getVideos() {
        return videos;
    }

    public Video create(Video newVideo) {
        List<Video> extend = new ArrayList<>(videos);
        extend.add(newVideo);
        this.videos = List.copyOf(extend);
        return newVideo;
    }
}
