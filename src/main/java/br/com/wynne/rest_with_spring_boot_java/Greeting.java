package br.com.wynne.rest_with_spring_boot_java;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(String content, long id) {
        this.content = content;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
